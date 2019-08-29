package com.cngl.punishment.Api;

import com.cngl.punishment.entity.LoginEmployee;


import retrofit2.Call;
import retrofit2.http.GET;

public interface EmployeeApi {

    @GET("/login")
    Call<LoginEmployee> loginEmployee();

}
