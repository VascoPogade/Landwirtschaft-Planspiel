package Fragen;

import GameController.Option;
import GameController.Question;

public class Frage2 extends Question {
    public Frage2() {
        super("Bestandsaufnahme nach Vererbung. Es fällt auf, dass dringend neue Investitionen her müssen. Wohin soll investiert werden?",
                new Option("Investitionen in energiesparende Technologien", 0, -40, 5, 20, 5, -3),
                new Option("Optimierung von Anbau- und Bewirtschaftungsprozessen", 5, -20, 0, 15, 5, -10));
    }

    @Override
    public void handleAntwort(int auswahl, Option kumulierteOption) {
        if (auswahl == 1) {
            kumulierteOption.addOption(option1);
        } else if (auswahl == 2) {
            kumulierteOption.addOption(option2);
        } else {
            System.out.println("Ungültige Auswahl!");
        }
    }
}
