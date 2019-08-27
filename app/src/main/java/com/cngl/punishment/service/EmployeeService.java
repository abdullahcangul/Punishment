package com.cngl.punishment.service;

import com.cngl.punishment.entity.Employee;

public class EmployeeService {
    Employee employee;
    public EmployeeService(){
    employee=new Employee();
    }

    public Boolean login(String email, String pass){
        if(email.equals("email") && pass.equals("sifre")){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }


}
