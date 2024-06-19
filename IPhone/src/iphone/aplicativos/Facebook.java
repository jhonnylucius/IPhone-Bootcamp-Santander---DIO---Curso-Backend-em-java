package iphone.aplicativos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface Facebook {

    
} Facebook {

    static void abrirMediaPlayer() throws IOException, InterruptedException {
        System.out.println("Abrindo o Windows Media Player...");
        // O comando a ser executado
        String comando = "start chrome https://www.facebook.com/";

        // Criar o processo
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", comando); // Para Windows

        // Executar o comando
        Process process = pb.start();

        // Obter a saída do comando (opcional)
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        // Aguardar o término do processo
        int exitCode = process.waitFor();
        System.out.println("Código de saída: " + exitCode);
    }
}