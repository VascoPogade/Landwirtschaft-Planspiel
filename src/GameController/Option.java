package GameController;
public class Option {
    protected String beschreibung;
    protected int ernte;
    protected int geld;
    protected int arbeiterZufriedenheit;
    protected int nachhaltigkeit;
    protected int ansehen;
    protected int risiko;

    public Option(String beschreibung, int ernte, int geld, int arbeiterZufriedenheit, int nachhaltigkeit, int ansehen, int risiko) {
        this.beschreibung = beschreibung;
        this.ernte = ernte;
        this.geld = geld;
        this.arbeiterZufriedenheit = arbeiterZufriedenheit;
        this.nachhaltigkeit = nachhaltigkeit;
        this.ansehen = ansehen;
        this.risiko = risiko;
    }

    public void addOption(Option neueOption) {
        this.ernte += neueOption.ernte;
        this.geld += neueOption.geld;
        this.arbeiterZufriedenheit += neueOption.arbeiterZufriedenheit;
        this.nachhaltigkeit += neueOption.nachhaltigkeit;
        this.ansehen += neueOption.ansehen;
        this.risiko += neueOption.risiko;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public int getErnte() {
        return ernte;
    }

    public int getGeld() {
        return geld;
    }

    public int getArbeiterZufriedenheit() {
        return arbeiterZufriedenheit;
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
}
