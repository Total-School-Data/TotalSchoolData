package com.example.model

import com.example.network.model.NetworkMealService


fun NetworkMealService.MealServiceDietInfo.Row.asMealService(): MealService {
    return MealService(
        dishName = DDISH_NM,
        dishType = MMEAL_SC_NM,
        dishDate = MLSV_YMD
    )
}
//            MealService(
//                dishName = mealServiceDietInfo[0].row[0].DDISH_NM,
//                dishType = mealServiceDietInfo[0].row[0].MMEAL_SC_NM,
//                dishDate = mealServiceDietInfo[0].row[0].MLSV_YMD
//            )


