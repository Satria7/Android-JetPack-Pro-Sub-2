package com.satria.jpro.secondsubmission.data.source.remote.api

import com.satria.jpro.secondsubmission.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
//copyright satria junanda//
object ApiClient {

    private val httpClient = OkHttpClient.Builder().apply {

    }.build()


    private val retrofit: Retrofit.Builder by lazy {
        Retrofit.Builder().apply {
            client(httpClient)
            baseUrl(BuildConfig.BASE_URL_TMDB)
            addConverterFactory(GsonConverterFactory.create())
        }
    }


    val instance: ApiService by lazy {
        retrofit
            .build()
            .create(ApiService::class.java)
    }

}
//copyright satria junanda//