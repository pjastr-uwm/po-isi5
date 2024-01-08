package zad14;

public class TestArrayAlg {

    public static void main(String[] args) {
        Integer[] t1 = {4,-5,6,-34, -22};
        System.out.println(ArrayAlg.minValue(t1));
        String[] t2 = {"Ddd", "aaa", "Ąw"};
        System.out.println(ArrayAlg.minValue(t2));
        Person[] t3 = new Person[4];
        t3[0] = new Person("AA", 45);
        t3[1] = new Person("BB", 12);
        t3[2] = new Person("AA", 33);
        t3[3] = new Person("WW", 22);
        System.out.println(ArrayAlg.minValue(t3));
    }
}
