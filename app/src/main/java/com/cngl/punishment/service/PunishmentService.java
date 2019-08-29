package com.cngl.punishment.service;

import android.content.Context;

import com.cngl.punishment.entity.Car;
import com.cngl.punishment.entity.Employee;
import com.cngl.punishment.entity.Human;
import com.cngl.punishment.entity.PunishmentType;

import java.util.List;

public class PunishmentService {

    private Context context;
    private Employee employee;

    public PunishmentService(Context context){
        this.context=context;

        employee=new Employee();
        employee.setEmail("kkk@gmail.com");
        employee.setPassword("1234");
        employee.setId(1l);
    }
    //Human
    //Car
    //ceza tipi

    public Human getHuman(String Tc){
        return null;
    }

    public Car getCar(String plaka){
        return null;
    }

    public List<PunishmentType> getPunishmemtType(String plaka){
        return null;
    }

    public Boolean addPunismentCar(){
        return null;
    }

    public Boolean addPunismentNormal(){
        return null;
    }

}
