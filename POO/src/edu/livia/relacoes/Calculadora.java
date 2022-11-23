package edu.livia.relacoes;

public class Calculadora implements OperacaoMatematica {
    
    @Override
    public int soma(int num1, int num2){
        return num1+num2;
    }

    @Override
    public int multiplicacao(int num1, int num2){
        return num1*num2;
    }

    @Override
    public int subtracao(int num1, int num2){
        return num1-num2;
    }

    @Override
    public int divisao(int num1, int num2){
        return num1/num2;
    }
}
