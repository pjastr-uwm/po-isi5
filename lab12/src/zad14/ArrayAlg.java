package zad14;

public class ArrayAlg {

    public static <T extends Comparable<T>> T minValue(T[] array){
        if (array == null || array.length ==0){
            throw  new IllegalArgumentException("Tablica jest nullem lub jest pusta");
        }
        T temp = array[0];
        for(T elem: array){
            if (elem.compareTo(temp) <0){
                temp =elem;
            }
        }
        return temp;
    }
}
