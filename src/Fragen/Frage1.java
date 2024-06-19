package Fragen;

import GameController.Option;
import GameController.Question;

public class Frage1 extends Question {
    public Frage1() {
        super("Organisierte Landwirtschaft. Einer eurer Angestellten hat den Wunsch nach einer langfristigen Planung geäußert. Welche Maßnahme ergreifen Sie?",
                new Option("Verbesserung des Produktionsprozesses", 10, -40, 5, 20, 5, -5),
                new Option("Implementierung von langfristigen Anbaustrategien", 15, -30, 10, 25, 10, -10));
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
