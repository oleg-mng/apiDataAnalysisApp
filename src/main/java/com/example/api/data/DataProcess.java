package com.example.api.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author oleg-mng
 * version 0.0.1
 */

public class DataProcess {
    //подаем данные в виде строки на вход
    //при передаче можно осуществить проверку на null

    private static String s;

    public DataProcess(String s) {
        this.s = s;
    }

//    public Stream<Map.Entry<Character, Integer>> getMap() {
//        return countChar();
//    }

    public String getS() {
        return s;
    }

    //реализация метода подсчета количества повторений символов и передача данных в hashmap

    public Stream<Map.Entry<Character, Integer>> countChar() {
        StringBuffer strBuf = new StringBuffer(s);
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        for (int i = 0; i < strBuf.length(); i++) {
            int count = 0;
            i = 0;
            char t = strBuf.charAt(i);
            for (int j = i; j < strBuf.length(); j++) {
                if (strBuf.charAt(j) == t) {
                    strBuf.delete(j, j + 1);
                    count++;
                    j--;

                }
            }
            // кладем в map(ключ : символ; значение : количество повторений данного символа)
            hashMap.put(t, count);
        }

        //вывод полученной hashmap после сортировки
        System.out.println("\nвывод после подсчета и сортировки:");
        List<Map.Entry<Character, Integer>> sorted = new ArrayList<>(hashMap.entrySet());

        hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(x -> {
                    System.out.printf("%c : %d , ", x.getKey(), x.getValue());
                });

        return hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed());
    }
}
