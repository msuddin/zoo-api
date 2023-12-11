package com.thetestroom.zooapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @PostMapping("/post-data")
    public String postData(@RequestBody String data) {
        return "Data received and sent to Elasticsearch!";
    }
}
