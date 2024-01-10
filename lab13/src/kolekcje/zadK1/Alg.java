package kolekcje.zadK1;

import java.util.HashMap;

public class Alg {

    public <K,V> HashMap<V, Integer> countValueOccurrences(HashMap<K, V> map){
        HashMap<V, Integer> temp = new HashMap<>();
        for(var values: map.values()){
            int counter = 0;
            for(var values2: map.values()){
                if (values.equals(values2)){
                    counter++;
                }
            }
            temp.put(values, counter);
        }
        return temp;
    }
}
