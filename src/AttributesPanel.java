import javax.swing.*;
import java.awt.*;

public class AttributesPanel extends JPanel {
    private JLabel[] attributes;
    private JLabel Ernte;
    private JLabel Vermoegen;
    private JLabel Mitarbeiterzufriedenheit;
    private JLabel Nachhaltigkeit;
    private JLabel Ansehen;
    private JLabel Risiko;

    public AttributesPanel() {
        attributes = new JLabel[6];

        // Initialize the attribute labels
        Ernte = new JLabel("Ernte: 50");
        Vermoegen = new JLabel("Vermoegen: 50000€");
        Mitarbeiterzufriedenheit = new JLabel("Mitarbeiterzufriedenheit: 50");
        Nachhaltigkeit = new JLabel("Nachhaltigkeit: 50");
        Ansehen = new JLabel("Ansehen: 50");
        Risiko = new JLabel("Risiko: 5%");

        // Set the attributes array
        attributes[0] = Ernte;
        attributes[1] = Vermoegen;
        attributes[2] = Mitarbeiterzufriedenheit;
        attributes[3] = Nachhaltigkeit;
        attributes[4] = Ansehen;
        attributes[5] = Risiko;

        // Set the layout of the panel to a 1x6 grid
        setLayout(new GridLayout(1, 6));
        for (JLabel attribute : attributes) {
            add(attribute);
        }
    }

    // Sets the text of the attribute at the given index
    public void setAttributeValue(int index, String valueName, int value) {
        if(index == 1){
            attributes[index].setText(valueName + ": " + value + "€");
        } else if (index == 5) {
            if(value > 0) {
                attributes[index].setText(valueName + ": " + value + "%");
            } else {
                attributes[index].setText(valueName + ": " + 0 + "%");
            }
        } else {
            attributes[index].setText(valueName + ": " + value);
        }
    }
}