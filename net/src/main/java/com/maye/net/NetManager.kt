package com.maye.net

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetManager {

    fun <T: Any> getService(baseUrl: String, clazz: Class<T>) : T {

        var retrofit: Retrofit? = null

        val okHttpClient = OkHttpClientFactory.getOkHttpClient()

        retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .build()

        return retrofit!!.create(clazz)
    }





}