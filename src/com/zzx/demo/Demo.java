package com.zzx.demo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName Demo
 * @Description
 * @Author zhangzx
 * @Date 2019/11/13 11:37
 * Version 1.0
 **/
public class Demo {

//    private IBook iBook;

    private ReadBook readBook;

    public void doing() {
//        iBook = new ReadBook();
//        iBook.read();
        readBook.test();
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.doing();
    }
}
