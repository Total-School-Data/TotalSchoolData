package com.example.data

import com.example.model.MealService
import com.example.model.asMealService
import com.example.network.SchoolDataSource
import javax.inject.Inject

class SchoolRepositoryImpl @Inject constructor(var dataSource: SchoolDataSource): SchoolRepository {
    override suspend fun getMealService(
        educationOfficeCode: String,
        educationOfficeName: String
    ): List<List<MealService>> {
       return dataSource.getMealService(
            educationOfficeCode = educationOfficeCode,
            educationOfficeName = educationOfficeName
        ).mealServiceDietInfo.map {
            it.row.map { it2 ->
                it2.asMealService()
            }
       }
    }
}