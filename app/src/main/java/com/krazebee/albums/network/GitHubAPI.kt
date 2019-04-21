package com.krazebee.albums.network
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GitHubAPI {
    @GET("/search/users")
    fun searchUser(@Query("q") query: String): Call<Album>
}