
package GameController;

public abstract class Question {
    protected String frageText;
    protected Option option1;
    protected Option option2;

    public Question(String frageText, Option option1, Option option2) {
        this.frageText = frageText;
        this.option1 = option1;
        this.option2 = option2;
    }

    public abstract void handleAntwort(int auswahl, Option kumulierteOption);

    public void stelleFrage() {
        System.out.println(frageText);
        System.out.println("1. " + option1.getBeschreibung());
        System.out.println("2. " + option2.getBeschreibung());
        System.out.print("Deine Wahl (1 oder 2): ");
    }
}