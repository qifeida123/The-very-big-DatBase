package com.lhx.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by NewUser on 2018/3/20.
 */
public class MyMain {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationProvider.xml" });

        context.start();
        System.out.println("按任意键退出");
        System.in.read();

    }
}