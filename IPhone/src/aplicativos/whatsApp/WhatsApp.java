package aplicativos.whatsApp;


public interface WhatsApp {
    void abrirWhatsApp();

 public abstract class WhatsApp implements WhatsApp  {

    @Override
    public void abrirWhatsApp() {
        System.out.println("Abrindo WhatsApp...");
    }
}
}