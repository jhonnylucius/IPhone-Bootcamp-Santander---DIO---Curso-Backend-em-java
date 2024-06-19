package apps;

import appabstract.App;;

public class GoogleChrome extends App {
    @Override
    public void abrir() {
        try {
            Runtime.getRuntime().exec("cmd /c start chrome");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}