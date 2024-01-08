package zad13;

import java.util.Arrays;

public class Test13 {

    public static void main(String[] args) {
        Integer[] t1 = new Integer[0];
        reverseArray(t1);
        System.out.println(Arrays.toString(t1));
        Integer[] t2 = {4,-5,11,23};
        reverseArray(t2);
        System.out.println(Arrays.toString(t2));
        String[] t3 = {"sded", "df", "55", "g45", "FFF"};
        reverseArray(t3);
        System.out.println(Arrays.toString(t3));
    }

    public static <T> void reverseArray(T[] array){
        if (array==null)
            throw new IllegalArgumentException("Tablica jest nullem");
        for(int i=0;i< array.length/2;i++){
            T temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }
}
