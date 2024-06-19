import java.util.function.Consumer;

public class GameController {
    private Player player;
    private MainFrame mainFrame;
    int scenarioNumber;

String[] questions;
String[] options1;
String[] options2;
int[][] attributes1Change;
int[][] attributes2Change;

    String questionText1 = "Bestandsaufnahme nach Vererbung. Es fällt auf es müssen dringend neue Investitionen her. Wohin soll investiert werden?";
    String questionText2 = "Meilensteinentsheidung. Tierethik oder das große Geld?";
    String questionText3 = "Die Hauptanbau-Pflanze auf der Farm kommt als gentechnischveränderte Pflanze auf den Markt. Allerdings is diese gentechnisch verändert. Soll das bisherige Saatgut durch das neue Veränderte ersetzt werden? ";
    String questionText4 = "Willst du mit einer großen Supermarktkette kollaborieren, um deine Produkte dort zu verkaufen, oder eine Direct-To-Consumer Online-Plattform aufbauen?";
    String questionText5 = "Wollen sie einen Teil ihrer Anbaufläche in eine Photovoltaik Anlage verwandeln, um ihren eigenen Energiebedarf zu decken?\n\nIn Zeiten steigender Energiepreise und wachsender Besorgnis über den Klimawandel hast du die Möglichkeit, einen Teil deiner Anbaufläche in eine Photovoltaik-Anlage umzuwandeln. Dies könnte deinen eigenen Energiebedarf decken und deine Betriebskosten langfristig senken. Allerdings würdest du dadurch wertvolle Anbaufläche verlieren und hohe initiale Investitionskosten tragen müssen. Willst du einen Teil deiner Anbaufläche in eine Photovoltaik-Anlage verwandeln, um deinen eigenen Energiebedarf zu decken und gleichzeitig einen Beitrag zur Nachhaltigkeit zu leisten, auch wenn dies mit erheblichen Umstellungen und Risiken verbunden ist?";
    String questionText6 = "Pläne für die Expansion eines großen Agragbetriebs gelangen an die Öffentlichkeit. Genau in die Nähe der Farm; Wie reagiert man auf die drohende Konkurenz?";
    String questionText7 = "Die Arbeiter beschweren sich. Es gab zu viele Arbeitsunfälle in der Vergangenheit. Sollen die Sicherheitsregularien erhöht werden? ";
    String questionText8 = "Wollen Sie einen neuen autonomen Traktor anschaffen?";
    String questionText9 = "Deine Felder sind am wachsen und gedeihen. Es wir Zeit für neue Ausrüstung um diese Felder optimal zu bewirtschaften ";
    String questionText10 = "Auf einer Fortbildung hast du über eine neue Anbaumethode dich informiert. Diese würde aber eine Fortbildung der Arbeiter bedeuten. Diene Arbeitnehmer sind gespalten; frei nach dem Mottos “Schuster bleib bei deinem Leisten” oder “Wer immer nur im alten Buch blättert, findet keine neuen Geschichten” Die Zeit ist reif, die Effizienz auf der Farm muss steigen. Wie soll dies bewerkstelligt werden?";
    String questionText11 = "Die Hauptsaison deines Hauptanbaugemüses steht an. Es kann mehr geerntet werden.";
    String questionText12 = " Die Umweltbehörden warnen vor der rasanten Ausbreitung einer neuen Pflanzenkrankheit.";
    String questionText13 = "Angesichts einer starken Inflation stehen viele deiner Arbeiter vor erheblichen finanziellen Herausforderungen. Eine Lohnerhöhung könnte ihre Kaufkraft erhalten und die Moral verbessern, würde jedoch deine Betriebskosten erheblich erhöhen. Andererseits könnte das Verwehren einer Lohnerhöhung dazu führen, dass deine Arbeiter unzufrieden und weniger produktiv werden, was die Effizienz und das Betriebsklima beeinträchtigen könnte. Willst du die Löhne deiner Arbeiter erhöhen, um ihre finanzielle Situation zu verbessern und ihre Zufriedenheit zu sichern, auch wenn dies zu höheren Fixkosten führt, oder entscheidest du dich gegen eine Lohnerhöhung, um die Kosten niedrig zu halten und dadurch möglicherweise die Produktivität und das Ansehen deines Betriebs zu riskieren?";
    String questionText14 = "Dein Nachbar hat dir anvertraut, dass er über Jahre hinweg Schulden angehäuft hat. Er hat dich gebeten, einen Teil seines Landes abzukaufen, um seine Schulden zu tilgen. Dies könnte eine Gelegenheit für dich sein, deine Farm zu erweitern, erfordert jedoch die Aufnahme eines großen Kredits, was mit erheblichen finanziellen Verpflichtungen und Risiken verbunden ist. Willst du einen großen Kredit aufnehmen, um das Land deines Nachbarn zu erwerben und ihn in seiner Notlage zu unterstützen, oder entscheidest du dich dagegen, um die finanzielle Stabilität deiner Farm zu bewahren, selbst wenn dies dein Ansehen in der Gemeinschaft beeinträchtigen könnte? ";
    String questionText15 = "Sommer in Deutschland. Wetterexperten warnen; es stehe wieder eien trockene Jahreszeit an. Wie handeln? ";
    String questionText16 = " Implementierung eines IoT-Systems zur Überwachung von Umweltbedingungen \n" + //
                "Der Farmer plant, ein Internet of Things (IoT)-System zu installieren, um Echtzeitdaten über Bodenfeuchtigkeit, Wetter und Pflanzenwachstum zu erhalten.";
    String questionText17 = "Die Regierung will eine zentrale Landstraße über ihren Acker bauen. Wollen Sie diese Entscheidung juristisch bekämpfen?\n\nIn deiner Nähe plant ein großes Industrieunternehmen eine Fabrik. Um diese Fabrik zu fördern, plant die Regierung den Bau einer Bundestraße über deinen Acker. Willst du diese Entscheidung juristisch bekämpfen?";


