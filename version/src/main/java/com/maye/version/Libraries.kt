package com.maye.version

object Libraries {

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofit_converter_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val retrofit_adapter_rxjava = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"

    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp3}"
    const val okio = "com.squareup.okio:okio:${Versions.okio}"
    const val okhttp_log = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp3}"


    const val view_model = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.0"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1"

}