package com.air.garden.house.model;

import lombok.Data;

import java.util.Date;

/**
 * 告警设置项
 *
 * @author wenjd
 * @date 2018/12/06
 */
@Data
public class AlarmSetting {


    private Integer id;

    private Integer enterpriseId;

    private String name;

    private String description;

    private String value;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Integer type;

    private String expression;


}
