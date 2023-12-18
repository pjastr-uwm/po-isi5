package kompartor.zad6;

import java.util.ArrayList;
import java.util.Collections;

public class TestProduct {

    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(5, "AA", 34.5));
        list.add(new Product(2, "BB", 11.5));
        list.add(new Product(3, "CC", 13.9));
        list.add(new Product(4, "DD", 22.9));
        list.add(new Product(1, "EE", 34.5));
        for(var elem:list){
            System.out.println(elem);
        }
        list.sort(new MyCompartor());
        System.out.println("After sorting");
        for(var elem:list){
            System.out.println(elem);
        }
    }
}
