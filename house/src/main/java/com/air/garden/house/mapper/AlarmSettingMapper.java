package com.air.garden.house.mapper;

import com.air.garden.house.common.BaseMapper;
import com.air.garden.house.model.AlarmSetting;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 告警设置项信息
 *
 * @author wenjd
 * @date 2018/12/06
 */
@Mapper
@Component("alarmSettingMapper")
public interface AlarmSettingMapper extends BaseMapper<AlarmSetting, Integer> {


}
