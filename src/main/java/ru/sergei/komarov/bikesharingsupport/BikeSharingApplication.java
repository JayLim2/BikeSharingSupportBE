package ru.sergei.komarov.bikesharingsupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class BikeSharingApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(
                BikeSharingApplication.class,
                args
        );
        Environment environment = applicationContext.getEnvironment();

        System.out.println("\n\tWorking Directory = " + System.getProperty("user.dir"));

        String protocol = "http";
        if (environment.getProperty("server.ssl.key-store") != null) {
            protocol = "https";
        }

        System.out.println("\tHost: " + protocol + "://localhost:" + environment.getProperty("server.port") + "\n");

    }
}
