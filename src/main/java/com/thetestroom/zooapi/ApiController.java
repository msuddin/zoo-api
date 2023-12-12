package com.thetestroom.zooapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ElasticsearchRestTemplate elasticsearchTemplate;

    @PostMapping("/post-data")
    public String postData(@RequestBody String data) {
        try {
            IndexQuery indexQuery = new IndexQueryBuilder()
                    .withSource(data)
                    .build();

            elasticsearchTemplate.index(indexQuery, IndexCoordinates.of("zoo-main"));

            return "Data received and sent to Elasticsearch!";
        } catch (Exception e) {
            // Handle exception
            return "Error processing data: " + e.getMessage();
        }
    }
}
