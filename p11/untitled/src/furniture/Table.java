package furniture;

public class Table {

    private double cena;

    private Table(double cena){
        this.cena = cena;
    }

    public static Table create(double cena){
        return new Table(cena);
    }
}
