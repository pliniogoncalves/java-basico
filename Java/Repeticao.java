package plinio.atividades_guanabara.atv_12;

import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, s = 0, c = 0, p = 0, i = 0, a = 0;
        float media;
        do {
            System.out.print("(valor 0 finaliza)Informe um número: ");
            n = scanner.nextInt();

            if (n != 0) {
                s += n;
                c++;
                if (n % 2 == 0) {
                    p++;
                } else {
                    i++;
                }
                if (n > 100) {
                    a++;
                }
            }
        } while (n != 0);
        media = (float) s / c;

        System.out.println("Somatório: " + s);
        System.out.println("Valores Inseridos: " + c);
        System.out.println("Valores Pares: " + p);
        System.out.println("Valores Impares: " + i);
        System.out.println("Valores maiores que 100: " + a);
        System.out.println("Média: " + media);
    }
}
