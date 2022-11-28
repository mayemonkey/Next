package com.maye.net

import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

object OkHttpClientFactory {

    private const val TIME_OUT_READ = 10L
    private const val TIME_OUT_CONNECT = 10L

    fun getOkHttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()

        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BASIC
        builder.addInterceptor(httpLoggingInterceptor)

        return builder.retryOnConnectionFailure(true)
            .readTimeout(TIME_OUT_READ, TimeUnit.SECONDS)
            .connectTimeout(TIME_OUT_CONNECT, TimeUnit.SECONDS)
            .build()
    }


}