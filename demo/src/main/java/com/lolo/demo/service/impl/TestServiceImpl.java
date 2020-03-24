package com.lolo.demo.service.impl;

import com.lolo.demo.Dao.HiveDao;
import com.lolo.demo.Dao.TestDBMapper;
import com.lolo.demo.Dao.TestDBMapperXml;
import com.lolo.demo.Dao.TestDao;
import com.lolo.demo.service.TestService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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


    @Autowired
    private TestDBMapper testDBDao;

    @Override
    public List<Map> getDeptById(Integer id) {
        return testDBDao.getDeptById(id);
    }

    @Override
    public List<Map> getStuById(Integer id) {
//        SqlSession session = sqlSessionFactory.openSession();
//        try {
//            ISalesDao sd = session.getMapper(TestDBMapperXml.class);
//            Sales sales = sd.getById(2);
//            assertNotNull(sales);
//            System.out.println(sales);
//        } finally {
//            session.close();
//        }
        return new ArrayList<Map>();
    }


    @Autowired
    private HiveDao hiveDao;

    @Override
    public void createTable() {
        hiveDao.createTable();
        System.out.println("----> create table done.");
    }

    @Override
    public void findAll(String tableName) {
        hiveDao.findAll(tableName);
    }

    @Override
    public void insert() {
        hiveDao.insert();
    }


}
