package plinio;

import java.awt.*;

public class ResolucaoDaTela2 {
    public static void main(String[] args) {
        Toolkit toolk = Toolkit.getDefaultToolkit();
        Dimension res = toolk.getScreenSize();

        int largura = res.width;
        int altura = res.height;

        System.out.println("A resolução é " + largura + "x" + altura);
    }
}
