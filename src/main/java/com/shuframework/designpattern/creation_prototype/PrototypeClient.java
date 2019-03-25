package com.shuframework.designpattern.creation_prototype;

import org.junit.Test;

import java.util.Date;

public class PrototypeClient {

    @Test
    public void test(){
        Date date = new Date();
        MyResume r1 = new MyResume("小明", date, "男");
        r1.setWork("1", "xx公司");

        //复制
        MyResume r2 = null;
        MyResume r3 = null;
        try {
            r2 = (MyResume)r1.clone();
            r2.setName("小王"); //克隆后 单独修改不影响其他类
            r2.setBirthday(new Date(12334342312133L));//克隆后 单独修改不影响其他类

            r3 = (MyResume)r1.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //直接修改对象的值时 会导致克隆的对象数据一起改变
        date.setTime(15334342312133L);

//        MyResume{name='小明', age='23', sex='男', timeArea='1', company='xx公司'}
//        MyResume{name='小王', age='23', sex='男', timeArea='1', company='xx公司'}
//        MyResume{name='小明', age='23', sex='男', timeArea='1', company='xx公司'}
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }

}
