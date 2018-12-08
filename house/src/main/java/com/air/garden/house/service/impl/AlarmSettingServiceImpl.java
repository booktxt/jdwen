package com.air.garden.house.service.impl;

import com.air.garden.house.mapper.AlarmSettingMapper;
import com.air.garden.house.model.AlarmSetting;
import com.air.garden.house.service.AlarmSettingService;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
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

    @Autowired
    private RabbitTemplate rabbitTemplate;

    //当启动缓存功能后,则不会再执行程序内的代码  所以只会发送一次消息

    @Override
    @Cacheable(value = "alarm_list", key = "#enterpriseId")
    //@CacheEvict(value = "alarm_list",allEntries = true)
    public List<AlarmSetting> listByEnterpriseId(Integer enterpriseId) {

        List<AlarmSetting> alarmSettingList = alarmSettingMapper.listByEnterpriseId(enterpriseId);

        rabbitTemplate.convertAndSend("air.garden.house", "air.garden", alarmSettingList);

        System.out.println();

        return alarmSettingList;
    }

    @Override
    public String getRabbitInfo() {

        try {
            Message receive = rabbitTemplate.receive("air-garden");
            if (null == receive) {
                return "not find";
            }
            return new String(receive.getBody(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }
}
