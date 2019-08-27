package com.cngl.punishment.entity;

import java.time.LocalDateTime;

public class Punishment {
    private String faturaNo;
    private String yer;
    private LocalDateTime FatureKesimTarihi;

    private Human human;

    private Car car;

    private Employee employee;

    private PunishmentType punishmentType;
}
