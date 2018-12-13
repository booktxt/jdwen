package com.air.garden.house.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 自定义展示实体属性
 *
 * @author wenjd
 * @date 2018/12/13
 */
@Data
public class House implements Serializable {

    private Integer id;

    /**
     * 小区名
     */
    private String name;

    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String description;

    /**
     * 住址
     */
    private String address;

    /**
     * 单价
     */
    private Double unitPrice;

    /**
     * 大小（单位 平方米）
     */
    private Double size;

    /**
     * 总价
     */
    private Double totalPrice;


    private Integer status;

    /**
     * 来源
     */
    private String source;


    private Date createTime;

    private Date updateTime;


    private Integer type;

}
