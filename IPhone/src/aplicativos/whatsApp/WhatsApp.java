package aplicativos.whatsApp;


public interface WhatsApp {
    void abrirWhatsApp();

 public class WhatsApp implements IPhone  {

    @Override
    public void abrirWhatsApp() {
        System.out.println("Abrindo WhatsApp...");
    }
}
}