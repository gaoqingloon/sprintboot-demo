package com.lolo.demo.Dao;

import java.util.List;
import java.util.Map;

/**
 * @Author: gordon  Email:gordon_ml@163.com
 * @Date: 3/23/2020
 * @Description:
 * @version: 1.0
 */
public interface TestDao {

    public List<Map> getTestInfo();

    public List<Map> getTestDBInfo(Integer id);
}
