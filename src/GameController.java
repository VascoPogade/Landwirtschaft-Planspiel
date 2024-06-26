import java.util.ArrayList;

public class GameController {
private static Player player;
    private MainFrame mainFrame;
    private ArrayList<String> reasonsToEndGame;
    static int scenarioNumber;

    String[] questions;
    String[] options1;
    String[] options2;
    int[][] attributes1Change;
    int[][] attributes2Change;

    //TODO: Fragen und Optionen verbessern
    String questionText1 = "Dein Onkel besitzt einen schönen Bauernhof in Brandenburg. Durch sein fortgeschrittenes Alter wird es für ihn immer schwieriger die Farm zu leiten. Er möchte sie dir, seinem Lieblingsneffen, gerne übergeben. Was wirst du studieren um dich optimal auf das Leben eines Farmers vorzubereiten? Energieeinsparungspotentiale waren schon immer dein Interesse, allerdings weißt du wie wichtig deinem Onkel die Optimierung des Anbaus ist.";
    String questionText2 = "Die Farm ist nun dein. Doch du stehst vor schwerwiegenden Entscheidungen. Möchtest du die Farm in Richtung Bio-Landwirtschaft umbauen, nimmst die strengen Regularien dafür in Kauf? Oder entscheidest du dich dafür, die Massentierhaltung, die dein Onkel betrieben hat, fortzuführen?";
    String questionText3 = "Mais, wird zu 40% auf deiner Farm angebaut. Die Firma 'FarmerSeeeds' hat eine neue gentechnisch veränderte Mais-Pflanze auf den Markt gebracht. Diese sei laut Hersteller resistenter gegenüber Krankheiten und bietet mehr Erträge pro Pflanze, allerdings sind deine Kunden und Arbeitnehmer skeptisch gegenüber Gentechnik.";
    String questionText4 = "Willst du mit einer großen Supermarktkette kollaborieren, um deine Produkte dort zu verkaufen, oder eine Direct-To-Consumer Online-Plattform aufbauen?";
    String questionText5 = "Wollen sie einen Teil ihrer Anbaufläche in eine Photovoltaik Anlage verwandeln, um ihren eigenen Energiebedarf zu decken?\n\nIn Zeiten steigender Energiepreise und wachsender Besorgnis über den Klimawandel hast du die Möglichkeit, einen Teil deiner Anbaufläche in eine Photovoltaik-Anlage umzuwandeln. Dies könnte deinen eigenen Energiebedarf decken und deine Betriebskosten langfristig senken. Allerdings würdest du dadurch wertvolle Anbaufläche verlieren und hohe initiale Investitionskosten tragen müssen. Willst du einen Teil deiner Anbaufläche in eine Photovoltaik-Anlage verwandeln, um deinen eigenen Energiebedarf zu decken und gleichzeitig einen Beitrag zur Nachhaltigkeit zu leisten, auch wenn dies mit erheblichen Umstellungen und Risiken verbunden ist?";
    String questionText6 = "Vor kurzem sind Pläne für die Expansion eines großen Agrarbetriebs in Ihrer Region an die Öffentlichkeit gelangt. Dieser neue Großbetrieb wird in unmittelbarer Nähe Ihrer eigenen Farm errichtet und stellt eine erhebliche Konkurrenz dar. Es wird erwartet, dass der neue Betrieb modernste Technologien und umfangreiche Ressourcen einsetzen wird, um seine Effizienz und Produktivität zu maximieren. Angesichts dieser Entwicklung könnten sich die Marktbedingungen stark verändern, was erhebliche Auswirkungen auf Ihren Betrieb haben könnte. Wie reagieren SIe auf die drohende Konkurenz?";
    String questionText7 = "In letzter Zeit gab es zahlreiche Beschwerden von Ihren Arbeitern über eine beunruhigende Anzahl von Arbeitsunfällen in Ihrem Betrieb. Die Mitarbeiter sind besorgt um ihre Sicherheit und Gesundheit am Arbeitsplatz und fordern dringende Maßnahmen zur Verbesserung der Arbeitsbedingungen. Diese Situation stellt nicht nur ein erhebliches Risiko für das Wohlbefinden Ihrer Mitarbeiter dar, sondern kann auch rechtliche und wirtschaftliche Konsequenzen für Ihr Unternehmen haben. Allerdings ist dies mit Kosten verbunden, die du eigentlich nicht zahlen willst.";
    String questionText8 = "Du bist immer bereit deine Farm besser zu organisieren. Du hast von einem befreundeten Bauern gehört, dass es Farm-Management-Informationssystem gibt um effizienter zu landwirtschaften. Allerdings würde sich dein Geldbeutel ehrheblich leeren und vorher hat es auch ohne funktioniert. Wie entscheidest du?"; 
    String questionText9 = "Es ist ein besonders gutes Jahr für die Landwirtschaft, und deine Felder gedeihen prächtig. Um von diesen idealen Bedingungen zu profitieren, entscheidest du dich, deine Anbauflächen zu vergrößern. Dies erfordert jedoch die Anschaffung neuer Erntemaschinen, um die Felder optimal bewirtschaften zu können. Wie planst du den Kauf dieser neuen Maschinen?";
    String questionText10 = "Ein motivierter Arbeiter hat auf einer Fortbildung von einer neuen innovativen Anbaumethode gehört. Diese würde aber eine Fortbildung der Arbeiter bedeuten. Deine Arbeitnehmer sind gespalten: Einige wollen bei den alten Methoden bleiben, während andere offen für Neues sind. Wie entscheidest du?";
    String questionText11 = "Die Hauptsaison deines Hauptanbaugetreides Mais steht an. Es kann mehr geerntet werden, als du erwartet hast. Welche Maßnahmen ergreifst du um die Ernte zu maximieren und die Qualität der Produkte zu sichern?";
    String questionText12 = " Die Umweltbehörden warnen vor der rasanten Ausbreitung einer neuen sich schnell verbreitenden Pflanzenkrankheit. Erste Berichte kommen allerdings aus dem Süden Deutschlands. Denken Sie die Krankheit breitet sich rasant aus um deine Farm überhaupt zu ereichen?";
    String questionText13 = "Angesichts einer starken Inflation stehen viele deiner Arbeiter vor erheblichen finanziellen Herausforderungen. Eine Lohnerhöhung könnte ihre Kaufkraft erhalten und die Moral verbessern, würde jedoch deine Betriebskosten erheblich erhöhen. Andererseits könnte das Verwehren einer Lohnerhöhung dazu führen, dass deine Arbeiter unzufrieden und weniger produktiv werden, was die Effizienz und das Betriebsklima beeinträchtigen könnte. Willst du die Löhne deiner Arbeiter erhöhen, um ihre finanzielle Situation zu verbessern und ihre Zufriedenheit zu sichern, auch wenn dies zu höheren Fixkosten führt, oder entscheidest du dich gegen eine Lohnerhöhung, um die Kosten niedrig zu halten und dadurch möglicherweise die Produktivität und das Ansehen deines Betriebs zu riskieren?";
    String questionText14 = "Dein Nachbar hat dir anvertraut, dass er über Jahre hinweg Schulden angehäuft hat. Er hat dich gebeten, einen Teil seines Landes abzukaufen, um seine Schulden zu tilgen. Dies könnte eine Gelegenheit für dich sein, deine Farm zu erweitern, erfordert jedoch die Aufnahme eines großen Kredits, was mit erheblichen finanziellen Verpflichtungen und Risiken verbunden ist. Willst du einen großen Kredit aufnehmen, um das Land deines Nachbarn zu erwerben und ihn in seiner Notlage zu unterstützen, oder entscheidest du dich dagegen, um die finanzielle Stabilität deiner Farm zu bewahren, selbst wenn dies dein Ansehen in der Gemeinschaft beeinträchtigen könnte? ";
    String questionText15 = "Sommer in Deutschland. Wetterexperten warnen; es stehe wieder eine trockene Jahreszeit an. Wie handeln Sie? ";
    String questionText16 = " Implementierung eines IoT-Systems zur Überwachung von Umweltbedingungen \n" + //
                "Der Farmer plant, ein Internet of Things (IoT)-System zu installieren, um Echtzeitdaten über Bodenfeuchtigkeit, Wetter und Pflanzenwachstum zu erhalten.";
    String questionText17 = "Die Regierung will eine zentrale Landstraße über ihren Acker bauen. Wollen Sie diese Entscheidung juristisch bekämpfen?\n\nIn deiner Nähe plant ein großes Industrieunternehmen eine Fabrik. Um diese Fabrik zu fördern, plant die Regierung den Bau einer Bundestraße über deinen Acker. Willst du diese Entscheidung juristisch bekämpfen?";

//(Ernte, Vermögen, Mitarbeiterzufriedenheit, Nachhaltigkeit, Ansehen, Risiko)
int[] questions1Attributes1Change = {0, 0, 0, 20, 0, 0};
int[] questions1Attributes2Change = {20, 0, 0, 0, 0, 0};
int[] questions2Attributes1Change = {0, 0, -20, -30, -10, +10};
int[] questions2Attributes2Change = {-30, -200000, +10, +30, +10, -10};
int[] questions3Attributes1Change = {50, -50000, 20, -30, -50, 10};
int[] questions3Attributes2Change = {0, 0, 10, 10, 20, -10};
//TODO: Vasco fragen wie sich das Geld und risiko technisch auswirkt
int[] questions4Attributes1Change = {0, -10000, 0, -5, 10, 5};
int[] questions4Attributes2Change = {0, -100000, 0, 5, 15, 5};
int[] questions5Attributes1Change = {-10, -500000, 0, 20, 15, 10};
int[] questions5Attributes2Change = {0, -100, -5, -10, -15, 5};
int[] questions6Attributes1Change = {10, -50000, 5, 10, 15, -5};
int[] questions6Attributes2Change = {0, -150000, -7, 0, 20, 15};
int[] questions7Attributes1Change = {0, -50000, +30, 20, 50, -10};
int[] questions7Attributes2Change = {0, 0, -40, -20, -50, +30};
int[] questions8Attributes1Change = {10, -1000000, 10, 5, 10, 0};
int[] questions8Attributes2Change = {0, 0, -10, 0, -10, +10};
int[] questions9Attributes1Change = {+15, -2000000, +15, -5, 10, -15};
int[] questions9Attributes2Change = {7, -750000, 5, 10, 5, 5};
int[] questions10Attributes1Change = {10, -200000, -30, 5, -5, 0};
int[] questions10Attributes2Change = {5, -100000, +15, +10, +10, -5};
int[] questions11Attributes1Change = {+20, -10000, -20, -10, -40, 20};
int[] questions11Attributes2Change = {30, -20000, -5, 0, +5, -10};
int[] questions12Attributes1Change = {0,0, +2, 4, 1, 40};
int[] questions12Attributes2Change = {5, -1000, -2, -10, -2, -5};
int[] questions13Attributes1Change = {5, -20000, +25, 0, 10, 10};
int[] questions13Attributes2Change = {-10, 0, -30, 0, -20, 5};
int[] questions14Attributes1Change = {20, -2500000, 0, 0, 10, 20};
int[] questions14Attributes2Change = {-10, 0, -5, 0, -10, -10};
int[] questions15Attributes1Change = {10, -750000, 10, 30, 20, -20};
int[] questions15Attributes2Change = {0, 0, -20, 0, -10, +45};
int[] questions16Attributes1Change = {20, -4000000, 15, 20, 20, -10};
int[] questions16Attributes2Change = {15, -200000, 10, 10, 10, -5};
int[] questions17Attributes1Change = {-10, -400000, -5, 0, 10, 10};
int[] questions17Attributes2Change = {-20, 0, -5, -10, -10, 5};




