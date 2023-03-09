package edu.livia.secao19.set.notes;

// Como usar as três diferentes classes que implementam Set

import java.util.*;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Product p1 = new Product("TV", 900.0);
        Product p2 = new Product("Tablet", 400.00);
        Product p3 = new Product("Laptop", 1200.00);

        // 1. HashSet
        Set<Product> hashSet = new HashSet<>();
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        // Os elementos não são ordenados
        System.out.println("HASH SET:");
        for(Product p : hashSet)
            System.out.println(p);
        // Realiza comparações com o hashCode e equals
        System.out.print("This set contains " + p1 + ": " + hashSet.contains(p1) + "\n");
        Product p4 = new Product("Laptop", 1150.0);
        System.out.print("This set contains " + p4 + ": " + hashSet.contains(p4) + "\n");
        System.out.println();


        // 2. Linked Hash Set
        Set<Product> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(p1);
        linkedHashSet.add(p2);
        linkedHashSet.add(p3);
        // Os elementos permanecem na ordem de inserção
        System.out.println("LINKED HASH SET:");
        for(Product p : linkedHashSet)
            System.out.println(p);
        System.out.println();


        // 3. Tree Set
        Set<Product> treeSet = new TreeSet<>();
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        // Os elementos são ordenados pelo Comparable<T>
        System.out.println("TREE SET:");
        for(Product p : treeSet)
            System.out.println(p);
        System.out.println();

    }
}
