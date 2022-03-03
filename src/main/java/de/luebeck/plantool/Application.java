package de.luebeck.plantool;
import org.springframework.boot.SpringApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class Application implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}