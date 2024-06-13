public class Player {
    private int ernte;
    private int vermoegen;
    private int mitarbeiterzufriedenheit;
    private int nachhaltigkeit;
    private int ansehen;
    private float risiko;


    public Player() {
        this.ernte = 50;
        this.vermoegen = 50;
        this.mitarbeiterzufriedenheit = 50;
        this.nachhaltigkeit = 50;
        this.ansehen = 50;
        this.risiko = 0.5f;
    }

    //Implement methods to increase and decrease the player's attributes

    public void increaseErnte(int ernteIncrease) {
        this.ernte += ernteIncrease;
    }

    public void decreaseErnte(int ernteDecrease) {
        this.ernte -= ernteDecrease;
    }

    public void increaseVermoegen(int vermoegenIncrease) {
        this.vermoegen += vermoegenIncrease;
    }

    public void decreaseVermoegen(int vermoegenDecrease) {
        this.vermoegen -= vermoegenDecrease;
    }

    public void increaseMitarbeiterzufriedenheit(int mitarbeiterzufriedenheitIncrease) {
        this.mitarbeiterzufriedenheit += mitarbeiterzufriedenheitIncrease;
    }

    public void decreaseMitarbeiterzufriedenheit(int mitarbeiterzufriedenheitDecrease) {
        this.mitarbeiterzufriedenheit -= mitarbeiterzufriedenheitDecrease;
    }

    public void increaseNachhaltigkeit(int nachhaltigkeitIncrease) {
        this.nachhaltigkeit += nachhaltigkeitIncrease;
    }

    public void decreaseNachhaltigkeit(int nachhaltigkeitDecrease) {
        this.nachhaltigkeit -= nachhaltigkeitDecrease;
    }

    public void increaseAnsehen(int ansehenIncrease) {
        this.ansehen += ansehenIncrease;
    }

    public void decreaseAnsehen(int ansehenDecrease) {
        this.ansehen -= ansehenDecrease;
    }

    public void increaseRisiko(float risikoIncrease) {
        this.risiko += risikoIncrease;
    }

    public void decreaseRisiko(float risikoDecrease) {
        this.risiko -= risikoDecrease;
    }

    //Implement a method to check if the player has lost the game

    public boolean hasLost() {
        return ernte <= 0 || vermoegen <= 0 || mitarbeiterzufriedenheit <= 0 || nachhaltigkeit <= 0 || ansehen <= 0 || risiko >= 1;
    }
}
