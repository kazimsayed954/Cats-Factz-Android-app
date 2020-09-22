package com.kazim.catsfactz

import com.kazim.catsfactz.api.RandomCatFacts
import retrofit2.Call
import retrofit2.http.GET

interface ApiRequests {
    @GET("/facts/random")
    fun getCatFacts(): Call<RandomCatFacts>
}