package plinio;

import java.util.Random;
import java.util.Scanner;

public class LeitorDePensamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Vou pensar em um valor entre 1 e 5. Tente adivinhar!");

        int nP = (int) (1 + Math.random() * (5-1));
        int tentativas = 0;
        int palpite;
        boolean acerto = true;

        do {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < nP) {
                System.out.println("O número pensado é maior. Tente novamente.");
            } else if (palpite > nP) {
                System.out.println("O número pensado é menor. Tente novamente.");
            } else {
                System.out.println("Você acertou!!!");
            }
        } while (!acerto && tentativas <3);

        if (palpite != nP) {
            System.out.println("O número que eu pensei era " + nP + ".");
        }
    }
}
