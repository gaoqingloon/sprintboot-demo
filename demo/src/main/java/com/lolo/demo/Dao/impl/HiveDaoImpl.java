package com.lolo.demo.Dao.impl;

import com.lolo.demo.Dao.HiveDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: gordon  Email:gordon_ml@163.com
 * @Date: 3/24/2020
 * @Description:
 * @version: 1.0
 */
@Repository
public class HiveDaoImpl implements HiveDao {

    @Autowired
    JdbcTemplate hiveJdbcTemplate;

    @Override
    //@PostConstruct
    public void createTable() {
        StringBuffer sql = new StringBuffer();
        sql.append("create table IF NOT EXISTS default.hive_test ");
        sql.append("(id BIGINT comment '主键ID',");
        sql.append("name STRING  comment '姓名') ");
        sql.append("ROW FORMAT DELIMITED FIELDS TERMINATED BY '\t' ");
        sql.append("STORED AS TEXTFILE");
        System.out.println(sql.toString());
        hiveJdbcTemplate.execute(sql.toString());
    }

    @Override
    public void findAll(String tableName) {
        String sql="select * from default." + tableName;
        List<Map<String, Object>> maps = hiveJdbcTemplate.queryForList(sql);
        System.out.println(maps);
        System.out.println("---> findAll done.");
    }

    @Override
    public void loadData(String path) {
        String sql = "LOAD DATA INPATH '" + path + "' INTO TABLE default.hive_test";
        hiveJdbcTemplate.execute(sql);
    }

    @Override
    public void insert() {
        String sql = "INSERT INTO TABLE default.hive_test values(2,'lisi')";
        hiveJdbcTemplate.execute(sql);
        System.out.println("---> insert done.");
    }

    @Override
    public void deleteAll() {

    }
}
