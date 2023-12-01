package aula05;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu e-mail: ");
        String log1 = input.nextLine();
        System.out.println("Digite sua senha: ");
        String senha1 = input.nextLine();

        if (log1.equals("murilo") && senha1.equals("12345")) {
            System.out.println("sucesso");
        } else {
            System.out.println("foi nao fi");
        }
        input.close();
    }
}