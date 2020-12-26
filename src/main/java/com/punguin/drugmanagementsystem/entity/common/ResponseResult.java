package com.punguin.drugmanagementsystem.entity.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ASUS
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult<T> {
    private Integer state;
    private String message;
    private T data;
}
