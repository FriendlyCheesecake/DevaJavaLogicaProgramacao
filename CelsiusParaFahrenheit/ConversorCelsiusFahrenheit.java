package CelsiusParaFahrenheit;

public class ConversorCelsiusFahrenheit {

        public static void main(String[] args) {

            final double FATOR_1 = 9/5.0;
            final int FATOR_2 = 32;
            double celsius = 18;
            double fahrenheit = (celsius * FATOR_1) + FATOR_2;

            System.out.println(celsius + "ºC equivalem a " + fahrenheit + "ºF.");

        }
    }

