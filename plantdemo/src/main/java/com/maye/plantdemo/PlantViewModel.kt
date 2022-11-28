package com.maye.plantdemo

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.maye.plantdemo.api.PlantService
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class PlantViewModel: ViewModel() {

    fun getAllPlant() {
        viewModelScope.launch {
            PlantService().getAllPlants().collectLatest {
                Log.e("plantList", it.map { plant -> plant.name }.joinToString("、"))
            }
        }
    }


}