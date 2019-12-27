package com.zzx.demo;

import org.springframework.stereotype.Component;

/**
 * @ClassName ReadBook
 * @Description
 * @Author zhangzx
 * @Date 2019/11/13 11:38
 * Version 1.0
 **/

@Component
public class ReadBook implements IBook
{
    @Override
    public void read() {
        System.out.println("读书");
    }

    public static void test() {
        System.out.println("测试");
    }
}
