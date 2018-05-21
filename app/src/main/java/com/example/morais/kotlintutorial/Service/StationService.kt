package com.example.morais.kotlintutorial.Service

import com.example.morais.kotlintutorial.Model.Station
import retrofit2.Call
import retrofit2.http.GET

class StationService (val BASE_URL:String = "http://meteoroserver.herokuapp.com/api/"){

    interface StationAPI{
        @GET("stations")
        fun getResults(): Call<List<Station>>;
    }

}