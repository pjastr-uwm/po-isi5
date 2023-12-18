package kompartor.zad6;

import java.util.Comparator;

public class MyCompartor implements Comparator<Product> {
    @Override
    public int compare(Product obj1, Product obj2) {
        int base = Double.compare(obj1.getPrice(), obj2.getPrice());
        if (base!= 0)
            return base;
        return Integer.compare(obj1.getId(), obj2.getId());
    }
}
