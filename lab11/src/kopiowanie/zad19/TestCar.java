package kopiowanie.zad19;

public class TestCar {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car c1 = new Car("AA", 34, new Engine(34, "BB", "CC"));
        Car c2 = c1.clone();
        System.out.println(c1);
        System.out.println(c2);

    }
}
