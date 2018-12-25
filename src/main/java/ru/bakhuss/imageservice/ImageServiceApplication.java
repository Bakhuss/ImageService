package ru.bakhuss.imageservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;
import ru.bakhuss.imageservice.model.Image;
import ru.bakhuss.imageservice.service.ImageService;

import java.util.Scanner;

@SpringBootApplication
public class ImageServiceApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ImageServiceApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ImageServiceApplication.class, args);
    }
}
