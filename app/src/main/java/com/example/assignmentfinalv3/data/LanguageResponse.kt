package com.example.assignmentfinalv3.data

//The amount of entities that are contained in the API
data class LanguageResponse(
    val entities: List<Entity>,
    val entityTotal: Int
)