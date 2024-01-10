package kolekcje.zadK1;

import java.util.HashMap;

public class TestK1 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("AA", 56);
        map.put("77", 11);
        map.put("kk", 22);
        map.put("tt", 22);
        map.put("rr", 78);
        map.put("ll", 22);
        System.out.println(map);
        Alg a1 = new Alg();
        HashMap<Integer, Integer> results = a1.countValueOccurrences(map);
        System.out.println(results);
    }
}
