package com.punguin.drugmanagementsystem.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 批次类
 */
@Data
@Entity
@Table(name = "BATCH")
public class Batch {
    @Id
    @Column(length = 50)
    private String id;

    //批次时间
    private String time;

    //该批次总共有多少种药品
    private String amount;

    //供货商
    private String supplier;

    //批次备注
    private String remark;
}
