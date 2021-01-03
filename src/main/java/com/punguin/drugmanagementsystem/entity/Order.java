package com.punguin.drugmanagementsystem.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 订单
 */
@Data
@Entity
@Table(name = "ORDER")
public class Order {
    private String id;


    private String 采购单位;

    private String 采购人员;

    private String 采购时间;


}
