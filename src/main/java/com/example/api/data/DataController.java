package com.example.api.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.stream.Stream;

@RestController
public class DataController {

    private DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping(path = "request")
    public String request() {
        return dataService.getDataS();
    }

    @GetMapping(path = "reply")
    public Stream<Map.Entry<Character, Integer>> reply() {
        return dataService.getHash();
    }

}

