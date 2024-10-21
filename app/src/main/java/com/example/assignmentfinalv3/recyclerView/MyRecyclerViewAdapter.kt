package com.example.assignmentfinalv3.recyclerView
// This is the recyclerView and all dependencies required to run the file
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmentfinalv3.R
import com.example.assignmentfinalv3.data.ResponseItem

//The recyclerviewAdapter it would be used to display all the ENTITIES in the code.

class MyRecyclerViewAdapter(private val dataList: MutableList<ResponseItem> = mutableListOf(), private val navigationFunction: (ResponseItem) -> Unit) : RecyclerView.Adapter<ResponseItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResponseItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout_restful_api_dev, parent, false)
        return ResponseItemViewHolder(view, navigationFunction = navigationFunction)
    }

    override fun onBindViewHolder(viewHolder: ResponseItemViewHolder, position: Int) {
        viewHolder.bind(dataList[position])
    }

    override fun getItemCount() = dataList.size

    fun setData(newDataList: List<ResponseItem>) {
        dataList.clear()
        dataList.addAll(newDataList)
        notifyDataSetChanged()
    }
}

