package aplicativos.navegador;



public interface Navegador {
    void abrirNavegador();

    public abstract class Navegador  implements Navegador {

        @Override
        public void abrirNavegador() {
            System.out.println("Abrindo Navegador...");
        }
    }
}
