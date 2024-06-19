package apps;

import appabstract.App;

public class telefone extends App {
    @Override
    public void abrir() {
        try {
            System.out.println("Abrindo aplicativo de telefone...");
            // Coloque aqui o comando para abrir o aplicativo de telefone, se existir
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}