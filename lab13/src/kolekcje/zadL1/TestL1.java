package kolekcje.zadL1;

import generyczna.zad29.Tree;

import java.util.HashMap;
import java.util.TreeMap;

public class TestL1 {
    public static void main(String[] args) {
        TreeMap<String, Double> t1 = new TreeMap<>();
        t1.put("tt", 45.6);
        t1.put("AA", 12.4);
        t1.put("ĄĄ", 33.6);
        t1.put("55", 33.6);
        t1.put("cc", 45.6);
        System.out.println(t1);
        Algorithm a1 = new Algorithm();
        TreeMap<String , Double> result = a1.subMapInRange(t1, "MM", "tt");
        System.out.println(result);

    }
}
