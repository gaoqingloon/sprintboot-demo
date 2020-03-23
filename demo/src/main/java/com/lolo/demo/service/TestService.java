package com.lolo.demo.service;

import java.util.List;
import java.util.Map;

/**
 * @Author: gordon  Email:gordon_ml@163.com
 * @Date: 3/23/2020
 * @Description:
 * @version: 1.0
 */
public interface TestService {

    public List<Map> getTestInfo();

    public List<Map> getTestDBInfo();

    public List<Map> getDeptById(Integer id);
}
