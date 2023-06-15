package plinio;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();

        System.out.print("O idioma é ");
        System.out.println(idioma.toString());

    }
}
