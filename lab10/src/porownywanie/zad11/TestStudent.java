package porownywanie.zad11;

import java.util.Arrays;

public class TestStudent {

    public static void main(String[] args) {
        Student[] tab = new Student[4];
        tab[0] =  new Student("Jan", 3.2, 3);
        tab[1] =  new Student("Anna", 3.2, 2);
        tab[2] =  new Student("Sylwia", 2.4, 1);
        tab[3] =  new Student("Krzysztof", 5.0, 4);
        for(var elem: tab){
            System.out.println(elem);
        }
        System.out.println("After sort");
        Arrays.sort(tab);
        for(var elem: tab){
            System.out.println(elem);
        }
    }
}
