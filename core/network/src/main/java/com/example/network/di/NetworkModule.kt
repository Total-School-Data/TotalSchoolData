package com.example.network.di

import com.example.network.SchoolApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
interface NetworkModule {

    @Provides
    @Singleton
    fun providesMealServiceDietInfo(): SchoolApi {
        return Retrofit.Builder()
            .baseUrl("https://open.neis.go.kr/hub/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SchoolApi::class.java)
    }
}