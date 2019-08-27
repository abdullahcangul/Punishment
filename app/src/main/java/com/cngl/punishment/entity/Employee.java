package com.cngl.punishment.entity;

import java.util.List;

import lombok.Data;

@Data
public class Employee {

    private Long id;

    private String name;

    private String surname;

    private String rutbe;

    private String password;

    private String email;

    private List<Punishment> punishments;
}
