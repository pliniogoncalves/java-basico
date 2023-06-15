package plinio;

import java.util.Locale;

public class IdiomaDoSistema2 {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("Idioma: " +idioma.getDisplayLanguage());
    }
}
