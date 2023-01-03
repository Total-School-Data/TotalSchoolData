package com.example.data

import com.example.model.MealService

interface SchoolRepository {
    suspend fun getMealService(
        educationOfficeCode: String,
        educationOfficeName: String
    ): List<List<MealService>>
}