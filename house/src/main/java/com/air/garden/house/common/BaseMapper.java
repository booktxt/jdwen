package com.air.garden.house.common;

/**
 * 基础模板接口
 *
 * @author wenjd
 * @date 2018/12/06
 */
public interface BaseMapper<T, ID> {

    /**
     * 保存对象,对字段选择性保存
     *
     * @param o
     * @return
     */
    Integer insert(T o);

    /**
     * 保存对象,对字段选择性保存，当某字段为null时，此字段不保存
     *
     * @param o
     * @return
     */
    Integer insertSelective(T o);

    /**
     * 更新对象
     *
     * @param o
     * @return
     */
    Integer updateByPrimaryKey(T o);

    /**
     * 更新对象,对字段选择性更新，当某字段为null时，此字段不更新
     *
     * @param o
     * @return
     */
    Integer updateByPrimaryKeySelective(T o);

    /**
     * 获取指定的唯一标识符对应的对象
     *
     * @param id
     * @return
     */
    T selectByPrimaryKey(ID id);

    /**
     * 删除指定的唯一标识符对应的持久化对象
     *
     * @param id
     * @return
     */
    Integer deleteByPrimaryKey(ID id);


}