    String question1Option1Text = "Investitionen in energiesparende Technologien";
    String question1Option2Text = "Optimierung von Anbau- und Bewirtschaftungsprozessen";
    String question2Option1Text = "Beginn der Massentierhaltung";
    String question2Option2Text = "Ausbau der Grünflachen um den Tieren mehr Auslauf zu geben";
    String question3Option1Text = "Komplette Saatgut austauschen ";
    String question3Option2Text = "Beim alten Saatgut ohne gentechnik bleiben";
    String question4Option1Text = "Mit einer großen Supermarktkette kollaborieren.";
    String question4Option2Text = "Eine Direct-To-Consumer Online-Plattform aufbauen.";
    String question5Option1Text = "Ja, Photovoltaik-Anlage installieren.";
    String question5Option2Text = "Nein, keine Photovoltaik-Anlage installieren und auf traditionelle Energiequellen setzen.";
    String question6Option1Text = "Diversifizierung der Produktpalette ";
    String question6Option2Text = "Preissenkung, um wettbewerbsfähig zu bleiben";
    String question7Option1Text = "Strikte Umsetzung und Verbesserung der Regularien";
    String question7Option2Text = "Minimale Umsetzung der Regularien";
    //Platzhalter Traktor
    String question8Option1Text = "Ja, einen autonomen Traktor anschaffen.";
    String question8Option2Text = "Nein, keinen autonomen Traktor anschaffen und auf traditionelle Methoden setzen. ";
    String question9Option1Text = "Kauf hochmoderner neuer Geräte";
    String question9Option2Text = "Gebrauchte Geräte anschaffen";
    String question10Option1Text = "Automatisierung von Arbeitsabläufen";
    String question10Option2Text = "Investitionen in Schulungen und Weiterbildung für Mitarbeiter ";
    String question11Option1Text = "Überarbeiten der Arbeitskräfte";
    String question11Option2Text = "Zusätzliche Arbeitskräfte einstellen";
    String question12Option1Text = "Warnung weitestgehend ignorieren ";
    String question12Option2Text = "Benutzung von Pestiziden massiv ausweiten ";
    String question13Option1Text = "Ja, die Löhne erhöhen.";
    String question13Option2Text = "Nein, die Löhne nicht erhöhen und die Betriebskosten niedrig halten. ";
    String question14Option1Text = "Ja, einen großen Kredit aufnehmen und das Land erwerben. ";
    String question14Option2Text = "Nein, keinen Kredit aufnehmen und das Land nicht erwerben.";
    String question15Option1Text = "Installation eines neuen Bewässerungsystems";
    String question15Option2Text = "Hoffnung auf falsche Berechnungen der Meterologen. In einem heißen Sommer würde das Wasser ausgehen.";
    String question16Option1Text = "Installation eines umfassenden IoT-Systems";
    String question16Option2Text = "Nutzung eines Basis-IoT-Systems mit weniger Sensoren";
    String question17Option1Text = "Ja, die Entscheidung juristisch bekämpfen.";
    String question17Option2Text = "Nein, die Entscheidung akzeptieren. ";

