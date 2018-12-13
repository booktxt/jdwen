package com.air.garden.house.mapper;

import com.air.garden.house.common.BaseMapper;
import com.air.garden.house.model.House;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 房屋信息
 *
 * @author wenjd
 * @date 2018/12/13
 */
@Mapper
@Component("houseMapper")
public interface HouseMapper extends BaseMapper<House, Integer> {


    List<House> listAll();

}
