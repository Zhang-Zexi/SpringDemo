package com.zzx.proxy;

/**
 * @ClassName MyCalculatorImpl
 * @Description 定义计算机接口的实现
 * @Author zhangzx
 * @Date 2019/12/27 12:02
 * Version 1.0
 **/
public class MyCalculatorImpl implements MyCalculator {
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
