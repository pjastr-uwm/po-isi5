package kompartor.zad3;

import java.util.Comparator;

public class RokProdukcjiComparator implements Comparator<Samochod> {
    @Override
    public int compare(Samochod obj1, Samochod obj2) {
        return Integer.compare(obj1.getRokProdukcji(), obj2.getRokProdukcji());
    }
}
