import java.util.ArrayList;

public class GameController {
private static Player player;
    private MainFrame mainFrame;
    private ArrayList<String> reasonsToEndGame;
    int scenarioNumber;

    String[] questions;
    String[] options1;
    String[] options2;
    int[][] attributes1Change;
    int[][] attributes2Change;

    String questionText1 = "Du weißt, dass du bald die Farm deines Onkelsübernehmen wirst. Was willst du studieren um dich optimal auf das Leben eines Farmers vorzubereiten?";
    String questionText2 = "Die Farm ist nun dein. Doch du stehst vor schwerwiegenden Entscheidungen. Möchstest du die Farm in Richtung Bio-Landwirtschaft betreiben oder entscheidest dui dich für Massentierhaltung?";
    String questionText3 = "Die Hauptanbau-Pflanze deiner Farm kommt als gentechnischveränderte Pflanze auf den Markt. Diese sei resestenter gegenüber Krankheiten, allerdings sind deine Kunden und Arbeitnehmer skeptisch ";
    String questionText4 = "Willst du mit einer großen Supermarktkette kollaborieren, um deine Produkte dort zu verkaufen, oder eine Direct-To-Consumer Online-Plattform aufbauen?";
    String questionText5 = "Wollen sie einen Teil ihrer Anbaufläche in eine Photovoltaik Anlage verwandeln, um ihren eigenen Energiebedarf zu decken?\n\nIn Zeiten steigender Energiepreise und wachsender Besorgnis über den Klimawandel hast du die Möglichkeit, einen Teil deiner Anbaufläche in eine Photovoltaik-Anlage umzuwandeln. Dies könnte deinen eigenen Energiebedarf decken und deine Betriebskosten langfristig senken. Allerdings würdest du dadurch wertvolle Anbaufläche verlieren und hohe initiale Investitionskosten tragen müssen. Willst du einen Teil deiner Anbaufläche in eine Photovoltaik-Anlage verwandeln, um deinen eigenen Energiebedarf zu decken und gleichzeitig einen Beitrag zur Nachhaltigkeit zu leisten, auch wenn dies mit erheblichen Umstellungen und Risiken verbunden ist?";
    String questionText6 = "Pläne für die Expansion eines großen Agragbetriebs gelangen an die Öffentlichkeit. Die Farm liegt in der unmittelbaren Umgebung dieses neuen Großbetriebes. Wie reagieren SIe auf die drohende Konkurenz?";
    String questionText7 = "Die Arbeiter beschweren sich. Es gab zu viele Arbeitsunfälle in der Vergangenheit. Wie wollen Sie darauf reagieren? ";
    String questionText8 = "Wollen Sie einen neuen autonomen Traktor anschaffen?"; // TODO: Platzhalter am Dienstag ersetzen in gespräch mit anderen
    String questionText9 = "Deine Felder gedeihen prächtig, Sie merken es wird Zeit für neue Ausrüstung, um sie optimal zu bewirtschaften.Es wir Zeit für neue Ausrüstung um diese Felder optimal zu bewirtschaften.";
    String questionText10 = "Ein motivierter Arbeiter hat auf einer Fortbildung von einer neuen innovativen Anbaumethode gehört. Diese würde aber eine Fortbildung der Arbeiter bedeuten. Diene Arbeitnehmer sind gespalten: Einige wollen bei den alten Methoden bleiben, während andere offen für neues sind. Wie entscheiden Sie?";
    String questionText11 = "Die Hauptsaison deines Hauptanbaugemüses steht an. Es kann mehr geerntet werden. Welche Maßnahmen ergreifen Sie um die Ernte zu maximieren und die Qualität der Produkte zu sichern?";
    String questionText12 = " Die Umweltbehörden warnen vor der rasanten Ausbreitung einer neuen Pflanzenkrankheit. Erste berichte kommen allerdings aus dem Süden Deutschlands. Denken Sie die Krankheit breitet sich rasant aus?";
    String questionText13 = "Angesichts einer starken Inflation stehen viele deiner Arbeiter vor erheblichen finanziellen Herausforderungen. Eine Lohnerhöhung könnte ihre Kaufkraft erhalten und die Moral verbessern, würde jedoch deine Betriebskosten erheblich erhöhen. Andererseits könnte das Verwehren einer Lohnerhöhung dazu führen, dass deine Arbeiter unzufrieden und weniger produktiv werden, was die Effizienz und das Betriebsklima beeinträchtigen könnte. Willst du die Löhne deiner Arbeiter erhöhen, um ihre finanzielle Situation zu verbessern und ihre Zufriedenheit zu sichern, auch wenn dies zu höheren Fixkosten führt, oder entscheidest du dich gegen eine Lohnerhöhung, um die Kosten niedrig zu halten und dadurch möglicherweise die Produktivität und das Ansehen deines Betriebs zu riskieren?";
    String questionText14 = "Dein Nachbar hat dir anvertraut, dass er über Jahre hinweg Schulden angehäuft hat. Er hat dich gebeten, einen Teil seines Landes abzukaufen, um seine Schulden zu tilgen. Dies könnte eine Gelegenheit für dich sein, deine Farm zu erweitern, erfordert jedoch die Aufnahme eines großen Kredits, was mit erheblichen finanziellen Verpflichtungen und Risiken verbunden ist. Willst du einen großen Kredit aufnehmen, um das Land deines Nachbarn zu erwerben und ihn in seiner Notlage zu unterstützen, oder entscheidest du dich dagegen, um die finanzielle Stabilität deiner Farm zu bewahren, selbst wenn dies dein Ansehen in der Gemeinschaft beeinträchtigen könnte? ";
    String questionText15 = "Sommer in Deutschland. Wetterexperten warnen; es stehe wieder eien trockene Jahreszeit an. Wie handeln Sie? ";
    String questionText16 = " Implementierung eines IoT-Systems zur Überwachung von Umweltbedingungen \n" + //
                "Der Farmer plant, ein Internet of Things (IoT)-System zu installieren, um Echtzeitdaten über Bodenfeuchtigkeit, Wetter und Pflanzenwachstum zu erhalten.";
    String questionText17 = "Die Regierung will eine zentrale Landstraße über ihren Acker bauen. Wollen Sie diese Entscheidung juristisch bekämpfen?\n\nIn deiner Nähe plant ein großes Industrieunternehmen eine Fabrik. Um diese Fabrik zu fördern, plant die Regierung den Bau einer Bundestraße über deinen Acker. Willst du diese Entscheidung juristisch bekämpfen?";

