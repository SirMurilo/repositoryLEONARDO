package aula05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fº: ");

        double fah = scanner.nextDouble();
        double celsius = ((fah - 32) * 5) /9;

        DecimalFormat df = new DecimalFormat("0.00");
        String newCelsius = df.format(celsius);

        System.out.println("A temperatura em Celsius é de: " + newCelsius + " Cº");

        scanner.close();
        
    }
}
