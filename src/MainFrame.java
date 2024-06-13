import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public ScenarioPanel scenarioPanel;
    public OptionPanel optionPanel1;
    public OptionPanel optionPanel2;
    public AttributesPanel attributesPanel;

    public MainFrame() {
        setTitle("Farm Management Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
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

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
