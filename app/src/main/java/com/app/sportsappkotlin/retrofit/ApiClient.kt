package com.app.sportsappkotlin.retrofit

import com.app.sportsappkotlin.retrofit.Response.ResponseGame
import retrofit2.Call
import retrofit2.http.*

interface ApiClient {

    @GET("nzin01312019187360.json")
    fun getGameData(): Call<ResponseGame>
    /*
    https://demo.sportz.io/sapk01222019186652.json
        https://demo.sportz.io/nzin01312019187360.json
    * */


}