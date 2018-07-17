package com.mmall.test;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by 11318 on 2018/7/13.
 */
//**********解决精度丢失的问题***************
public class BigDecimalTest {
    @Test
    public void test1(){
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.015*100);
        System.out.println(123.3/100);
    }

    @Test
    public void test2(){
        BigDecimal b1=new BigDecimal(0.05);
        BigDecimal b2=new BigDecimal(0.01);
        System.out.println(b1.add(b2));
    }


    //BigDecimal方法一定要用String的构造器“”

    @Test
    public void test3(){
        BigDecimal b1=new BigDecimal("0.05");
        BigDecimal b2=new BigDecimal("0.01");
        System.out.println(b1.add(b2));
    }
}
