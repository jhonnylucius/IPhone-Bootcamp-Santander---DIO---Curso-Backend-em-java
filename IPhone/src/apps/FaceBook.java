package apps;

import appabstract.App;

public class FaceBook extends App {
    @Override
    public void abrir() {
        try {
            Runtime.getRuntime().exec("cmd /c start chrome https://www.facebook.com/");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}