package edu.livia.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaGatos {

    public static void main(String args[]) {
        List<Gato> meusGatos = new ArrayList<>(){{
           add(new Gato("Jon", 18, "preto"));
           add(new Gato("Simba", 6, "tigrado"));
           add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("--\tOrdem de Insercao\t--");
        System.out.println(meusGatos); //normalmente imprimiria os endereços de memória
        //para imprimir os objetos, foi criado um @Override na função "toString" da classe Gato

        System.out.println("--\tOrdem aleatoria\t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (Nome)\t--");
        Collections.sort(meusGatos); //organizado de acordo com o Comparable
        //foi utilizado o @Override na função "compareTo" do Comparable, para ordenar de acordo com os nomes
        System.out.println(meusGatos);

        //como o Comparable já foi usado, para que novas comparações possam ser realizadas
        //é necessário utilizar o Comparator
        System.out.println("--\tOrdem de Idade\t--");
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem de Cor\t--");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem: Nome-Cor-Idade\t--");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}