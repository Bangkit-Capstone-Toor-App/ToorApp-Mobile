package com.kamil.toorapp_mobile.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("api/listChoices/{id}")
    fun getDestination(
        @Path("id") id: String
    ): Call<ResponseDestination>
}