    // TODO: change attributes for boost
    String question1Option1Text = "Studium in die Richtung Energiesparende Technologien";
    String question1Option2Text = "Im Bereich Optimierung des Anbausstudieren";
    String question2Option1Text = "Dein Fleisch soll Preiswert sein. Du entscheidest dich für Massentierhaltung";
    String question2Option2Text = "Auf kosten deiner Ernte baust du Felder um um darauf deinen Tieren mehr auslauf zu geben";
    String question3Option1Text = "Komplette Saatgut austauschen und auf die neue Pflanze setzen";
    String question3Option2Text = "Beim alten Saatgut ohne gentechnik bleiben";
    String question4Option1Text = "Mit einer großen Supermarktkette kollaborieren.";
    String question4Option2Text = "Eine Direct-To-Consumer Online-Plattform aufbauen.";
    String question5Option1Text = "Ja, Photovoltaik-Anlage installieren.";
    String question5Option2Text = "Nein, keine Photovoltaik-Anlage installieren und auf traditionelle Energiequellen setzen.";
    String question6Option1Text = "Diversifizierung der Produktpalette um sich von der Konkurenz abzuheben und auf Nischenprodukte setzen";
    String question6Option2Text = "Preissenkung, um wettbewerbsfähig zu bleiben";
    String question7Option1Text = "Strikte Umsetzung und Verbesserung der Regularien";
    String question7Option2Text = "Minimale Umsetzung der Regularien beibehalten";
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

