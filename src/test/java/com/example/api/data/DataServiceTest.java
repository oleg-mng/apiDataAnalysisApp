package com.example.api.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataServiceTest {

    @Test
    void getDataS() {
        DataService dataService = new DataService();
        assertNotNull(dataService.getDataS());
        assertNotNull(dataService.getHash());
    }

    @Test
    void getHash() {
        DataService dataService = new DataService();
        assertEquals("aaaaabcccc", dataService.getDataS());
        assertNotNull(dataService.getDataS());
        assertNotNull(dataService.getHash());
    }
}