package edu.livia.joalheria_simulador;

public class RodarSimulacao {
    
    public static void main(String args[]){
        Joias anel = new Joias("Anel de prata flores", 2, 32);

        anel.calcularPrecoVenda(1.0, 0.1, 0.3);
        anel.exibirAtributosJoias();
        
    }
}
