import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class ScenarioPanel extends JPanel {
    private JTextPane scenarioText;

    public ScenarioPanel() {
        // Set layout and constraints
        setLayout(new GridBagLayout()); // Use GridBagLayout to center the text
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.insets = new Insets(0, 100, 0, 100); // Space of 40 pixels on left and right

        // Create and configure JTextPane for scenario text
        scenarioText = new JTextPane();
        scenarioText.setText("Eine schwere Energiekrise belastet die Weltwirtschaft und hat die Produktionskosten um circa 15% verteuert. Dies stellt dich vor die schwierige Entscheidung, wie du diese Kosten weitergeben sollst. Eine vollständige Weitergabe der Kosten könnte die Nachfrage senken und dein Ansehen beeinträchtigen, während eine moderate Erhöhung möglicherweise deine Marge verringern, aber die Nachfrage stabil halten könnte. Willst du die Verteuerung in vollem Umfang weitergeben und damit die Kosten decken, oder nur eine moderate Preiserhöhung durchführen, um die Nachfrage hochzuhalten und Kundenloyalität zu fördern, auch wenn dies deine Gewinne schmälert?");
        scenarioText.setFont(new Font("Menlo", Font.PLAIN, 20));
        scenarioText.setEditable(false);
        scenarioText.setBackground(getBackground()); // Make the background of JTextPane match the panel
        scenarioText.setBorder(BorderFactory.createEmptyBorder(60, 0, 20, 0)); // Top and bottom padding

        // Increase line spacing
        SimpleAttributeSet attrs = new SimpleAttributeSet();
        StyleConstants.setLineSpacing(attrs, 0.5f); // Set line spacing (1.0 is the default, 0.5 adds 50% space)
        StyledDocument doc = scenarioText.getStyledDocument();
        doc.setParagraphAttributes(0, doc.getLength(), attrs, false);

        // Add JTextPane to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(scenarioText);
        scrollPane.setBorder(BorderFactory.createEmptyBorder()); // Remove border from JScrollPane
        scrollPane.setViewportBorder(BorderFactory.createEmptyBorder()); // Ensure viewport has no border

        add(scrollPane, gbc);

        setPreferredSize(new Dimension(800, 550)); // Ensure this panel takes up the upper half
    }

    // Method to update the scenario text
    public void setScenarioText(String text) {
        scenarioText.setText(text);
    }
}
