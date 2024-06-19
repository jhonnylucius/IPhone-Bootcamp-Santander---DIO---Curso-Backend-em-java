package apps;

import telaInicial.Aplicativo;

public class Spotify extends Aplicativo {
    @Override
    public void abrir() {
        try {
            Runtime.getRuntime().exec("cmd /c start spotify");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}