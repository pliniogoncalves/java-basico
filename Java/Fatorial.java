package plinio.atividades_guanabara.atv_11;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int f = 1;
        int n;
        String s = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        n = scanner.nextInt();

        for (int i = n; i >= 1; i--){
            f *= i;
            if(i != 1)
                s += i + " x ";
        }
        s += 1;
        System.out.println( s + " = "+ f);
    }
}
