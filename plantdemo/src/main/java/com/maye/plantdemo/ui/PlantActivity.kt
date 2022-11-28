package com.maye.plantdemo.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import com.maye.plantdemo.PlantViewModel
import com.maye.plantdemo.R
import com.maye.plantdemo.api.PlantService
import com.maye.plantdemo.bean.Plant
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.mapLatest

class PlantActivity: AppCompatActivity() {

    val plantViewModel: PlantViewModel = PlantViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plant_activity_home)

        plantViewModel.getAllPlant()
    }

}