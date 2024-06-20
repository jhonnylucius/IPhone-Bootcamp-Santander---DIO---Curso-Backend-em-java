package model;

import apps.GoogleChrome;
import apps.Spotify;
import apps.telefone;
import apps.FaceBook;
import apps.WhatsApp;
import apps.YouTube;
import apps.Calendario;
import appabstract.App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IphoneGUI extends JFrame {
    public IphoneGUI() {
        setTitle("iPhone");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Centralizar a janela na tela
        setLocationRelativeTo(null);

        JButton spotifyButton = new JButton("Spotify");
        JButton chromeButton = new JButton("Google Chrome");
        JButton telefoneButton = new JButton("Telefone");
        JButton facebookButton = new JButton("Facebook");
        JButton whatsappButton = new JButton("WhatsApp");
        JButton youtubeButton = new JButton("YouTube");
        JButton calendarioButton = new JButton("Calendário");
        JButton sairButton = new JButton("Sair");

        spotifyButton.addActionListener(new AppButtonListener(new Spotify()));
        chromeButton.addActionListener(new AppButtonListener(new GoogleChrome()));
        telefoneButton.addActionListener(new AppButtonListener(new telefone()));
        facebookButton.addActionListener(new AppButtonListener(new FaceBook()));
        whatsappButton.addActionListener(new AppButtonListener(new WhatsApp()));
        youtubeButton.addActionListener(new AppButtonListener(new YouTube()));
        calendarioButton.addActionListener(new AppButtonListener(new Calendario()));
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(spotifyButton);
        add(chromeButton);
        add(telefoneButton);
        add(facebookButton);
        add(whatsappButton);
        add(youtubeButton);
        add(calendarioButton);
        add(sairButton);
    }

    private class AppButtonListener implements ActionListener {
        private App app;

        public AppButtonListener(App app) {
            this.app = app;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            app.abrir();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new IphoneGUI().setVisible(true);
            }
        });
    }
}