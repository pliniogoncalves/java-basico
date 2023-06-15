package plinio;

import java.util.Scanner;
import java.util.Calendar;

public class CalculadoraDeIdade {
    public static void main(String[] args) {
        int nasc, ano, idade;

        Calendar c = Calendar.getInstance();

        Scanner scanner = new Scanner(System.in);
        ano = c.get(Calendar.YEAR);

        System.out.println("Digite o ano que voce nasceu: ");
        nasc = scanner.nextInt();

        idade = ano - nasc;

        System.out.println("Sua idade e: " + idade + " anos");
    }
}
