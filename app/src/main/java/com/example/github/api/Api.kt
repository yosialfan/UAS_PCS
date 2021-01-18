    package com.example.github.api

import com.example.github.data.model.DetailUserResponse
import com.example.github.data.model.User
import com.example.github.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
   // @Headers("Authorization: token 079839bdc42afd1e8a7e626874410613a934d86d")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
   // @Headers("Authorization: token 079839bdc42afd1e8a7e626874410613a934d86d")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
   // @Headers("Authorization: token 079839bdc42afd1e8a7e626874410613a934d86d")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
   // @Headers("Authorization: token 079839bdc42afd1e8a7e626874410613a934d86d")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>

}