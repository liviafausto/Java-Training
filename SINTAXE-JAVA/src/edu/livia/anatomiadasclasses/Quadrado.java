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

    public static void main(String[] arg){
        Quadrado quadrado1 = new Quadrado();
        quadrado1.lado = 12;

        double area = quadrado1.retornaArea();
        System.out.println(area);
    }
    
}