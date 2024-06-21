import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public ScenarioPanel scenarioPanel;
    public OptionPanel optionPanel1;
    public OptionPanel optionPanel2;
    public AttributesPanel attributesPanel;
    public EndPanel endScreenPanel;

    public MainFrame() {
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
        // Create the end screen panel with a caption and an image
        String caption = "Game Over";
        ImageIcon image = new ImageIcon("src/resources/Picture_of_Famer_2.png");
        String explanation = "You are out of money and your farm is bankrupt. The bank came and took your whole farm away. Better luck next time! jbhwbefbjwbef ibqnwfjbseibvnjibsd ivhaisnvuibo aesnvjbeisba ovniuwbesvdnjkbis avnbwbefhine ufhwe wcwfwv wedwfwqfw wefwqwf wedwd wdwqd";
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