    int[] questions1Attributes1Change = {1, 0, 0, 0, 0, 0, 100};
    int[] questions1Attributes2Change = {2, 0, 0, 0, 0, 0, 100};
    int[] questions2Attributes1Change = {-100, 0, 0, 0, 0, 0, 0};
    int[] questions2Attributes2Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions3Attributes1Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions3Attributes2Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions4Attributes1Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions4Attributes2Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions5Attributes1Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions5Attributes2Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions6Attributes1Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions6Attributes2Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions7Attributes1Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions7Attributes2Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions8Attributes1Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions8Attributes2Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions9Attributes1Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions9Attributes2Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions10Attributes1Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions10Attributes2Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions11Attributes1Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions11Attributes2Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions12Attributes1Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions12Attributes2Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions13Attributes1Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions13Attributes2Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions14Attributes1Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions14Attributes2Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions15Attributes1Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions15Attributes2Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions16Attributes1Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions16Attributes2Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions17Attributes1Change = {0, 0, 0, 0, 0, 0, 0};
    int[] questions17Attributes2Change = {0, 0, 0, 0, 0, 0, 0};





    public GameController() {
        player = new Player();
        mainFrame = new MainFrame();
        scenarioNumber = 0;
        mainFrame.scenarioPanel.setScenarioText(questionText1);
        mainFrame.optionPanel1.setOptionText(question1Option1Text);
        mainFrame.optionPanel2.setOptionText(question1Option2Text);

        questions = new String[]{questionText1, questionText2, questionText3, questionText4, questionText5, questionText6, questionText7, questionText8, questionText9, questionText10, questionText11, questionText12, questionText13, questionText14, questionText15, questionText16, questionText17};
        options1 = new String[]{question1Option1Text, question2Option1Text, question3Option1Text, question4Option1Text, question5Option1Text, question6Option1Text, question7Option1Text, question8Option1Text, question9Option1Text, question10Option1Text, question11Option1Text, question12Option1Text, question13Option1Text, question14Option1Text, question15Option1Text, question16Option1Text, question17Option1Text};
        options2 = new String[]{question1Option2Text, question2Option2Text, question3Option2Text, question4Option2Text, question5Option2Text, question6Option2Text, question7Option2Text, question8Option2Text, question9Option2Text, question10Option2Text, question11Option2Text, question12Option2Text, question13Option2Text, question14Option2Text, question15Option2Text, question16Option2Text, question17Option2Text};
        attributes1Change = new int[][]{questions1Attributes1Change, questions2Attributes1Change, questions3Attributes1Change, questions4Attributes1Change, questions5Attributes1Change, questions6Attributes1Change, questions7Attributes1Change, questions8Attributes1Change, questions9Attributes1Change, questions10Attributes1Change, questions11Attributes1Change, questions12Attributes1Change, questions13Attributes1Change, questions14Attributes1Change, questions15Attributes1Change, questions16Attributes1Change, questions17Attributes1Change};
        attributes2Change = new int[][]{questions1Attributes2Change, questions2Attributes2Change, questions3Attributes2Change, questions4Attributes2Change, questions5Attributes2Change, questions6Attributes2Change, questions7Attributes2Change, questions8Attributes2Change, questions9Attributes2Change, questions10Attributes2Change, questions11Attributes2Change, questions12Attributes2Change, questions13Attributes2Change, questions14Attributes2Change, questions15Attributes2Change, questions16Attributes2Change, questions17Attributes2Change};
        mainFrame.optionPanel1.addOptionButtonListener(e -> handleOption1());
        mainFrame.optionPanel2.addOptionButtonListener(e -> handleOption2());

        updateGUI();
    }

