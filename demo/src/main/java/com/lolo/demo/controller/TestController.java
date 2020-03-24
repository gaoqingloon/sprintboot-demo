package com.lolo.demo.controller;

import com.lolo.demo.pojo.TestPojo;
import com.lolo.demo.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
//http://localhost:8080/swagger-ui.html
@RestController
@RequestMapping(value = "/test")
@Api(value = "用户操作接口")
public class TestController {

    //GET请求，从url获取单个参数
    @GetMapping(value = "/t1/{p1}")
    @ApiOperation(value = "t1")
    public List<Map> testFun(@PathVariable String p1) {
        System.out.println(p1);
        List<Map> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", "20");
        map.put("id", p1);
        list.add(map);
        return list;
    }


    //GET请求，获取url多个参数 ?xx=xxx&yy=yyy
    //http://localhost:8090/test/t2?id=1001&name=zhangsan
    @GetMapping(value = "/t2")
    @ApiOperation(value = "t2")
    public List<Map> testFunc2(@RequestParam String id, @RequestParam String name) {
        List<Map> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        map.put("age", "20");
        map.put("id", id);
        list.add(map);
        return list;
    }

    //POST请求，传单个参数
    //http://localhost:8090/test/t3
    @PostMapping(value = "t3")
    @ApiOperation(value = "t3")
    public List<Map> testFunc3(@RequestHeader String id) {
        List<Map> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("name", "test");
        map.put("age", "20");
        map.put("id", id);
        list.add(map);
        return list;
    }


    //POST请求，传多个参数，数据[{}]映射为一个pojo类
    //http://localhost:8090/test/t4
    /*
    {
      "id": 1001,
      "name": "zhangsan"
    }
     */
    @PostMapping("/t4")
    @ApiOperation(value = "t4")
    public List<Map> testFunc4(@RequestBody TestPojo pojo) {
        List<Map> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        map.put("name", pojo.getName());
        map.put("age", "20");
        map.put("id", pojo.getId().toString());
        list.add(map);
        return list;
    }


    @Autowired
    private TestService testService;

    //
    @GetMapping("/t5")
    @ApiOperation("t5")
    public List<Map> testFunc5() {
        System.out.println(testService.getTestInfo());
        //[{name=李四, id=1009, age=22}]
        return testService.getTestInfo();
    }

    //getDeptById
    @GetMapping("/t6/{id}")
    @ApiOperation("t6")
    public List<Map> testFunc6(@PathVariable("id") Integer id) {
        System.out.println(testService.getDeptById(id));
        //[{name=李四, id=1009, age=22}]
        return testService.getDeptById(id);
    }

    @GetMapping("/find/{tableName}")
    @ApiOperation("findTable")
    public void QueryTable(@PathVariable("tableName") String table) {
        testService.findAll(table);
    }

    @GetMapping("/create")
    @ApiOperation("createTable")
    public void createTable() {
        testService.createTable();
    }

    @GetMapping("/insert")
    @ApiOperation("insert")
    public void insert() {
        testService.insert();
    }

}
