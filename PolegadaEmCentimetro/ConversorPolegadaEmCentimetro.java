package PolegadaEmCentimetro;

public class ConversorPolegadaEmCentimetro {
    public static void main(String[] args){
        double valorEmPolegada = 82;
        double valorEmCentimetro = valorEmPolegada * 2.54;

        System.out.printf("%s polegadas são %s centímetros.", valorEmPolegada, valorEmCentimetro);

    }
}
