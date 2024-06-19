package apps;

import appabstract.App;;

public class WhatsApp extends App {
    @Override
    public void abrir() {
        try {
            Runtime.getRuntime().exec("cmd /c start chrome https://web.whatsapp.com//");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}