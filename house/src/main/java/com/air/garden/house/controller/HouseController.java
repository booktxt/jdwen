package com.air.garden.house.controller;

import com.air.garden.house.common.ResponseModel;
import com.air.garden.house.model.House;
import com.air.garden.house.service.HouseService;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Response;

import java.util.List;

/**
 * @author wenjd
 * @date 2018/12/13
 */
@RestController
public class HouseController {


    @Autowired
    private HouseService houseService;

    @GetMapping("/houses")
    public ResponseModel listAllHouse() {

        List<House> houseList = houseService.listAll();

        return new ResponseModel(houseList);

    }

}
