import pl.edu.uwm.zad1.Person;

public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("Jan", "Nowak", 25);
        System.out.println(p1);
        Person p2 = new Person("Jan", null, 25);
        System.out.println(p1 == p2); // w Javie zawsze stary
        System.out.println(p1.equals(p2)); //nadalismy nowy sens
    }
}
