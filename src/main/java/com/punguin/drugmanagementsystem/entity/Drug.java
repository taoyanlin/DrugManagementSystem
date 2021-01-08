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
    private String 数量;

    //药品的首字母拼音
    private String 药品拼音;

    //药品每盒数量的单位 （颗、克、包）
    private String 单位;

    //药品生产厂家
    private String 生产厂家;

    //该药品的生产批次
    private String 生产批次;

    //该药品用于治疗什么疾病
    private String 疗效;

    //该药品的生产日期
    private String 生产日期;

    //该药品的保质期
    private String 有效期;

    //状态
    private String status;

}
