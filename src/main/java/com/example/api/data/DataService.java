package com.example.api.data;

import com.example.api.data.DataProcess;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Stream;

@Service
public class DataService {
    private DataProcess dataProcess = new DataProcess("aaaaabcccc");

    public String getDataS() {
        return dataProcess.getS();
    }

    public Stream<Map.Entry<Character, Integer>> getHash() {
        return dataProcess.countChar();
    }
}
