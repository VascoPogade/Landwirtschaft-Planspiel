import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class OptionPanel extends JPanel {
    private JButton optionButton;

    public OptionPanel(String buttonText) {
        optionButton = new JButton(buttonText);
        optionButton.setPreferredSize(new Dimension(500, 50)); // Adjust size as needed
        optionButton.setMargin(new Insets(10, 10, 10, 10)); // Adjust padding as needed
        optionButton.setVerticalAlignment(SwingConstants.CENTER); // Align text to top if needed
        optionButton.setFont(new Font("Menlo", Font.PLAIN, 15));

        setLayout(new BorderLayout());
        add(optionButton, BorderLayout.CENTER);
    }

    public void setOptionText(String text) {
        optionButton.setText(text);
    }

    public void addOptionButtonListener(ActionListener listener) {
        optionButton.addActionListener(listener);
    }
}
