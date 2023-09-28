package com.example.api.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataControllerTest {

    @Test
    void request() {
        DataProcess dataProcessTest = new DataProcess("aaaaabcccc");
        dataProcessTest.getS();
        assertEquals("aaaaabcccc", dataProcessTest.getS());

    }

    @Test
    void reply() {
        DataProcess dataProcessTest = new DataProcess("aaaaabcccc");
        assertNotEquals(null, dataProcessTest.getS());
    }

}