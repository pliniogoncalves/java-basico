package plinio.atividades_guanabara.atv_13;

import java.util.Scanner;

public class Passos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o início: ");
        int i = scanner.nextInt();
        System.out.print("Digite o fim: ");
        int f = scanner.nextInt();
        System.out.print("Digite o intervalo: ");
        int passo = scanner.nextInt();

        for (int c = i; c <= f; c += passo) {
            System.out.println(c);
        }
    }
}
