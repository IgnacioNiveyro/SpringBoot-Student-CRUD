package com.example.demo.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DotenvConfig {

    @EventListener(ContextRefreshedEvent.class)
    public void loadDotenv() {
        Dotenv dotenv = Dotenv.configure().load();
        System.out.println("DATABASE_URL: " + dotenv.get("DATABASE_URL"));
        System.out.println("DATABASE_USERNAME: " + dotenv.get("DATABASE_USERNAME"));
        System.out.println("DATABASE_PASSWORD: " + dotenv.get("DATABASE_PASSWORD"));

        System.setProperty("DATABASE_URL", dotenv.get("DATABASE_URL"));
        System.setProperty("DATABASE_USERNAME", dotenv.get("DATABASE_USERNAME"));
        System.setProperty("DATABASE_PASSWORD", dotenv.get("DATABASE_PASSWORD"));
    }

}
