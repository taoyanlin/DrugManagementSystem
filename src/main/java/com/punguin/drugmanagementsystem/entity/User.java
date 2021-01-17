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

    //登录名
    private String username;
    //密码
    private String password;
    //创建日期
    private String createdDate;
    //邮箱
    private String email;
    //姓名
    private String name;
    //年龄
    private Integer age;

}
