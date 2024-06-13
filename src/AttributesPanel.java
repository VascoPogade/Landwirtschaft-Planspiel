import javax.swing.*;
import java.awt.*;

public class AttributesPanel extends JPanel {
    private JLabel[] attributes;

    public AttributesPanel() {
        attributes = new JLabel[6];
        for (int i = 0; i < 6; i++) {
            attributes[i] = new JLabel("Attribute " + (i + 1) + ": 50");
        }

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