import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public ScenarioPanel scenarioPanel;
    public OptionPanel optionPanel1;
    public OptionPanel optionPanel2;
    public AttributesPanel attributesPanel;
    public EndPanel endScreenPanel;
    public int riskFlag;

    public MainFrame() {
        this.riskFlag = 0;
        // Set up the main frame
        setTitle("Farm Management Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        scenarioPanel = new ScenarioPanel();
        optionPanel1 = new OptionPanel("This would be the explanatory text for Option 1");
        optionPanel2 = new OptionPanel("This would be the explanatory text for Option 2...blah blah blah... blah blah blah blah blah blah");
        attributesPanel = new AttributesPanel();

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(1, 2));
        optionsPanel.add(optionPanel1);
        optionsPanel.add(optionPanel2);

        add(scenarioPanel, BorderLayout.NORTH);
        add(optionsPanel, BorderLayout.CENTER);
        add(attributesPanel, BorderLayout.SOUTH);

        setExtendedState(JFrame.MAXIMIZED_BOTH); // Open in full-screen mode
        
        setVisible(true);
    }

    public int get_riskFlag() {
        return riskFlag;
    }

    public void set_riskFlag(int riskFlag) {
        this.riskFlag = riskFlag;
    }

    public void showEndScreen(String reason) {
        String  caption;
        String explanation;
        ImageIcon image;
        if (reason == "Platzhalter") {
            reason = "Dein Onkel hatte ungeahnte Schulden. Du konntest die Farm nicht retten";
        }
        Player player = GameController.getPlayer();
        if (get_riskFlag() == 1) { 
            caption = "Dein Hof ging zu hohe Risiken ein";
            explanation = reason;
            image = new ImageIcon("src/resources/Picture_of_Famer_2.png");
        } else {
            if (player.getVermoegen() <= 0) {
                caption = "Bankrott";
                explanation = "Schulden über Schulden. Die Farm gehört nun der Bank.";
                image = new ImageIcon("src/resources/Picture_of_Famer_2.png");
            } else if (player.getNachhaltigkeit() < 0) {
                caption = "Ökologisches Desaster";
                explanation = "Deine Farm verschmutzt die Umwelt. Landesweite Proteste zwingen dich, die Farm zu schließen.";
                image = new ImageIcon("src/resources/End_Sustainability.png");
            } else if (player.getAnsehen() <= 0) {
                caption = "Widerstand der Gemeinschaft";
                explanation = "Die Gemeinschaft lehnt deine Anbaumethoden ab. Deine Farm verliert an Ansehen und Marktanteil.";
                image = new ImageIcon("src/resources/End_Ansehen_2.png");
            } else if (player.getErnte() <= 0) {  
                caption = "Missernte";
                explanation = "Die Ernte ist zu gering ausgefallen. Du kannst deine Verpflichtungen nicht erfüllen und musst die Farm schließen.";
                image = new ImageIcon("src/resources/Missernte.png");
            } else if (player.getMitarbeiterzufriedenheit() <= 0) {
                caption = "Mitarbeiteraufstand";
                explanation = "Deine Mitarbeiter sind nicht zufrieden wie du deine Farm leitest. Die Arbeiter streiken, und die Farm kann nicht weiter betrieben werden.";
                image = new ImageIcon("src/resources/End_Mitarbeiterzufriedenheit_2.png");
            } else {
                // Gewinner Screen
                caption = "Glückwunsch du hast gewonnen!";
                explanation = "Sie haben das Ende des Spiels mit erfolg erreicht.";
                image = new ImageIcon("src/resources/Successful.png");
            } 
    }

        // Create the end screen panel with the determined content
        endScreenPanel = new EndPanel(caption, explanation, image);

        // Remove all existing components from the frame
        getContentPane().removeAll();
        
        // Add the end screen panel
        add(endScreenPanel, BorderLayout.CENTER);

        // Refresh the frame
        revalidate();
        repaint();
    }
}
