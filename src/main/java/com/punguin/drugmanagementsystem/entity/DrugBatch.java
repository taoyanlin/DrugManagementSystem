package com.punguin.drugmanagementsystem.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 批次与药品的关联表
 */
@Data
@Entity
@Table(name = "DRUG_BATCH")
public class DrugBatch {

    @Id
    @Column(length = 50)
    private String id;

    //药物ID
    private String drugId;

    //批次ID
    private String batchId;

    //药品数量
    private String num;

    //该批次药品的生产日期
    private String productionDate;

    //药品备注
    private String remark;

}
