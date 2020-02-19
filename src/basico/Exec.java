package basico;

public class Exec {

    public static void main(String[] args) {
        //System.out.println("Eu sou um programador Java");
        int x = 5;
        int y = 10;

        int soma = somar(x, y);
        System.out.println("Soma: " + soma);

        double divisao = dividir(x, y);
        System.out.println("Divisão: " + divisao);

        imprimir("Avaí no Mundial 2022");
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static void imprimir(String frase) {
        System.out.println("A frase é: " + frase);
    }

}
