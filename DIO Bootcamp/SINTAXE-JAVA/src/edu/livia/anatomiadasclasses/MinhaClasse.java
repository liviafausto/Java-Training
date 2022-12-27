package edu.livia.anatomiadasclasses;
public class MinhaClasse {
    final String BR = "Brasil"; //variável toda maiúscula = imutável

    public static void main (String[] args){

        String primeiroNome = "Livia";
        String segundoNome = "Fausto";
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
