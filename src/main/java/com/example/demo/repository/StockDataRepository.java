package com.example.demo.repository;

import com.example.demo.model.StockData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockDataRepository extends ReactiveMongoRepository<StockData, String> {
}
