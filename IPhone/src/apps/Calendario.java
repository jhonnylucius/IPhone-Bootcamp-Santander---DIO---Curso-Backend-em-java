package apps;

import appabstract.App;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Calendario extends App {
    @Override
    public void abrir() {
        System.out.println("Abrindo calendário...");

        try {
            LocalDate hoje = LocalDate.now();
            LocalDate primeiroDiaDoMes = hoje.withDayOfMonth(1);

            String mesAno = hoje.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR")) + " " + hoje.getYear();
            System.out.println("Calendário - " + mesAno);

            String[] diasDaSemana = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sáb"};
            for (String dia : diasDaSemana) {
                System.out.print(dia + "\t");
            }
            System.out.println();

            int primeiroDiaSemana = primeiroDiaDoMes.getDayOfWeek().getValue() % 7; // Ajuste para começar no domingo
            for (int i = 0; i < primeiroDiaSemana; i++) {
                System.out.print("\t");
            }

            int ultimoDiaDoMes = hoje.lengthOfMonth();
            for (int dia = 1; dia <= ultimoDiaDoMes; dia++) {
                if (dia == hoje.getDayOfMonth()) {
                    System.out.printf("[%d]\t", dia); // Marca o dia atual
                } else {
                    System.out.print(dia + "\t");
                }

                if ((dia + primeiroDiaSemana) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Calendário aberto.");
    }
}