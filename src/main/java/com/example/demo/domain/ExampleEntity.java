package com.example.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "example")
public class ExampleEntity {

    @Id
    private Long id;
}
