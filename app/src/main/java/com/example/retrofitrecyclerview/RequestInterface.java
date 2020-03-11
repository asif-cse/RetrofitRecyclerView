package com.example.retrofitrecyclerview;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface RequestInterface {

    @GET("continents")
    Call<ArrayDataClass> getData(@Query("api_token")String token);
}
