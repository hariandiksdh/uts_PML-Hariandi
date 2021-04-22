package com.hariandi.myapplication.Service;

import com.hariandi.myapplication.Model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}