package com.air.garden.house.service.impl;

import com.air.garden.house.mapper.HouseMapper;
import com.air.garden.house.model.House;
import com.air.garden.house.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wenjd
 * @date 2018/12/13
 */
@Service
public class HouseServiceImpl implements HouseService {


    @Autowired
    private HouseMapper houseMapper;

    @Override
    public House getById(Integer id) {
        return houseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<House> listAll() {
        return houseMapper.listAll();
    }
}
