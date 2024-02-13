package com.ramazan.redis.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Personel implements Serializable {
    private String personelName;
    private String personelSurname;
    private Integer personelLevel;
}
