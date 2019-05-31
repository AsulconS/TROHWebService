package com.aandb.troh;

import javax.annotation.PreDestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App
{
    private static ConfigurableApplicationContext context;
    
    public static void main(String[] args)
    {
        context = SpringApplication.run(App.class, args);
    }
    
    @PreDestroy
    public void onShutDown()
    {
        context.close();
        System.out.println("Closing safety");
    }
}
