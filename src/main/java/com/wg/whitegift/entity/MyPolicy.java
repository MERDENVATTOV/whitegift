package com.wg.whitegift.entity;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
@Data
@Entity
@Table(name = "policy")
public class MyPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Column(nullable = false, length = 30)
    private String policyType;

    @Column(nullable = false)
    private int holderId;

    @Column(nullable = false)
    private int benId;

    @Column(nullable = false)
    private Date insureDate;

    @Column(nullable = false)
    private Date insurePer;
    @NotBlank
    @Column(nullable = false, length = 60)
    private String departure;
    @NotBlank
    @Column(nullable = false, length = 60)
    private String destination;
    @NotBlank
    @Column(nullable = false, length = 90)
    private String service;
    @NotBlank
    @Column(nullable = false, length = 10)
    private String currencyType;

    private Double totalPrice;
    @NotBlank
    private String pic;
    @NotBlank
    private String evidence;
    @NotBlank
    @Column(nullable = false)
    private String detail;

    @Column(nullable = false)
    private int version;

    @Column(nullable = false)
    private Date renewarry;
}
