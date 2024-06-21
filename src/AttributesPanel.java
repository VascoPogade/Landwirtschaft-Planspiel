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

        Ernte = new JLabel("Ernte: 50");
        Vermoegen = new JLabel("Vermoegen: 50");
        Mitarbeiterzufriedenheit = new JLabel("Mitarbeiterzufriedenheit: 50");
        Nachhaltigkeit = new JLabel("Nachhaltigkeit: 50");
        Ansehen = new JLabel("Ansehen: 50");
        Risiko = new JLabel("Risiko: 5");

        attributes[0] = Ernte;
        attributes[1] = Vermoegen;
        attributes[2] = Mitarbeiterzufriedenheit;
        attributes[3] = Nachhaltigkeit;
        attributes[4] = Ansehen;
        attributes[5] = Risiko;

        setLayout(new GridLayout(1, 6));
        for (JLabel attribute : attributes) {
            add(attribute);
        }
    }

    public void setAttributeValue(int index, int value) {
        if (index >= 0 && index < attributes.length) {
            attributes[index].setText("Attribute " + (index + 1) + ": " + value);
        }
    }
}