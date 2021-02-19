package com.punguin.drugmanagementsystem.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 订单
 */
@Data
@Entity
@Table(name = "DRUG_ORDER")
public class Order {
    @Id
    @Column(length = 50)
    private String id;


    private String purchasingUnit;

    private String procurementStaff;

    private String shoppingTime;


}
