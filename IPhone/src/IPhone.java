import java.util.Scanner;

import aplicativos.faceBook.Facebook.FaceBook;
import aplicativos.facebook.Facebook;
import aplicativos.musicplay.MusicPlay;
import aplicativos.navegador.Navegador;
import aplicativos.telefone.Telefone;
import aplicativos.whatsapp.WhatsApp;

// src/Iphone.java
public class IPhone extends aplicativos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDigite uma das opções:");
            System.out.println("1 - Facebook");
            System.out.println("2 - MusicPlay");
            System.out.println("3 - Navegador");
            System.out.println("4 - Telefone");
            System.out.println("5 - WhatsApp");
            System.out.println("6 - Sair (encerrar programa)");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    new FaceBook().abrirFacebook();
                    break;
                case 2:
                    new MusicPlay().abrirMusicPlay();
                    break;
                case 3:
                    new Navegador().abrirNavegador();
                    break;
                case 4:
                    new Telefone().abrirTelefone();
                    break;
                case 5:
                    new WhatsApp().abrirWhatsApp();
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}