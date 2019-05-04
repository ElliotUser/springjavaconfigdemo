package ru.ricksanchez;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ru.ricksanchez")
public class AppConfig {
    @Bean
    public MessageRenderer renderer(){
        return new MessageRendererErrorImpl(message());
    }

    @Bean
    public Message message(){
         return new HelloMessage("Hello");
     }

}
