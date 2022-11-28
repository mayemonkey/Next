package com.maye.plantdemo.api

import com.maye.net.NetManager
import com.maye.plantdemo.bean.Plant
import io.reactivex.Flowable
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.supervisorScope
import kotlinx.coroutines.withContext
import retrofit2.http.GET

class PlantService {

    private val plantService = NetManager.getService("https://raw.githubusercontent.com/", FlowService::class.java)

    suspend fun getAllPlants(): Flow<List<Plant>> {
        return flow {
            emit(plantService.getAllPlants())
        }
    }

}

interface FlowService {

    @GET("googlecodelabs/kotlin-coroutines/master/advanced-coroutines-codelab/sunflower/src/main/assets/plants.json")
    suspend fun getAllPlants(): List<Plant>


}