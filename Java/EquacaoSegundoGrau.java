package plinio;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        float delta = (float) (Math.pow(b,2)- 4 * a * c);
        System.out.println("valor de delta: "+delta);

        if (delta<0) {
            System.out.println("Não existem raízes reais");
        } else {
            System.out.println("Existem raízes reais");
        }
    }
}
