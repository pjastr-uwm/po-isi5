package pl.edu.uwm.zad15;

public class TestProperty {

    public static void main(String[] args) {
        Property p1 = new Property("Olsztyn", 23, 234005);
        Property p2 = new Property("Olsztyn", 23, 234005);
        Property p3 = new Property("Olsztyn", 645, 234005);
        Property p4 = new Property(null, 23, 234005);
        Property p5 = new Property(new String("Olsztyn"), 23, 234005);
        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        House h1 = new House("Olsztyn", 23, 234005, 5);
        House h2 = new House("Olsztyn", 23, 234005, 5);
        House h3 = new House("Olsztyn", 645, 234005, 5);
        House h4 = new House("Olsztyn", 23, 234005, 6);
        House h5 = new House(new String("Olsztyn"), 23, 234005, 5);
        System.out.println(p1.equals(h1));
        System.out.println(h1.equals(p1));
        System.out.println(h1.equals(h1));
        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
        System.out.println(h1.equals(h4));
        System.out.println(h1.equals(h5));
    }


}
