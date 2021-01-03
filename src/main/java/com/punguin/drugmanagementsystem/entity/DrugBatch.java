package com.punguin.drugmanagementsystem.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 批次与药品的关联表
 */
@Data
@Entity
@Table(name = "DRUG_BATCH")
public class DrugBatch {

    private String id;

    //药物ID
    private String drugId;

    //批次ID
    private String batchId;

    //药品数量
    private String num;

    //药品备注
    private String remark;

}
