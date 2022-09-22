package DeBrasiliaPraGoiania;

//Calculo da quantidade de combustivel gasta em uma viagem de carro de Brasilia para Goiania.

public class Main {
    public static void main(String[] args) {
        double tempoDeViagemEmHoras = 3.0;
        double velocidadeMediaPorHora = 70.0;
        double distanciaPercorrida = tempoDeViagemEmHoras * velocidadeMediaPorHora;
        final double LITROS_USADOS = distanciaPercorrida / 12.0;

        System.out.println("A viagem de carro " +
                "de Brasília para Goiânia dura " + tempoDeViagemEmHoras + " horas a uma velocidade de " + velocidadeMediaPorHora +"Km/h.\n" +
                "A distância percorrida é de " + distanciaPercorrida + "Km, com gasto total de " + LITROS_USADOS + " litros de gasolina.");

    }
}
