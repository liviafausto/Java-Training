package edu.livia.list.Ex02;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/** Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
 *
 * As perguntas são:
 * 1. "Telefonou para a vítima?"
 * 2. "Esteve no local do crime?"
 * 3. "Mora perto da vítima?"
 * 4. "Devia para a vítima?"
 * 5. "Já trabalhou com a vítima?"
 *
 * Se a pessoa responder positivamente a 2 questões, ela deve ser clasificada como "Suspeita". Entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso contrário, ela será classificada como "Inocente".
 */

public class Ex02 {

    public static void main(String args){
        Scanner scan = new Scanner(System.in);
        List<String> perguntas = new ArrayList<String>();

        //adicionando perguntas na lista
        perguntas.add(0, "Telefonou para a vitima?");
        perguntas.add(1, "Esteve no local do crime?");
        perguntas.add(2, "Mora perto da vitima?");
        perguntas.add(3, "Devia para a vitima?");
        perguntas.add(4, "Ja trabalhou com a vitima?");

        //exibir perguntas e ler resposta do usuário
        int count = 0, index = 0;
        for (String resposta : perguntas) {
            System.out.println(perguntas.get(index));

            resposta = scan.next();
            if(resposta.contains("sim")){
                count++;
            }

            index++;
        }

        //exibir classificação do usuário
        if(count < 2){
            System.out.println("Inocente");
        } else if(count < 3){
            System.out.println("Suspeita");
        } else if(count < 5){
            System.out.println("Cumplice");
        } else {
            System.out.println("Assassina");
        }

        scan.close();

    }
}