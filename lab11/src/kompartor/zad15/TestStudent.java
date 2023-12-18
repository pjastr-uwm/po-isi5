package kompartor.zad15;

import java.util.ArrayList;

public class TestStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(345, "AA", 4.5));
        list.add(new Student(123, "AA", 4.2));
        list.add(new Student(678, "AA", 4.7));
        list.add(new Student(222, "AA", 4.1));
        list.add(new Student(567, "AA", 4.2));
        for(var elem:list){
            System.out.println(elem);
        }
        list.sort(new AvreageGradeComparator().thenComparing(new IdCompator()));
        System.out.println("After sorting");
        for(var elem:list){
            System.out.println(elem);
        }
    }
}
