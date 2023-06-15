package plinio;

import java.awt.*;
import java.awt.Dimension;

public class ResolucaoDaTela {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension resolucao = toolkit.getScreenSize();

        int largura = resolucao.width;
        int altura = resolucao.height;

        System.out.println("A resolução da sua tela é " + largura + "x" + altura + " pixels.");
    }
}
