import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public ScenarioPanel scenarioPanel;
    public OptionPanel optionPanel1;
    public OptionPanel optionPanel2;
    public AttributesPanel attributesPanel;
    public EndPanel endScreenPanel;

    public MainFrame() {
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

    public void showEndScreen() {
        String  caption;
        String explanation;
        ImageIcon image;
        Player player = GameController.getPlayer();
        // TODO: Bilder durch richtige Bilder ersetzen
        if (player.getVermoegen() <= 0) {
            caption = "Bankrott";
            explanation = "Schulden über Schulden. Die Farm gehört nun der Bank.";
            image = new ImageIcon("src/resources/beispiel.png");
        } else if (player.getNachhaltigkeit() < 15) {
            caption = "Ökologisches Desaster";
            explanation = "Deine Farm verschmutzt die Umwelt. Landesweite Proteste zwingen dich, die Farm zu schließen.";
            image = new ImageIcon("src/resources/beispiel.png");
        } else if (player.getAnsehen() < 15) {
            caption = "Widerstand der Gemeinschaft";
            explanation = "Die Gemeinschaft lehnt deine Anbaumethoden ab. Deine Farm verliert an Ansehen und Marktanteil.";
            image = new ImageIcon("src/resources/beispiel.png");
        } else if (player.getErnte() < 15) {  
            caption = "Missernte";
            explanation = "Die Ernte ist zu gering ausgefallen. Du kannst deine Verpflichtungen nicht erfüllen und musst die Farm schließen.";
            image = new ImageIcon("src/resources/poor_harvest_image.png");
        } else if (player.getMitarbeiterzufriedenheit() < 15) {  // Assuming 'Mitarbeiterzufriedenheit' represents employee satisfaction
            caption = "Mitarbeiteraufstand";
            explanation = "Deine Mitarbeiter sind nicht zufrieden wie du deine Farm leitest. Die Arbeiter streiken, und die Farm kann nicht weiter betrieben werden.";
            image = new ImageIcon("src/resources/beispiel.png");
        } else {
            // Default or fallback scenario if none of the above conditions are met
            caption = "Spiel vorbei";
            explanation = "Spiel vorbei aus unbekannten Gründen.";
            image = new ImageIcon("src/resources/default_image.png");
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
