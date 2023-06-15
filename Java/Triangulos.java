package plinio.atividades_guanabara.atv_10;

import java.util.Scanner;
public class Triangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l1, l2, l3;
        boolean eq, es, tri;

        System.out.print("Digite o primeiro lado: ");
        l1 = scanner.nextDouble();

        System.out.print("Digite o segundo lado: ");
        l2 = scanner.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        l3 = scanner.nextDouble();

        tri = (l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2);
        eq = (l1 == l2) && (l2 == l3);
        es = (l1 != l2) && (l2 != l3) && (l1 != l3);

        System.out.println("Pode formar um triângulo? " + (tri ? "Sim" : "Não"));
        System.out.println("O triângulo é Equilátero? " + (eq ? "Sim" : "Não"));
        System.out.println("O triângulo é Escaleno? " + (es ? "Sim" : "Não"));
    }
}

