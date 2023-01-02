package com.example.network

import com.example.network.model.NetworkMealService
import retrofit2.http.GET
import retrofit2.http.Query

interface SchoolApi {
    @GET("mealServiceDietInfo")
    fun getMealService(
        @Query("KEY") key: String = BuildConfig.API_KEY,
        @Query("Type") type: String = "json",
        @Query("ATPT_OFCDC_SC_CODE") educationOfficeCode: String? = null,
        @Query("SD_SCHUL_CODE") educationOfficeName: String? = null
    ): NetworkMealService
}