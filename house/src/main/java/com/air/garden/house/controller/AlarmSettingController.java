package com.air.garden.house.controller;

import com.air.garden.house.mapper.AlarmSettingMapper;
import com.air.garden.house.model.AlarmSetting;
import com.air.garden.house.service.AlarmSettingService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author wenjd
 * @date 2018/12/06
 */
@RestController
@RequestMapping("/alarm_setting")
public class AlarmSettingController {


    @Autowired
    private AlarmSettingMapper alarmSettingMapper;

    @Autowired
    private AlarmSettingService alarmSettingService;

    @PostMapping("/info")
    public String saveAlarmSetting() {

        AlarmSetting alarmSetting = new AlarmSetting();
        alarmSetting.setEnterpriseId(8000091);
        alarmSetting.setName("测试");
        alarmSetting.setDescription("个ii");
        alarmSetting.setValue("123");
        alarmSetting.setStatus(1);
        alarmSetting.setCreateTime(new Date());
        alarmSetting.setUpdateTime(new Date());
        alarmSetting.setType(2);
        alarmSetting.setExpression("dadadad");
        alarmSettingMapper.insertSelective(alarmSetting);
        return "ok";
    }


    @GetMapping("/alarm")
    public String getAlarmInfo() {
        List<AlarmSetting> alarmSettingList = alarmSettingService.listByEnterpriseId(8000091);

        String alarmInfo = JSONObject.toJSONString(alarmSettingList);
        return alarmInfo;
    }


}
