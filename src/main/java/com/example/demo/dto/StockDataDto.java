package com.example.demo.dto;

import com.example.demo.model.StockData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockDataDto {
    private String id;
    private String name;
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Long volumes;
    private Long date;

    public StockData toEntity() {
        return StockData
                .builder()
                .id(id)
                .name(name)
                .open(open)
                .high(high)
                .low(low)
                .close(close)
                .volumes(volumes)
                .date(date)
                .build();
    }
}
