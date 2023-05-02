package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Componentscan(basepackages="org.example")
public class AppConfig {
    @Bean
    public  Samsung getPhone()
    {
        return new Samsung();
    }

    @Bean
    public MobileProcessor getprocessor()
    {
        return new Snapdragon();

    }



}
