package kolekcje.E2;

import java.util.HashMap;
import java.util.HashSet;

public class TestE2 {

    public static void main(String[] args) {
        HashSet<Double> h1 = new HashSet();
        h1.add(1.2);
        h1.add(67.2);
        HashSet<Double> h2 = new HashSet<>();
        h2.add(1.2);
        h2.add(-22.3);
        Alg a1 = new Alg();
        System.out.println(a1.hasCommonElements(h1, h2));

    }
}
