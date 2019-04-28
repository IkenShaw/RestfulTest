package org.iken.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseMain {

    public static void main(String[] args) {
        System.out.println("application begin!");
        SpringApplication.run(DatabaseMain.class, args);
        System.out.println("application end!");
    }

}
