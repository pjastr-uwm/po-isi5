package kopiowanie.zad19;

public class Engine implements Cloneable{

    private int power;
    private  String type;
    private String serialNumber;

    public Engine(int power, String type, String serialNumber) {
        this.power = power;
        this.type = type;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", type='" + type + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public Engine clone() throws CloneNotSupportedException{
        return (Engine) super.clone();
    }
}
