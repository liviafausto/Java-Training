package edu.livia.anatomiadasclasses;
public class Quadrado {

    double lado;
    private static int quantidade = 0;

    public static int retornaQuantidade(){
        return quantidade;
    }

    public double retornaArea(){
        double area = lado*lado;
        quantidade++;
        return area;
    }
    
}