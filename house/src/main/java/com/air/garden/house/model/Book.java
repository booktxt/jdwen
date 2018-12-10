package com.air.garden.house.model;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "air_garden", type = "book")
public class Book {

    private Integer id;
    private String name;
    private String author;

}
