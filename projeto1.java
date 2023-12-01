package aula07;

import java.util.Random;
import java.util.Scanner;

public class projeto1 {
    public static void main(String[] args) {
        Random random = new Random();

        int numeroAleatório = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        int tentativa;
        int tentativas = 0;

        System.out.println("Bem vindo ao Guess the Number!");

        do{
            System.out.println("Digite um número entre 1 e 100: ");
            tentativa = scanner.nextInt();
            tentativas++;
                    
            if(tentativa == numeroAleatório) {
                System.out.println("Boa, você acertou em " + tentativas + " tentativa.");
            } else if (tentativa < numeroAleatório){
                System.out.println("Tente um número maior: ");
            } else {
                System.out.println("Tente um número menor: ");
            }

        } while (tentativa != numeroAleatório);

        
        scanner.close();

    }
}
