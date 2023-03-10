package edu.livia.secao19.map.notes;

// Como utilizar Map e seus métodos em Java

import java.util.*;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Map<Integer, String> map = new HashMap<>();
        map.put(8001, "TV");
        map.put(8002, "Tablet");
        map.put(8003, "Laptop");

        Set<Integer> keys = map.keySet();
        Collection<String> values = map.values();

        System.out.println("MAP:");
        for(Integer k : keys){
            System.out.println("key=" + k + ", value=" + map.get(k));
        }
        System.out.println();

        System.out.println("NUMBER OF ELEMENTS: " + map.size());
        System.out.println();

        System.out.print("SET OF KEYS: ");
        for(Integer k : keys){
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println();

        System.out.print("COLLECTION OF VALUES: ");
        for(String v : values){
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Removed element: " + map.remove(8002));
        System.out.println("'Tablet' still exists: " + map.containsValue("Tablet"));
        System.out.println();

        // If the same key with a different value is added again
        System.out.println("Key '8001' had value: " + map.get(8001));
        map.put(8001, "Phone");
        System.out.println("Key '8001' now has value: " + map.get(8001));
        System.out.println();
        // The old value is lost

        System.out.println("MAP:");
        for(Integer k : keys){
            System.out.println("key=" + k + ", value=" + map.get(k));
        }
        System.out.println();

        map.clear();
        System.out.println("Map was just cleared: " + map.isEmpty());
    }
}
