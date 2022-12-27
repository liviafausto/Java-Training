package edu.livia.list;

import java.util.Comparator;

/* Se os nomes dos gatos forem iguais, comparar por cor
* Se os nomes e as cores dos gatos forem iguais, comparar por idade
* */

public class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2){
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0){
            return nome;
        }

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0){
            return cor;
        }

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}