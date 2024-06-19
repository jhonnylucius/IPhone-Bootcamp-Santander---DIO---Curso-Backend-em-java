package iphone.aplicativos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface Spotify {

    public static void main(String[] args) throws IOException, InterruptedException {
        // O comando a ser executado
        String comando = "start spotify"; 

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