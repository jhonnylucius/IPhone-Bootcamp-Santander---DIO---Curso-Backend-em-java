package aplicativos.telefone;


public interface Telefone {
    void abrirTelefone();

    public abstract class Telefone implements Telefone {

        @Override
        public void abrirTelefone() {
            System.out.println("Abrindo Telefone...");
        }
    }

    }