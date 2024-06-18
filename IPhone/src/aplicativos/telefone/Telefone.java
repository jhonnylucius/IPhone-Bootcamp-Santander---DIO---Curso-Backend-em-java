package aplicativos.telefone;


public interface Telefone {
    void abrirTelefone();

    public class Telefone implements IPhone {

        @Override
        public void abrirTelefone() {
            System.out.println("Abrindo Telefone...");
        }
    }

    }