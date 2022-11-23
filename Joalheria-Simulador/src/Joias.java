package edu.livia.joalheria_simulador;

public class Joias {
    String nome;
    int quantidade;
    double precoCusto;
    double precoVenda;

    Joias(){

    }

    Joias(String nome, int quantidade, double precoCusto){
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoCusto = precoCusto;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    void setPrecoCusto(double precoCusto){
        this.precoCusto = precoCusto;
    }

    String getNome(){
        return nome;
    }

    int getQuantidade(){
        return quantidade;
    }

    double getPrecoCusto(){
        return precoCusto;
    }


    void calcularPrecoVenda(double margemLucro, double despesas, double imposto){
        margemLucro = precoCusto*margemLucro;
        despesas = precoCusto*despesas;
        imposto = precoCusto*imposto;
        
        precoVenda = precoCusto + margemLucro + despesas + imposto;
        //return precoVenda;
    }

    void exibirAtributosJoias(){
        System.out.println("------------------------");
        System.out.println(nome + " | " + quantidade);
        System.out.println("R$: " + precoVenda);
        System.out.println("------------------------");
    }

}
