package apps;

import telaInicial.Aplicativo;;

public class WhatsApp extends Aplicativo {
    @Override
    public void abrir() {
        try {
            Runtime.getRuntime().exec("cmd /c start chrome https://web.whatsapp.com//");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}