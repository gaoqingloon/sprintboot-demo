package com.lolo.demo.service.impl;

import com.lolo.demo.Dao.TestDBDao;
import com.lolo.demo.Dao.TestDao;
import com.lolo.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: gordon  Email:gordon_ml@163.com
 * @Date: 3/23/2020
 * @Description:
 * @version: 1.0
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public List<Map> getTestInfo() {
        return testDao.getTestInfo();
    }

    @Override
    public List<Map> getTestDBInfo() {
        return testDao.getTestDBInfo(1);
    }


    @Autowired
    private TestDBDao testDBDao;

    @Override
    public List<Map> getDeptById(Integer id) {
        return testDBDao.getDeptById(id);
    }


}
