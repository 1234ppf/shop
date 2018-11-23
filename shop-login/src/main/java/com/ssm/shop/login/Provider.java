
package com.ssm.shop.login;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo/dubbo-login.xml"});
        context.start();
        System.out.println("provider start");
        System.in.read(); // press any key to exit
    }

}