    // TODO: teure technologien vielleicht nach unten, da am Anfang viele teure Investitionen stehen
    String question1Option1Text = "Studium in die Richtung Energiesparende Technologien";
    String question1Option2Text = "Im Bereich Optimierung von Anbaustrategien studieren";
    String question2Option1Text = "Du setzt auf preiswertes Fleisch um Konkurenzfähig zu bleiben und setzt auf Massentierhaltung";
    String question2Option2Text = "Auf kosten deiner Ernte baust du Felder um um darauf deinen Tieren mehr auslauf zu geben (" + questions2Attributes2Change[1] + "€)";
    String question3Option1Text = "Komplette Saatgut austauschen und auf die neue Pflanze setzen (" + questions3Attributes1Change[1] + "€)";
    String question3Option2Text = "Beim alten Saatgut ohne gentechnik bleiben";
    String question4Option1Text = "Mit einer großen Supermarktkette kollaborieren. (" + questions4Attributes1Change[1] + "€)";
    String question4Option2Text = "Eine Direct-To-Consumer Online-Plattform aufbauen. (" + questions4Attributes2Change[1] + "€)";
    String question5Option1Text = "Ja, Photovoltaik-Anlage installieren. (" + questions5Attributes1Change[1] + "€)";
    String question5Option2Text = "Nein, keine Photovoltaik-Anlage installieren und auf traditionelle Energiequellen setzen.";
    String question6Option1Text = "Diversifizierung der Produktpalette um sich von der Konkurenz abzuheben und auf Nischenprodukte setzen (" + questions6Attributes1Change[1] + "€)";
    String question6Option2Text = "Preissenkung, um wettbewerbsfähig zu bleiben (" + questions6Attributes2Change[1] + "€)";
    String question7Option1Text = "Strikte Umsetzung und Verbesserung der Regularien (" + questions7Attributes1Change[1] + "€)";
    String question7Option2Text = "Minimale Umsetzung der Regularien beibehalten";
    //Platzhalter Traktor
    String question8Option1Text = "Ja, Farm-Management-Informationssystem anschaffen (" + questions8Attributes1Change[1] + "€)";
    String question8Option2Text = "Nein, kein Farm-Management-Informationssystem anschaffen (" + questions8Attributes2Change[1] + "€)";
    String question9Option1Text = "Kauf hochmoderner neuer Geräte (" + questions9Attributes1Change[1] + "€)";
    String question9Option2Text = "Gebrauchte Geräte anschaffen (" + questions9Attributes2Change[1] + "€)";
    String question10Option1Text = "Automatisierung von Arbeitsabläufen (" + questions10Attributes1Change[1] + "€)";
    String question10Option2Text = "Investitionen in Schulungen und Weiterbildung für Mitarbeiter (" + questions10Attributes2Change[1] + "€)";
    String question11Option1Text = "Überarbeiten der Arbeitskräfte";
    String question11Option2Text = "Zusätzliche Arbeitskräfte einstellen (" + questions11Attributes2Change[1] + "€)";
    String question12Option1Text = "Warnung weitestgehend ignorieren ";
    String question12Option2Text = "Benutzung von Pestiziden massiv ausweiten (" + questions12Attributes2Change[1] + "€)";
    String question13Option1Text = "Ja, die Löhne erhöhen. (" + questions13Attributes1Change[1] + "€)";
    String question13Option2Text = "Nein, die Löhne nicht erhöhen und die Betriebskosten niedrig halten. ";
    String question14Option1Text = "Ja, einen großen Kredit aufnehmen und das Land erwerben. (" + questions14Attributes1Change[1] + "€)";
    String question14Option2Text = "Nein, keinen Kredit aufnehmen und das Land nicht erwerben.";
    String question15Option1Text = "Installation eines neuen Bewässerungsystems (" + questions15Attributes1Change[1] + "€)";
    String question15Option2Text = "Hoffnung auf falsche Berechnungen der Meterologen. In einem heißen Sommer würde das Wasser ausgehen.";
    String question16Option1Text = "Installation eines umfassenden IoT-Systems (" + questions16Attributes1Change[1] + "€)";
    String question16Option2Text = "Nutzung eines Basis-IoT-Systems mit weniger Sensoren (" + questions16Attributes2Change[1] + "€)";
    String question17Option1Text = "Ja, die Entscheidung juristisch bekämpfen. (" + questions17Attributes1Change[1] + "€)";
    String question17Option2Text = "Nein, die Entscheidung akzeptieren. ";


