package com.alibaba.dubbo.consumer;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by wy on 2017/4/13.
 */
public class Consumer {
    public static void main(String[] args) throws IOException {

        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer2 start");
        //DemoService demoService = context.getBean(DemoService.class);
        DemoService demoService = (DemoService)context.getBean("demoService");
        System.out.println("consumer2");
        System.out.println(demoService.getPermissions(1L));
    }
}
