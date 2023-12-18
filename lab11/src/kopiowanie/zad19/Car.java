package kopiowanie.zad19;

public class Car implements Cloneable{

    private String make;
    private int model;

    private Engine engine;

    public Car(String make, int model, Engine engine) throws CloneNotSupportedException {
        this.make = make;
        this.model = model;
        this.engine = engine != null ? engine.clone() : new Engine(0, "","");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model=" + model +
                ", engine=" + engine +
                '}';
    }

    @Override
    public Car clone() throws CloneNotSupportedException{
        Car temp = (Car) super.clone();
        temp.engine = engine.clone();
        return temp;

    }

    public Engine getEngine() throws CloneNotSupportedException {
        return engine.clone();
    }
}
