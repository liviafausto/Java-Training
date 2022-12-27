package edu.livia.metodos;

public class Usuario {
    
    public static void main(String[] args){
        SmartTv smartTv = new SmartTv();

        smartTv.exibirStatus();

        smartTv.ligar();
        smartTv.exibirStatus();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.exibirStatus();

        smartTv.mudarCanal(13);
        smartTv.exibirStatus();

        smartTv.desligar();
        smartTv.exibirStatus();
    }

}
