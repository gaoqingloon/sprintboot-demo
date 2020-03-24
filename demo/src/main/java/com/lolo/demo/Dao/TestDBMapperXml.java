package com.lolo.demo.Dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author: gordon  Email:gordon_ml@163.com
 * @Date: 3/24/2020
 * @Description:
 * @version: 1.0
 */
@Mapper
public interface TestDBMapperXml {

    public List<Map> getTestDBInfo(Integer id);
}
