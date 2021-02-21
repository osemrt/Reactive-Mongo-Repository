package com.example.demo.controller;

import com.example.demo.dto.StockDataDto;
import com.example.demo.dao.StockDataDao;
import com.example.demo.model.StockData;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

@RestController
@RequiredArgsConstructor
public class StockDataController {

    private StockDataDao stockDataDao;

    @Autowired
    public StockDataController(StockDataDao stockDataDao) {
        this.stockDataDao = stockDataDao;
    }

    @PostMapping
    public Mono<StockData> create(@RequestBody StockDataDto stockDataDto) {
        stockDataDto.setDate(new Date().getTime());
        return stockDataDao.save(stockDataDto.toEntity());
    }

    @GetMapping(value = "/")
    public Flux<StockData> getAllStocks() {
        return stockDataDao.findAll();
    }

    @PutMapping(value = "/{id}")
    public Mono<StockData> update(
            @PathVariable("id") String id,
            @RequestBody StockDataDto stockDataDto
    ) {
        return stockDataDao.update(id, stockDataDto.getName());
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable String id) {
        stockDataDao.deleteById(id).subscribe();
    }


}
