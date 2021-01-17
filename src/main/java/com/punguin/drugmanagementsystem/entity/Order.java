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


    private String purchasingUnit;

    private String procurementStaff;

    private String shoppingTime;


}
