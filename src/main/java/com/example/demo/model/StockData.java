package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Setter
@Getter
@Document
public class StockData {
    @Id
    private String id;
    private String name;
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Long volumes;
    private Long date;

    @Override
    public String toString() {
        return "StockData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", open=" + open +
                ", high=" + high +
                ", low=" + low +
                ", close=" + close +
                ", volumes=" + volumes +
                ", date=" + date +
                '}';
    }
}
