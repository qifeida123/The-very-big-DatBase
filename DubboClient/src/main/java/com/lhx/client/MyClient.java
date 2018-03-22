package com.lhx.client;
import com.lhx.service.SayHelloToClient;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by NewUser on 2018/3/20.
 */
public class MyClient {
    public void sayHello(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationConsumer.xml" });

        context.start();

        //获取服务器那边的bean
        SayHelloToClient demoService = (SayHelloToClient) context.getBean("demoService");

        System.out.println(demoService.sayHello("lisi"));
    }
}