package com.lolo.demo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author: gordon  Email:gordon_ml@163.com
 * @Date: 3/23/2020
 * @Description:
 * @version: 1.0
 */
@Component
public class TestScheduledService {

    @Scheduled(cron = "1/3 * * * * ?")
    public void func() {
        System.out.println("--> " + System.currentTimeMillis());
        System.out.println("======");
    }
}
