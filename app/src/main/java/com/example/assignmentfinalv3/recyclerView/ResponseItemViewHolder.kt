package com.example.assignmentfinalv3.recyclerView

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmentfinalv3.R
import com.example.assignmentfinalv3.data.ResponseItem

// Purpose Response Item View Holder file:
// - Takes Response IItem object and display properties (Name,Family,Branch,Speakers,WritingSystem,Details,Button)
// - Visibility for available descriptions (If not hide the button)
// - Navigation to Details Fragment when clicked "Show Data"

// ViewHolder class to bind the data to the RecyclerView item
class ResponseItemViewHolder(
    itemView: View,
    private val navigationFunction: (ResponseItem) -> Unit // Lambda function for navigation
) : RecyclerView.ViewHolder(itemView) {

    // View references for some reason this way this code works.
    private val nameTextView: TextView = itemView.findViewById(R.id.itemNametext)
    private val familyTextView: TextView = itemView.findViewById(R.id.itemIdText)
    private val branchTextView: TextView = itemView.findViewById(R.id.itemYeartext)
    private val speakersTextView: TextView = itemView.findViewById(R.id.itemMediumtext)
    private val writingSystemTextView: TextView = itemView.findViewById(R.id.detailsText)
    private val navigationButton: Button = itemView.findViewById(R.id.navigationButton)

    // Bind data to views
    fun bind(responseItem: ResponseItem) {
        // Set text for name, family, branch, and speakers
        nameTextView.text = responseItem.name
        familyTextView.text = "Family: ${responseItem.family}"
        branchTextView.text = "Branch: ${responseItem.branch}"
        speakersTextView.text = "Speakers: ${responseItem.speakers}"

        // Check if description is available to show writing system and button
        val showDetails = if (responseItem.description.isNullOrEmpty()) View.INVISIBLE else View.VISIBLE
        // Show or hide "More details" text
        writingSystemTextView.visibility = showDetails
        // Show or hide navigation button
        navigationButton.visibility = showDetails

        // Set click listener only if details are available
        if (showDetails == View.VISIBLE) {
            navigationButton.setOnClickListener {
                navigationFunction(responseItem) // Navigate to details screen
            }
        }
    }
}
