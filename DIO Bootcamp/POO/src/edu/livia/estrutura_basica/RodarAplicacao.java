package edu.livia.estrutura_basica;

public class RodarAplicacao {

    public static void main(String args[]){
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Serie 3");
        carro1.setCapacidadeTanque(59);

        carro1.exibirAtributosCarro();
        double valorTanque = carro1.retornarValorTanque(5.05);
        System.out.println("Valor para encher o tanque: R$ " + valorTanque);

        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C", 66);
        
        carro2.exibirAtributosCarro();
        valorTanque = carro2.retornarValorTanque(5.05);
        System.out.println("Valor para encher o tanque: R$ " + valorTanque);

    }
    
}
