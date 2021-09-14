package com.itheima.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    自定义类型转换器
        1. 定义类，实现接口Converter
        2. 实现接口的时候，有两个泛型，这两个泛型: S 和 T
            S：对应的是 Source ，接收到的源数据的类型
            T： 对应的是 Target , 想要转到成的目标类型

        3. 实现方法
 */
public class DateConverter implements Converter<String, Date> {
    /**
     * 转化数据
     * @param source 从页面接收到的字符串数据   2020-10-10
     * @return date日期对象
     */
    public Date convert(String source) {
        System.out.println("皮肤发布时间：" + source);

        try {
            //1.定义simpleDateFormat对象
            SimpleDateFormat df = null;
            if (source.contains("-")){
                df = new SimpleDateFormat("yyyy-MM-dd");
            }else if (source.contains("/")){
                df = new SimpleDateFormat("yyyy/MM/dd");
            }

            //2.开始转化
            return df.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