    public static Player getPlayer() {
        return player;
    }

    public static int getScenarioNumber() {
        return scenarioNumber;
    }


    public GameController() {
        player = new Player();
        mainFrame = new MainFrame();
        scenarioNumber = 0;
        mainFrame.scenarioPanel.setScenarioText(questionText1);
        mainFrame.optionPanel1.setOptionText(question1Option1Text);
        mainFrame.optionPanel2.setOptionText(question1Option2Text);
        reasonsToEndGame = new ArrayList<>();

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
        if (scenarioNumber == 0) {
            reasonsToEndGame.add("Dein Onkel besaß unbekannte Schulden bei einer lokalen Bank. Die Schulden wurden auf dich übertragen und haben dich in den Ruin getrieben.");
        }

        if (scenarioNumber == 3) {
            reasonsToEndGame.add("Die genmanipulierte Pflanze wurde von den Kunden nicht angenommen. Die Kosten für die Neupflanzung und das Saatgut haben dich in den Ruin getrieben.");
        }
        
        if (scenarioNumber == 5) {
            reasonsToEndGame.add("Die Investition in die Photovoltaik-Anlage hat sich nicht ausgezahlt. Die hohen Investitionskosten und der Verlust von Anbaufläche haben dich in den Ruin getrieben.");
        }
        if (scenarioNumber == 6) {
            reasonsToEndGame.add("Die Konkurrenz hat dich aus dem Markt gedrängt. Die Diversifizierung deiner Produktpalette wurde von deinen Kunden nicht angenommen.");
        }
        //TODO: Platzhalter technologie ersetzen
        if (scenarioNumber == 8) {
            reasonsToEndGame.add("Die Investition in neue Technologie hat sich nicht gelohnt. Da die Anschaffung extrem kostspielig war bist du ruiniert. Das neue Farmmangement ist leider an der implementierung gescheitert. Der Import der schnittstellen hat sich als langwierigeren Prozess herausgestellt als erwatet.");
        }
        
        if (scenarioNumber == 11) {
            reasonsToEndGame.add("Du hast deine Arbeitskräfte während der Hauptsaison zu stark ausgebeutet. Massenweise Kündigungen und fehlende neue Bewerber haben deine Farm in den Ruin getrieben.");
        }
        if (scenarioNumber == 13) {
            reasonsToEndGame.add("Die Lohnerhöhung hat sich nicht ausgezahlt. Die hohen Fixkosten und die geringe Produktivität haben dich in den Ruin getrieben.");
        }
        if (scenarioNumber == 14) {
            reasonsToEndGame.add("Du hast einen großen Kredit aufgenommen, um das Land deines Nachbarn zu erwerben. Die hohen Zinsen und die Tilgung des Kredits haben dich in den Ruin getrieben.");
        }
        
        if (scenarioNumber == 15) {
            reasonsToEndGame.add("Die Investition in ein neues Bewässerungssystem hat sich nicht ausgezahlt. Hohe Investitionskosten und fehlerhafte Berechnungen der Meteorologen haben dich in den Ruin getrieben.");
        }
        
        if (scenarioNumber == 16) {
            reasonsToEndGame.add("Die Investition in ein umfassendes IoT-System hat sich nicht ausgezahlt. Die hohen Investitionskosten und die mangelnde Akzeptanz der Technologie haben dich in den Ruin getrieben.");
        }
        
        
        checkRisk();
        changeAttributesOne();
        nextScenario();
        updateGUI();
    }

