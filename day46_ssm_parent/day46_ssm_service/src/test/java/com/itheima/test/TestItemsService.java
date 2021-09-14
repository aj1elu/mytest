package com.itheima.test;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestItemsService {

    @Test
    public void testFindAll(){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-service.xml");

        ItemsService is = context.getBean(ItemsService.class);

        System.out.println(is.findAll());

    }


    @Test
    public void testSave(){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-service.xml");

        ItemsService is = context.getBean(ItemsService.class);

        Items item = new Items();
        item.setName("人工智能");

        is.save(item);

    }
}