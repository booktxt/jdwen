package com.air.garden.house.service.impl;

import com.air.garden.house.mapper.AlarmSettingMapper;
import com.air.garden.house.model.AlarmSetting;
import com.air.garden.house.service.AlarmSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 告警设置实现
 *
 * @author wenjd
 * @date 2018/12/07
 */
@Service
public class AlarmSettingServiceImpl implements AlarmSettingService {


    @Autowired
    private AlarmSettingMapper alarmSettingMapper;

    @Override
    @Cacheable(value = "alarm_list",key = "#enterpriseId")
    public List<AlarmSetting> listByEnterpriseId(Integer enterpriseId) {
        return alarmSettingMapper.listByEnterpriseId(enterpriseId);
    }
}