    private void handleOption2() {
        if (scenarioNumber == 3) {
            reasonsToEndGame.add("Deine Konkurrenz setzte auf genmanipulierte Pflanzen mit höherer Resistenz und besseren Erträgen, was dich nach und nach aus dem Markt drängte.");
        }
        if (scenarioNumber == 6) {
            reasonsToEndGame.add("Der lang anhaltende Preiskampf mit der Konkurrenz hat dich in den Ruin getrieben.");
        }
        
        if (scenarioNumber == 7) {
            reasonsToEndGame.add("Öffentliche Kritik an deiner restriktiven Umsetzung der Sicherheitsregularien und häufige Arbeitsunfälle führten zur Schließung deiner Farm durch die Behörden.");
        }
        if (scenarioNumber == 8) {
            reasonsToEndGame.add("Du hast dich gegen die Anschaffung eines Farm-Management-Informationssystem entschieden. Die Konkurrenz nutzte die Technologie, um effizienter zu arbeiten und dich aus dem Markt zu drängen.");
        }
        if (scenarioNumber == 9) {
            reasonsToEndGame.add("Die gekauften gebrauchten Geräte haben sich als Fehlinvestition herausgestellt. Hohe Reparaturkosten und geringe Effizienz haben dich in den Ruin getrieben.");
        }
        
        if (scenarioNumber == 12) {
            reasonsToEndGame.add("Der großflächige massive Einsatz von Pestiziden hat deinen Feldern nachhaltig geschadet. Nichts wächst mehr, und du bist ruiniert.");
        }
        
        if (scenarioNumber == 15) {
            reasonsToEndGame.add("Die Meteorologen behielten recht. Ein heißer Sommer führte zum Wassermangel, deine Felder vertrockneten, und du bist ruiniert.");
        }
        
        if (scenarioNumber == 16) {
            reasonsToEndGame.add("Die Konkurrenz nutzte hochmoderne Geräte durch die Implementierung eines Basis-IoT, was dir einen entscheidenden Nachteil verschaffte. Du bist ruiniert.");
        }
        
        if (scenarioNumber == 17) {
            reasonsToEndGame.add("Durch die neue Bundesstraße gelangen Schadstoffe auf deine Felder. Kaum noch etwas wächst, und du bist ruiniert."); // Möglicherweise zu unrealistisch
        }
        


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
        if (player.getNachhaltigkeit() <= 0 || player.getErnte() <= 0 || player.getVermoegen() <= 0 || player.getMitarbeiterzufriedenheit() <= 0 || player.getAnsehen() <= 0) {
            endGame("Platzhalter");
        }
        if (scenarioNumber >= (questions.length - 1)) {
            endGame("platzhalter");
        }

        mainFrame.scenarioPanel.setScenarioText(questions[scenarioNumber+1]);
        mainFrame.optionPanel1.setOptionText(options1[scenarioNumber+1]);
        mainFrame.optionPanel2.setOptionText(options2[scenarioNumber+1]);

        scenarioNumber++;

        payout();
    }

