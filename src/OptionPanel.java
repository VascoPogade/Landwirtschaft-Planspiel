import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class OptionPanel extends JPanel {
    private JButton optionButton;

    public OptionPanel(String buttonText) {
        // Setup of the option button
        optionButton = new JButton(buttonText);
        optionButton.setPreferredSize(new Dimension(500, 50)); // Adjust size as needed
        optionButton.setMargin(new Insets(10, 10, 10, 10)); // Adjust padding as needed
        optionButton.setVerticalAlignment(SwingConstants.CENTER); // Align text to top if needed
        optionButton.setFont(new Font("Menlo", Font.PLAIN, 15));

        setLayout(new BorderLayout());
        add(optionButton, BorderLayout.CENTER);
    }

    // Set the text of the option button
    public void setOptionText(String text) {
        optionButton.setText(text);
    }

    // Add an ActionListener to the option button
    public void addOptionButtonListener(ActionListener listener) {
        optionButton.addActionListener(listener);
    }
}
