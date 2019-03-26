package com.wg.whitegift.entity;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "policy")
public class MyPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Column(nullable = false, length = 30)
    private String policyType;
    @NotBlank
    @Column(nullable = false)
    private int holderId;
    @NotBlank
    @Column(nullable = false)
    private int benId;
    @NotBlank
    @Column(nullable = false)
    private Date insureDate;
    @NotBlank
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
    @NotBlank
    private Double sum;
    @NotBlank
    private String pic;
    @NotBlank
    private String evidence;
    @NotBlank
    @Column(nullable = false)
    private String detail;
    @NotBlank
    @Column(nullable = false)
    private int version;
    @NotBlank
    @Column(nullable = false)
    private Date update;
}
