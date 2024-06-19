package iphone.aplicativos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MusicPlay {


     static void abrirMediaPlayer() throws IOException, InterruptedException {
        System.out.println("Abrindo o Windows Media Player...");

        // Executar o comando para abrir o Media Player
        String comando = "start \"\" \"C:\\Program Files\\Windows Media Player\\wmplayer.exe\"";
        Process process = Runtime.getRuntime().exec(comando);

        // (opcional) Imprimir a saída do processo
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        int exitCode = process.waitFor();
        System.out.println("Código de saída: " + exitCode);

        
    }
    
}