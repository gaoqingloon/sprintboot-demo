package com.lolo.demo.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: gordon  Email:gordon_ml@163.com
 * @Date: 3/23/2020
 * @Description:
 * @version: 1.0
 */
@Mapper
@Repository
public interface TestDBDao {

    @Select("select * from `user` where id=#{id}")
    public List<Map> getDeptById(Integer id);
}
