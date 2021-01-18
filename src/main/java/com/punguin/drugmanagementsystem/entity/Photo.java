package com.punguin.drugmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * 照片类（所有的照片的对应关系都存在这张表里）
 */
public class Photo {
    /**
     * 主键
     */
    @Id
    @Column(length = 50)
    private String id;

    /**
     * 关联的ID 暂时只有药品的
     */
    private String majorKey;

    /**
     * 照片存储在mongo里的id
     */
    private String photoId;

    /**
     * 药品的照片或者其他的照片（药品 1）
     */
    private String type;

    /**
     * 照片状态（是否被删除 0 未删除 1 删除）
     */
    private String status;
}
