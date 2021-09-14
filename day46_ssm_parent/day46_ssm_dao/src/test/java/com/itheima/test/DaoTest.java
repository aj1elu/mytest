package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class DaoTest {

    @Test
    public void testFindAll(){
        //1. 创建工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");

        //2.问工厂要对象
        ItemsDao dao = context.getBean(ItemsDao.class);

        //3.调用方法
        System.out.println(dao.findAll());
    }

    @Test
    public void testDao() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = (ItemsDao)applicationContext.getBean("itemsDao");
        System.out.println("商品列表：：："+itemsDao.findAll());

        Items items = new Items();
        items.setName("商品名称");
        items.setPrice(16666f);
        items.setCreatetime(new Date());
        itemsDao.save(items);
    }
}
