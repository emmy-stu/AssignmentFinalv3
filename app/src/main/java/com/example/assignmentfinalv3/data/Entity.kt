package com.example.assignmentfinalv3.data

//In this data class, this is what the languages entity contains
data class Entity(
    val name: String,
    val family: String,
    val branch: String,
    val speakers: Int,
    val writingSystem: String,
    val officialIn: String,
    val description: String
)