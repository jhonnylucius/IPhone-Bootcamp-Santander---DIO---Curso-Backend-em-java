package apps;

import telaInicial.Aplicativo;

public class YouTube extends Aplicativo {
    @Override
    public void abrir() {
        try {
            Runtime.getRuntime().exec("cmd /c start chrome https://www.youtube.com/watch?v=o1tj2zJ2Wvg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}