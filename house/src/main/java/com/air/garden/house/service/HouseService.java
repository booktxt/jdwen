package com.air.garden.house.service;

import com.air.garden.house.model.House;

import java.util.List;

/**
 * @author wenjd
 * @date 2018/12/13
 */
public interface HouseService {

    /**
     * 根据id获取对象
     *
     * @param id
     * @return
     */
    House getById(Integer id);

    /**
     * 获取所有对象
     *
     * @return
     */
    List<House> listAll();

}
