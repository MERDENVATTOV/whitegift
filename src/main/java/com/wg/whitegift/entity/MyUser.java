package com.wg.whitegift.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "user")
public class MyUser<userState> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(Long creditCard) {
        this.creditCard = creditCard;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotBlank
    @Column(nullable = false, length = 30)
    private String firstName;
    @NotBlank
    @Column(nullable = false, length = 30)
    private String lastName;
    @NotBlank
    @Column(nullable = false, unique = true, length = 60)
    private String email;
    @NotBlank
    @Column(length = 5)
    private String gender;
    @NotBlank
    @Column(nullable = false, unique = true)
    private Long creditCard;
    @NotBlank
    private Date birth;
    @NotBlank
    @Column(nullable = false, length = 60)
    private String nationality;
    @NotBlank
    @Column(nullable = false, unique = true, length = 30)
    private String idNo;
    @NotBlank
    @Column(nullable = false, length = 90)
    private String address;
    @NotBlank
    @Column(nullable = false, unique = true, length = 20)
    private String phone;
    @NotBlank
    @Column(nullable = false, length = 30)
    private String password;

}
