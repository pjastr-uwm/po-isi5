package kolekcje.zadL1;

import generyczna.zad29.Tree;

import java.util.TreeMap;

public class Algorithm {

    public <K extends Comparable<K>,V> TreeMap<K,V> subMapInRange(TreeMap<K,V> map, K stratKey, K endKey){
        TreeMap<K,V> temp = new TreeMap<>();
        for(var entry: map.entrySet()){
            K key = entry.getKey();
            if (key.compareTo(stratKey) >=0  && key.compareTo(endKey) <= 0){
                temp.put(key, entry.getValue());
            }
        }
        return temp;
    }
}
