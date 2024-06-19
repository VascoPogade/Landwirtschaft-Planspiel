public class Player {
    private int ernte;
    private int vermoegen;
    private int mitarbeiterzufriedenheit;
    private int nachhaltigkeit;
    private int ansehen;
    private int risiko;


    public Player() {
        this.ernte = 50;
        this.vermoegen = 50;
        this.mitarbeiterzufriedenheit = 50;
        this.nachhaltigkeit = 50;
        this.ansehen = 50;
        this.risiko = 5;
    }

    //Implement methods to increase and decrease the player's attributes

    public int getErnte() {
        return ernte;
    }

    public int getVermoegen() {
        return vermoegen;
    }

    public int getMitarbeiterzufriedenheit() {
        return mitarbeiterzufriedenheit;
    }

    public int getNachhaltigkeit() {
        return nachhaltigkeit;
    }

    public int getAnsehen() {
        return ansehen;
    }

    public int getRisiko() {
        return risiko;
    }

    //Implement methods to change the player's attributes

    public void changeErnte(int value) {
        ernte += value;
    }

    public void changeVermoegen(int value) {
        vermoegen += value;
    }

    public void changeMitarbeiterzufriedenheit(int value) {
        mitarbeiterzufriedenheit += value;
    }

    public void changeNachhaltigkeit(int value) {
        nachhaltigkeit += value;
    }

    public void changeAnsehen(int value) {
        ansehen += value;
    }

    public void changeRisiko(int value) {
        risiko += value;
    }

    //Implement a method to check if the player has lost the game

    public boolean hasLost() {
        return ernte <= 0 || vermoegen <= 0 || mitarbeiterzufriedenheit <= 0 || nachhaltigkeit <= 0 || ansehen <= 0;
    }
}
