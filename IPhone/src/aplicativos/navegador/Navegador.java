package aplicativos.navegador;



public interface Navegador {
    void abrirNavegador();

    public class Navegador implements IPhone  {

        @Override
        public void abrirNavegador() {
            System.out.println("Abrindo Navegador...");
        }
    }
}
