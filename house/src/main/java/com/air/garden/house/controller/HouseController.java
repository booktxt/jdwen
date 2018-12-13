package com.air.garden.house.controller;

import com.air.garden.house.common.ApiResponseResult;
import com.air.garden.house.common.HttpStatus;
import com.air.garden.house.common.ResponseResult;
import com.air.garden.house.model.House;
import com.air.garden.house.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseResult listAllHouse() {

        List<House> houseList = houseService.listAll();

        return ResponseResult.success(houseList);

    }

}
