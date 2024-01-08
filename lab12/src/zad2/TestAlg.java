package zad2;

public class TestAlg {

    public static void main(String[] args) {
        Alg a1 = new Alg();
        System.out.println(a1.isEquals(4,5));
        System.out.println(a1.isEquals(4,4));
        System.out.println(a1.isEquals(1.2,1.1+0.1));
        System.out.println(a1.isEquals(1.2,1.2));
        System.out.println(a1.isEquals("Hello", "Hello"));
    }
}
