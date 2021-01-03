package com.punguin.drugmanagementsystem.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ASUS
 * 用户信息（个人信息）
 */
@Data
@Entity
@Table(name = "USER")
public class User {

    @Id
    @Column(length = 50)
    private String id;

    private String username;

    private String password;

    private String createdDate;

    private String email;

    private String name;

    private Integer age;

}
