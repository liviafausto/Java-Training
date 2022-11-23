package edu.livia;

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    //Métodos construtores
    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //Gets e sets
    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    //Métodos de negócio
    double retornaValorTanque(double valorCombustivel){
        return valorCombustivel*capacidadeTanque;
    }

}
