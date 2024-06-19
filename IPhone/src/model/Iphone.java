package model;

import apps.GoogleChrome;
import apps.Spotify;
import apps.telefone;
import apps.FaceBook;
import apps.WhatsApp;
import apps.YouTube;
import apps.Calendario;

import java.util.Scanner;

import appabstract.App;

public class Iphone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        App app = null;
        boolean executando = true;

        while (executando) {
            System.out.println("Escolha um aplicativo para abrir:");
            System.out.println("1. Spotify");
            System.out.println("2. Google Chrome");
            System.out.println("3. telefone");
            System.out.println("4. FaceBook");
            System.out.println("5. WhatsApp");
            System.out.println("6. YouTube");
            System.out.println("7. Calendário");
            System.out.println("8. Sair");
            System.out.println("Digite o nº do app para abrí-lo: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    app = new Spotify();
                    break;
                case 2:
                    app = new GoogleChrome();
                    break;
                case 3:
                    app = new telefone();
                    break;
                case 4:
                    app = new FaceBook();
                    break;
                case 5:
                    app = new WhatsApp();
                    break;
                case 6:
                    app = new YouTube();
                    break;
                case 7:
                    app = new Calendario();
                    break;
                case 8:
                    System.out.println("Saindo do IPhone...");
                    executando = false;
                    continue;
                default:
                    System.out.println("Escolha inválida");
                    continue;
            }

            if (app != null) {
                app.abrir();
            }
        }

        scanner.close();
    }
}