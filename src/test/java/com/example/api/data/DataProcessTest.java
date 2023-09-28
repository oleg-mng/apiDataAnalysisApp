package com.example.api.data;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DataProcessTest {


    @Test
    void getS() {
        DataProcess dataProcessTest = new DataProcess("aaaaabcccc");
        if (dataProcessTest.getS() != null) {
            assertEquals("aaaaabcccc", dataProcessTest.getS());

        }
        assertNotNull(dataProcessTest.getS());
        assertNotNull(dataProcessTest.countChar());
        assertNotEquals(null, dataProcessTest.countChar());

    }

    @Test
    void countChar() {
        DataProcess dataProcessTest = new DataProcess("aaaaabkk");
        if (dataProcessTest.getS() != null) {
            assertEquals("aaaaabkk", dataProcessTest.getS());
        }
        assertNotNull(dataProcessTest.getS());
    }
}