 int[] questions1Attributes1Change = {0, 0, 0, 20, 0, 0};
    int[] questions1Attributes2Change = {20, 0, 0, 0, 0, 0};
    int[] questions2Attributes1Change = {0, 20, -15, -30, -10, +10};
    int[] questions2Attributes2Change = {-20, -20, +30, +50, +15, -5};
    int[] questions3Attributes1Change = {50, 30, 20, -30, -50, -40};
    int[] questions3Attributes2Change = {0, 0, 10, 10, 20, 0};
    int[] questions4Attributes1Change = {0, 20, 0, -5, 10, 10000};
    int[] questions4Attributes2Change = {0, 10, 0, 5, 15, 15};
    int[] questions5Attributes1Change = {-10, -20, 0, 20, 15, 10};
    int[] questions5Attributes2Change = {0, -10, -5, -10, -15, 5};
    int[] questions6Attributes1Change = {10, -5, 5, 10, 15, -5};
    int[] questions6Attributes2Change = {0, -15, -7, 0, 20, 20};
    int[] questions7Attributes1Change = {0, -20, +30, 20, 50, -10};
    int[] questions7Attributes2Change = {0, 0, -40, -20, -50, +50};
    int[] questions8Attributes1Change = {10, -25, -5, 5, 10, +15};
    int[] questions8Attributes2Change = {-5, -10, +10, -5, -10, +5};
    int[] questions9Attributes1Change = {+15, -20, +15, -5, 10, -10};
    int[] questions9Attributes2Change = {7, -10, 5, 10, 5, 3};
    int[] questions10Attributes1Change = {10, 15, -30, 5, -5, -5};
    int[] questions10Attributes2Change = {5, 5, +15, +10, +10, -2};
    int[] questions11Attributes1Change = {+20, -10, -20, -10, -40, 20};
    int[] questions11Attributes2Change = {30, -20, -5, 0, +5, 10};
    int[] questions12Attributes1Change = {0,0, +2, 4, 1, 50};
    int[] questions12Attributes2Change = {5, -20, -2, -10, -2, -5};
    int[] questions13Attributes1Change = {5, -20, +25, 0, 10, 10};
    int[] questions13Attributes2Change = {-10, +10, -30, 0, -20, 5};
    int[] questions14Attributes1Change = {20, -30, 0, 0, 10, 20};
    int[] questions14Attributes2Change = {-10, 10, -5, 0, -10, -10};
    int[] questions15Attributes1Change = {10, -60, 10, 30, 20, -20};
    int[] questions15Attributes2Change = {0, 0, -20, 0, -10, +45};
    int[] questions16Attributes1Change = {20, -40, 15, 20, 20, -10};
    int[] questions16Attributes2Change = {15, -20, 10, 10, 10, -5};
    int[] questions17Attributes1Change = {-10, -15, -5, 0, 10, 20};
    int[] questions17Attributes2Change = {-20, 10, -5, -10, -10, 0};


    public static Player getPlayer() {
        return player;
    }


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
        if (scenarioNumber == 3) {
            addReasonsToEndGame("Die Genmanipulierte Pflanze wurde von den Kunden nicht angenommen. Die Kosten für die Neupflanzung und für das Saatgut haben dich in den Ruin getrieben.");
        }
        if (scenarioNumber == 5) {
            addReasonsToEndGame("Die Investition in die Photovoltaik-Anlage hat sich nicht ausgezahlt. Die hohen Investitionskosten und der Verlust von Anbaufläche haben dich in den Ruin getrieben.");
        }
        
        
        
