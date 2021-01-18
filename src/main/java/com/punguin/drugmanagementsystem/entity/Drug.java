package com.punguin.drugmanagementsystem.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 药品类
 */
@Data
@Entity
@Table(name = "DRUG")
public class Drug {
    private String id;

    //药品照片（考虑有多个照片的情况，暂时先定义这个参数，之后统一存放到照片的多对多表中）
    private byte[] drugPhoto;

    //药品名称
    private String drugNames;

    //药品每盒数量
    private String quantity;

    //药品的首字母拼音
    private String pinyinName;

    //药品每盒数量的单位 （颗、克、包）
    private String unit;

    //药品生产厂家
    private String manufacturer;

    //该药品的生产批次
    private String productionBatch;

    //该药品用于治疗什么疾病
    private String curativeEffect;

    //该药品的生产日期
    private String productionDate;

    //该药品的保质期
    private String validPeriod;

    //状态（0 为删除 1为存在）
    private String status;

}
