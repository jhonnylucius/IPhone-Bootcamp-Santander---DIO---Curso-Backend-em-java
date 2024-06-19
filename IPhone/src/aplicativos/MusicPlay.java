
package aplicativos.musicPlay;

public interface MusicPlay {
    void abrirMusicPlay();

   
public abstract class MusicPlay implements FaceBook {

    @Override
    public void abrirMusicPlay() {
        System.out.println("Abrindo MusicPlay...");
    }
}

}
