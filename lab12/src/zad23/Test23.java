package zad23;

public class Test23 {

    public static void main(String[] args) {
        Pair<Animal> p1 = new Pair<>(new Animal(), new Animal());
        System.out.println(findMax(p1));
        Pair<Dog> d1 = new Pair<>(new Dog(), new Dog());
        System.out.println(findMax(d1));
        Pair<Animal> p2 = new Pair<>(new Dog(), new Dog());
        System.out.println(findMax(p2));

    }

    public static Animal findMax(Pair<? extends Animal> arg){
        return arg.getFirst();
    }
}
