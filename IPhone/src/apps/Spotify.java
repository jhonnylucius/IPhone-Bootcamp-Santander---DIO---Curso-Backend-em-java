package apps;

import appabstract.App;

public class Spotify extends App {
    @Override
    public void abrir() {
        try {
            Runtime.getRuntime().exec("cmd /c start spotify");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}