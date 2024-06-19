package apps;

import telaInicial.Aplicativo;

public class FaceBook extends Aplicativo {
    @Override
    public void abrir() {
        try {
            Runtime.getRuntime().exec("cmd /c start chrome https://www.facebook.com/");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}