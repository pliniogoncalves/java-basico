package plinio.atividades_guanabara.atv_15;

import java.util.Scanner;

public class Fatorial {
    public int num = 0;
    public int fat =1;
    public String formula="";

    public void setValor(int n) {
        num = n;
        int f = 1;
        String s ="";
        for (int c = n; c > 1; c--) {
            f *=c;
            s += c + "x";
        }
        s +="1= ";
        fat = f;
        formula = s;
    }

    public int getFatorial() {
        return fat;
    }

    public String getFormula() {
        return formula;
    }
}
