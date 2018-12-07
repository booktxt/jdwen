package com.air.garden.house.service;

import com.air.garden.house.model.AlarmSetting;

import java.util.List;

/**
 * 告警设置
 *
 * @author wenjd
 * @date 2018/12/07
 */
public interface AlarmSettingService {


    List<AlarmSetting> listByEnterpriseId(Integer enterpriseId);

    String getRabbitInfo();

}
