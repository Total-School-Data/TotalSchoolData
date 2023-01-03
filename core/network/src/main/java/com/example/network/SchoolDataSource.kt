package com.example.network

import com.example.network.model.NetworkMealService

interface SchoolDataSource {
    suspend fun getMealService(
        educationOfficeCode: String? = null,
        educationOfficeName: String? = null
    ): NetworkMealService
}