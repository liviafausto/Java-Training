package edu.livia.metodos;

public class SmartTv {
    //estado inicial para a Smart TV
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void exibirStatus(){
        System.out.println("TV LIGADA - " + ligada);

        if(ligada == true){
            System.out.println("Canal: " + canal + " | Volume: " + volume);
        }
    }

}
