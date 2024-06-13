package GameController;

import java.util.Scanner;

import Fragen.Frage1;
import Fragen.Frage2;

public class DecisionTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int auswahl;

        Option kumulierteOption = new Option("Kumulierte Optionen", 0, 0, 0, 0, 0, 0);

        // Array für die Fragen
        Question[] fragen = new Question[] {
            new Frage1(),
            new Frage2(),
            // Füge hier weitere Fragen entsprechend hinzu
        };

        // Iteriere über alle Fragen
        for (Question frage : fragen) {
            frage.stelleFrage();
            auswahl = scanner.nextInt();
            frage.handleAntwort(auswahl, kumulierteOption);
        }

        // Ausgabe der kumulierten Optionen
        System.out.println("Kumulierte Optionen:");
        System.out.println("Ernte: " + kumulierteOption.getErnte());
        System.out.println("Geld: " + kumulierteOption.getGeld());
        System.out.println("Arbeiterzufriedenheit: " + kumulierteOption.getArbeiterZufriedenheit());
        System.out.println("Nachhaltigkeit: " + kumulierteOption.getNachhaltigkeit());
        System.out.println("Ansehen: " + kumulierteOption.getAnsehen());
        System.out.println("Risiko: " + kumulierteOption.getRisiko());

        scanner.close();
    }
}
