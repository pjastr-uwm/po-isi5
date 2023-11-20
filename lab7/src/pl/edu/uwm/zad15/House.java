package pl.edu.uwm.zad15;

public class House extends Property{

    private int numerofFloors;

    public House(String address, int size, double price, int numerofFloors) {
        super(address, size, price);
        this.numerofFloors = numerofFloors;
    }

    public int getNumerofFloors() {
        return numerofFloors;
    }

    public void setNumerofFloors(int numerofFloors) {
        this.numerofFloors = numerofFloors;
    }

    @Override
    public String toString() {
        return super.toString()+","+numerofFloors;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        House house = (House) o;

        return numerofFloors == house.numerofFloors;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numerofFloors;
        return result;
    }
}
