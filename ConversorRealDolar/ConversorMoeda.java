package ConversorRealDolar;

public class ConversorMoeda {
    public static void main(String[] args){
        String cotacao = "Olá.\nHoje, 23 de setembro de 2022, o dólar está cotado a R$5,12.";
        double valorDolar = 5.12;
        double quantiaEmReal = 42520.89;
        double conversao = quantiaEmReal / valorDolar;

        System.out.println(cotacao);
        System.out.printf("R$%.2f são US$%.2f.", quantiaEmReal, conversao);
    }
}
