package com.cngl.punishment.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.cngl.punishment.Api.EmployeeApi;
import com.cngl.punishment.config.RetrofitConfig;
import com.cngl.punishment.entity.Employee;
import com.cngl.punishment.entity.LoginEmployee;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EmployeeService {
    EmployeeApi employeeApi;
    Employee employee;
    Context context;
   // SharedPreferences sharedPref = context.getSharedPreferences("sharedPref",Context.MODE_PRIVATE);

    public EmployeeService(Context context){
        this.context=context;

        employee=new Employee();
        employee.setEmail("kkk@gmail.com");
        employee.setPassword("1234");
        employee.setId(1l);

    }

    public Boolean login(final String email,final String pass){


        return Boolean.TRUE;
    }

   /* public Boolean login2(final String email,final String pass){

        employeeApi= RetrofitConfig.getClient().create(EmployeeApi.class);

        Call<LoginEmployee> call=employeeApi.loginEmployee();
        final Boolean[] sonuc = new Boolean[1];
        call.enqueue(new Callback<LoginEmployee>() {
            @Override
            public void onResponse(Call<LoginEmployee> call, Response<LoginEmployee> response) {
                LoginEmployee loginEmployee=response.body();

                if(loginEmployee.getIsLogin()){
                    if(email.equals(employee.getEmail()) && pass.equals(employee.getPassword())){
                        SharedPreferences.Editor editor = sharedPref.edit(); //SharedPreferences'a kayıt eklemek için editor oluşturuyoruz
                        editor.putLong("employeeId",employee.getId()); //int değer ekleniyor
                        editor.commit();
                        sonuc[0] = Boolean.TRUE;
                    }else{
                        sonuc[0] =Boolean.FALSE;
                    }
                }else{
                    Toast.makeText(context,"Kullanıcı adı veya parola hatalı",Toast.LENGTH_LONG);
                    sonuc[0] =Boolean.FALSE;
                }

            }

            @Override
            public void onFailure(Call<LoginEmployee> call, Throwable t) {
                Toast.makeText(context, "baglantı hası olustu", Toast.LENGTH_SHORT).show();
                sonuc[0] =Boolean.FALSE;
            }
        });
       return sonuc[0];
    }*/


}
