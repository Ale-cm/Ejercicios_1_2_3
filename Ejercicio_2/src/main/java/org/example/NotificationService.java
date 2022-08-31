package org.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService() {
        System.out.println("Buenos días");
    }
    public void saludo(){
        System.out.println("Buenos Días Señor");
    }
}
