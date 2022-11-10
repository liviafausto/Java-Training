public class Quadrado {

    double lado;
    private static int quantidade = 0;

    public static int retornaQuantidade(){
        return quantidade;
    }

    public void calculaArea2(){
        double area = lado*lado;
        quantidade++;
    }
    
}