        checkRisk();
        changeAttributesOne();
        nextScenario();
        updateGUI();
    }

    private void handleOption2() {
        checkRisk();
        changeAttributesTwo();
        nextScenario();
        updateGUI();
    }

    private void updateGUI() {
        // Update the GUI with the player's attributes
        mainFrame.attributesPanel.setAttributeValue(0, "Ernte", player.getErnte());
        mainFrame.attributesPanel.setAttributeValue(1, "Vermoegen", player.getVermoegen());
        mainFrame.attributesPanel.setAttributeValue(2, "Mitarbeiterzufriedenheit", player.getMitarbeiterzufriedenheit());
        mainFrame.attributesPanel.setAttributeValue(3, "Nachhaltigkeit", player.getNachhaltigkeit());
        mainFrame.attributesPanel.setAttributeValue(4, "Ansehen", player.getAnsehen());
        mainFrame.attributesPanel.setAttributeValue(5, "Risiko", player.getRisiko());
    }

    private void nextScenario() {
        // TODO: Endscreens einbauen falls wert gedropt ist
        if (player.getNachhaltigkeit() <= 0 || player.getErnte() <= 0 || player.getVermoegen() <= 0 || player.getMitarbeiterzufriedenheit() <= 0 || player.getAnsehen() <= 0) {
            endGame();
        }
        if (scenarioNumber >= (questions.length - 1)) {
            endGame();
        }

        mainFrame.scenarioPanel.setScenarioText(questions[scenarioNumber+1]);
        mainFrame.optionPanel1.setOptionText(options1[scenarioNumber+1]);
        mainFrame.optionPanel2.setOptionText(options2[scenarioNumber+1]);

        scenarioNumber++;

        payout();
    }

    private void payout() {
        // logic to calculate the cash that the player gets this round
        int payout = player.getErnte() * 1000; // max 100000€ per Ernte
        payout += (player.getMitarbeiterzufriedenheit() - 50) * 50; // max +/- 2500€ per Ernte
        payout += (player.getNachhaltigkeit() - 50) * 250; // max +/- 12500€ per Ernte
        payout += (player.getAnsehen() - 50) * 50; // max +/- 2500€ per Ernte

        if(player.getMitarbeiterzufriedenheit() < 15){
            payout -= 30000;
        }

        if(player.getNachhaltigkeit() < 15){
            payout -= 30000;
        }

        if(player.getAnsehen() < 15){
            payout -= 30000;
        }

        player.changeVermoegen(payout);
        // payout between +82500€ and +117500€ (including penalties between -7500€ and +117500€)
    }

    private void endGame() {
        // logic to end the game
        mainFrame.showEndScreen();
    }

    private void changeAttributesOne() {
        player.changeErnte(attributes1Change[scenarioNumber][0]);
        player.changeVermoegen(attributes1Change[scenarioNumber][1]);
        player.changeMitarbeiterzufriedenheit(attributes1Change[scenarioNumber][2]);
        player.changeNachhaltigkeit(attributes1Change[scenarioNumber][3]);
        player.changeAnsehen(attributes1Change[scenarioNumber][4]);
        player.changeRisiko(attributes1Change[scenarioNumber][5]);
    }

    private void changeAttributesTwo() {
        player.changeErnte(attributes2Change[scenarioNumber][0]);
        player.changeVermoegen(attributes2Change[scenarioNumber][1]);
        player.changeMitarbeiterzufriedenheit(attributes2Change[scenarioNumber][2]);
        player.changeNachhaltigkeit(attributes2Change[scenarioNumber][3]);
        player.changeAnsehen(attributes2Change[scenarioNumber][4]);
        player.changeRisiko(attributes2Change[scenarioNumber][5]);
    }

    private void checkRisk() {
        int risk = player.getRisiko();
        double random = Math.random() * 100;
        reasonsToEndGame = new ArrayList<>();
        int randomNum = (int)Math.random() * reasonsToEndGame.size();
        System.out.println("risk: " + risk);
        System.out.println("random" + random);;
        if (random < risk) {
            mainFrame.set_riskFlag(1);
            System.out.println("das Flag" + mainFrame.get_riskFlag());
            endGame();
    }
    }


    private void addReasonsToEndGame(String reason) {
        reasonsToEndGame.add(reason);
    }
}
