package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService sa1= (UserService) context.getBean("userService");

        sa1.notificationService.saludo();

    }
}