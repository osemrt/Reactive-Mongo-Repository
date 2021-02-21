package com.example.demo.dao;

import com.example.demo.model.StockData;
import com.example.demo.repository.StockDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class StockDataDao {

    private final StockDataRepository stockDataRepository;

    public Mono<StockData> save(StockData stockData) {
        return stockDataRepository.save(stockData);
    }

    public Flux<StockData> findAll() {
        return stockDataRepository.findAll();
    }

    public Mono<Void> deleteById(String id) {
        return stockDataRepository.deleteById(id);
    }


    public Mono<StockData> update(String id, String name) {
        Mono<StockData> persistedStockData = stockDataRepository.findById(id);
        return persistedStockData.flatMap(
                value -> {
                    value.setName(name);
                    return Mono.just(value);
                }
        ).flatMap(stockDataRepository::save);
    }
}
