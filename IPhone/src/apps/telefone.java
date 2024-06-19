package apps;

import telaInicial.Aplicativo;

public class telefone extends Aplicativo {
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