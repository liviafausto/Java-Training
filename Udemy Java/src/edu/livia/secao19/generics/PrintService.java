package edu.livia.secao19.generics;

// Exemplo 1: Como usar o Generics em uma classe

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    List<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }

    public T first(){
        if(list.isEmpty())
            throw new IllegalStateException("List is empty");

        return list.get(0);
    }

    public void print(){
        System.out.print("[");
        if(!list.isEmpty()){
            System.out.print(first());
            for(int i=1; i<list.size(); i++)
                System.out.print(", " + list.get(i));
        }
        System.out.print("]\n");
    }

}
