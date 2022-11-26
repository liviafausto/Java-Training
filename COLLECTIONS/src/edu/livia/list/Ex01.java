package edu.livia.list;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/*
Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Ex01 {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();
        List<String> meses = new ArrayList<String>(Arrays.asList("Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho"));

        double soma = 0;

        //receber a temperatura média dos 6 primeiros meses do ano
        for(int i=0; i<6; i++){
            System.out.println("Temperatura de " + meses.get(i) + ":");
            double temp = scan.nextDouble();
            temperaturas.add(temp); //armazenar em uma lista
            soma = soma + temp;
        }

        //calcular média semestral das temperaturas
        double media = soma/6;
        System.out.printf("Media das temperaturas: %.1f", media);
        //método da professora:
        //double media = temperaturas.stream().mapToDouble(Double::doubleValue).average().orElse(0d);


        //mostrar quais as temperaturas acima da média semestral, e quando elas ocorreram
        System.out.println("\nTemperaturas acima da media:");
        for(int i=0; i<temperaturas.size(); i++){
            if(temperaturas.get(i) > media){
                System.out.println(meses.get(i) + " - " + temperaturas.get(i));
            }
        }

        //método da professora:
        //temperaturas.stream().filter(t -> t>media).forEach(t -> System.out.printf("%.1f ", t));


        scan.close();
    }

}