    private void payout() {
        // logic to calculate the cash that the player gets this round
        int payout = player.getErnte() * 100; // max 10000€ per Ernte
        payout += (player.getMitarbeiterzufriedenheit() - 50) * 50; // max +/- 2500€ per Ernte
        payout += (player.getNachhaltigkeit() - 50) * 250; // max +/- 12500€ per Ernte
        payout += (player.getAnsehen() - 50) * 50; // max +/- 2500€ per Ernte

        if(player.getMitarbeiterzufriedenheit() < 50){
            payout -= 30000;
        }

        if(player.getNachhaltigkeit() < 50){
            payout -= 30000;
        }

        if(player.getAnsehen() < 50){
            payout -= 30000;
        }

        player.changeVermoegen(payout);
        // payout between +82500€ and +117500€ (including penalties between -7500€ and +117500€)
    }

    private void endGame(String string) {
        // logic to end the game
        mainFrame.showEndScreen(string);
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
        if (random < risk && !reasonsToEndGame.isEmpty()) {
            int randomNum = (int)(Math.random() * reasonsToEndGame.size());
            mainFrame.set_riskFlag(1);
            if(randomNum == 0){
                endGame(reasonsToEndGame.get(randomNum));
            } else {
                endGame(reasonsToEndGame.get(randomNum - 1));
            }
        }
    }
}
