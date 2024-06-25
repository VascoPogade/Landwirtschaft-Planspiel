public class Player {
    private int ernte;
    private int vermoegen;
    private int mitarbeiterzufriedenheit;
    private int nachhaltigkeit;
    private int ansehen;
    private int risiko;


    public Player() {
        this.ernte = 50;
        this.vermoegen = 500000;
        this.mitarbeiterzufriedenheit = 50;
        this.nachhaltigkeit = 50;
        this.ansehen = 50;
        this.risiko = 5;
    }

    //methods to increase and decrease the player's attributes

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

    //methods to change the player's attributes

    public void changeErnte(int value) {
        if(ernte + value > 100) {
            ernte = 100;
        } else {
            ernte += value;
        }
    }

    public void changeVermoegen(int value) {
        vermoegen += value;
    }

    public void changeMitarbeiterzufriedenheit(int value) {
        if(mitarbeiterzufriedenheit + value > 100) {
            mitarbeiterzufriedenheit = 100;
        } else {
            mitarbeiterzufriedenheit += value;
        }
    }

    public void changeNachhaltigkeit(int value) {
        if(nachhaltigkeit + value > 100) {
            nachhaltigkeit = 100;
        } else {
            nachhaltigkeit += value;
        }
    }

    public void changeAnsehen(int value) {
        if(ansehen + value > 100) {
            ansehen = 100;
        } else {
            ansehen += value;
        }
    }

    public void changeRisiko(int value) {
        if(risiko + value > 100) {
            risiko = 100;
        } else {
            risiko += value;
        }
    }

    //method to check if the player has lost the game

    public boolean hasLost() {
        return ernte <= 0 || vermoegen <= 0 || mitarbeiterzufriedenheit <= 0 || nachhaltigkeit <= 0 || ansehen <= 0;
    }
}
