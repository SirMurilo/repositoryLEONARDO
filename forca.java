package aula08;

import java.util.Scanner;

public class forca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palavras = {"computador", "senac", "programação", "java", "tecnologia", "estudo"};
        String palavraEscolhida = palavras[(int) (Math.random() * palavras.length)];
        char[] palavraSecreta = new char[palavraEscolhida.length()];
        boolean[] letrasDescobertas = new boolean[palavraEscolhida.length()];
        int tentativas = 6;

        for (int i = 0; i < palavraEscolhida.length(); i++){
            palavraSecreta[i] = '_';
        }

        while (tentativas > 0) {
            System.out.println("Palavra: ");

            for( int i = 0; i < palavraEscolhida.length(); i++){
                if (letrasDescobertas[i]) {
                    System.out.print(palavraEscolhida.charAt(i) + " ");
                } else {
                    System.out.print(palavraSecreta[i] + " ");
                }
            }
            
            System.out.println("\nTentativas restantes: " + tentativas);
            System.out.println("Digite uma letra");
            char letra = scanner.next().charAt(0);

            boolean letraEncontrada = false;
            for(int i = 0; i < palavraEscolhida.length(); i++){
                if (palavraEscolhida. charAt(i) == letra) {
                    letrasDescobertas[i] = true;
                    letraEncontrada = true;
                }
            }

            boolean todasLetrasDescobertas = true;
            for( boolean descobertas : letrasDescobertas){
                if (!descobertas) {
                    todasLetrasDescobertas = false;
                    break;
                }
            }

            if (todasLetrasDescobertas) {
                System.out.println("Parabéns! você ganhou! a palavra era: " + palavraEscolhida);
                break;
            }
            if (!letraEncontrada){
                tentativas--;
                System.out.println("Letra incorreta. Tente Novamente. ");
            }
            if (tentativas == 0) {
                System.out.println("VOCÊ PERDEU! A PALAVRA ERA: " + palavraEscolhida);
            }

        } scanner.close();
    }
}
