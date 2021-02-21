package com.example.demo.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ReactiveMongoRepositoryConfiguration {

    public @Bean
    MongoClient mongoClient() {
        return MongoClients.create();
    }
}
