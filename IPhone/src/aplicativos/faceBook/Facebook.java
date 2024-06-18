package aplicativos.faceBook;

public interface Facebook {
    void abrirFacebook();

public class FaceBook implements Facebook {

    @Override
    public void abrirFacebook() {
        System.out.println("Abrindo Facebook...");
    }
}
}