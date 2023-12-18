package kopiowanie.zad1;

public class TestStudent {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Jan", 22, 4.0);
        Student s2 = s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        s1.setGrade(3.0);
        System.out.println(s1);
        System.out.println(s2);
    }
}
