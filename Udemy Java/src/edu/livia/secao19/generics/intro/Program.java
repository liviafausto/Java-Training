package edu.livia.secao19.generics.intro;

// Exemplo 1: Como usar o Generics em uma classe

public class Program {
    public static void main(String[] args){
        PrintService<String> names = new PrintService<>();
        names.addValue("Maria");
        names.addValue("Paulo");
        names.addValue("Julia");

        PrintService<Integer> numbers = new PrintService<>();
        numbers.addValue(6);
        numbers.addValue(13);
        numbers.addValue(105);

        System.out.println("First: " + names.first());
        names.print();
        System.out.println();
        System.out.println("First: " + numbers.first());
        numbers.print();

    }
}
