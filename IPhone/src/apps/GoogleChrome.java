package apps;

import telaInicial.Aplicativo;;

public class GoogleChrome extends Aplicativo {
    @Override
    public void abrir() {
        try {
            Runtime.getRuntime().exec("cmd /c start chrome");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}