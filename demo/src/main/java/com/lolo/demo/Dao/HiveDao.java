package com.lolo.demo.Dao;

import java.util.List;
import java.util.Map;

/**
 * @Author: gordon  Email:gordon_ml@163.com
 * @Date: 3/24/2020
 * @Description:
 * @version: 1.0
 */
public interface HiveDao {

    public void createTable();

    public void findAll(String tableName);

    public void loadData(String path);

    public void insert();

    public void deleteAll();
}
