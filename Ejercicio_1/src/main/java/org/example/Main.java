package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Saludo sa1= (Saludo) context.getBean("saludo");

        sa1.imprimirSaludo();
        Saludo sa12= (Saludo) context.getBean("saludo1");
        sa12.imprimirSaludo();

    }
}