    private void handleOption1() {
        // Implement logic for option 1
        // mainFrame.optionPanel1.setOptionText("New explanatory text for Option 1");
        checkRisk();
        changeAttributesOne();
        nextScenario();
        updateGUI();
    }

    private void handleOption2() {
        // Implement logic for option 2
        checkRisk();
        changeAttributesTwo();
        nextScenario();
        updateGUI();
    }

    private void updateGUI() {
        // Update the GUI with the player's attributes
        mainFrame.attributesPanel.setAttributeValue(0, player.getErnte());
        mainFrame.attributesPanel.setAttributeValue(1, player.getVermoegen());
        mainFrame.attributesPanel.setAttributeValue(2, player.getMitarbeiterzufriedenheit());
        mainFrame.attributesPanel.setAttributeValue(3, player.getNachhaltigkeit());
        mainFrame.attributesPanel.setAttributeValue(4, player.getAnsehen());
        // mainFrame.attributesPanel.setAttributeValue(5, (int) (player.getRisiko() * 100));
    }

    private void nextScenario() {
        // Implement logic to move to the next scenario
        if (scenarioNumber >= questions.length - 1) {
            endGame();
        }

        mainFrame.scenarioPanel.setScenarioText(questions[scenarioNumber+1]);
        mainFrame.optionPanel1.setOptionText(options1[scenarioNumber+1]);
        mainFrame.optionPanel2.setOptionText(options2[scenarioNumber+1]);

        scenarioNumber++;
    }

    private void endGame() {
        // Implement logic to end the game
        mainFrame.showEndScreen();
    }

    private void changeAttributesOne()
    {
        player.changeErnte(attributes1Change[scenarioNumber][0]);
        player.changeVermoegen(attributes1Change[scenarioNumber][1]);
        player.changeMitarbeiterzufriedenheit(attributes1Change[scenarioNumber][2]);
        player.changeNachhaltigkeit(attributes1Change[scenarioNumber][3]);
        player.changeAnsehen(attributes1Change[scenarioNumber][4]);
        player.changeRisiko(attributes1Change[scenarioNumber][5]);
    }

    private void changeAttributesTwo()
    {
        player.changeErnte(attributes2Change[scenarioNumber][0]);
        player.changeVermoegen(attributes2Change[scenarioNumber][1]);
        player.changeMitarbeiterzufriedenheit(attributes2Change[scenarioNumber][2]);
        player.changeNachhaltigkeit(attributes2Change[scenarioNumber][3]);
        player.changeAnsehen(attributes2Change[scenarioNumber][4]);
        player.changeRisiko(attributes2Change[scenarioNumber][5]);
    }

    private void checkRisk()
    {
        int risk = player.getRisiko();
        double random = Math.random() * 100;
        String []reasontoEndGame = new String[10];
        System.out.println(risk);
        System.out.println(random);
        if (random < risk) {
            endGame();
    }
    }
}
