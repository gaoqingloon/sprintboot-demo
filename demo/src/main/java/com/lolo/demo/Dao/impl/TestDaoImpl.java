package com.lolo.demo.Dao.impl;

import com.lolo.demo.Dao.TestDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: gordon  Email:gordon_ml@163.com
 * @Date: 3/23/2020
 * @Description:
 * @version: 1.0
 */
@Repository
public class TestDaoImpl implements TestDao {

    @Override
    public List<Map> getTestInfo() {
        List<Map> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("name", "李四");
        map.put("age", "22");
        map.put("id", "1009");
        list.add(map);
        return list;
    }

    @Override
    public List<Map> getTestDBInfo(Integer id) {
        return null;
    }

}
