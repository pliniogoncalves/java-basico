package plinio;

import java.util.Scanner;

public class SuperCalculadora {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        n = scanner.nextInt();

        System.out.println("Resto da Divisao por 2:  " + n%2);
        System.out.println("Elevado ao Cubo: " + Math.pow(n, 3));
        System.out.println("Raiz Quadrada: " + Math.sqrt(n));
        System.out.println("Raiz Cubica: "+ Math.cbrt(n));
        System.out.println("Valor Absoluto: " + Math.abs(n));
    }
}
