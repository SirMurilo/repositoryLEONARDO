package aula05;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        System.out.println("informe o número da tabuada: ");
        Scanner input = new Scanner(System.in);
        int tabuada = input.nextInt();

        for(int i = 10; i >=0; i--){
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }

        System.out.println("---------------------");

        for(int i = 0; i <= 10; i++){
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }

        input.close();

    }
}
