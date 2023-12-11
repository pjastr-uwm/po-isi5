package porownywanie.zad1;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Anna", 4.8, 2002));
        list.add(new Student("Sylwia", 4.2, 2017));
        list.add(new Student("Krzysztof", 4.8, 2010));
        list.add(new Student("Zenon", 4.9, 1994));
        list.add(new Student("Joanna", 4.1, 2011));
        for (var elem: list){
            System.out.println(elem);
        }
        Collections.sort(list);
        System.out.println("After sort");
        for (var elem: list){
            System.out.println(elem);
        }
    }
}
