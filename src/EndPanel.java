import javax.swing.*;
import java.awt.*;

public class EndPanel extends JPanel {
    public EndPanel(String caption, String explanation, ImageIcon image) {
        setLayout(new BorderLayout());

        JPanel textPanel = new JPanel(new BorderLayout());

        // Caption label
        JLabel captionLabel = new JLabel(caption, JLabel.CENTER);
        captionLabel.setFont(new Font("Serif", Font.BOLD, 36)); // Customize font size and style
        textPanel.add(captionLabel, BorderLayout.NORTH);

        // Explanation text label
        JTextArea explanationText = new JTextArea(explanation);
        explanationText.setFont(new Font("Serif", Font.PLAIN, 18)); // Customize font size and style
        explanationText.setLineWrap(true);
        explanationText.setWrapStyleWord(true);
        explanationText.setEditable(false);
        explanationText.setOpaque(false); // Make the JTextArea background transparent
        explanationText.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50)); // Add padding around the text

        // Scroll pane for the explanation text
        JScrollPane scrollPane = new JScrollPane(explanationText);
        scrollPane.setBorder(BorderFactory.createEmptyBorder()); // Remove the border of the scroll pane
        scrollPane.setOpaque(false); // Make the JScrollPane background transparent
        scrollPane.getViewport().setOpaque(false); // Make the JViewport background transparent
        textPanel.add(scrollPane, BorderLayout.CENTER);
        
        add(textPanel, BorderLayout.NORTH);

        // Image panel
        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50)); // Add padding around the image

        JLabel imageLabel = new JLabel(image);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imagePanel.add(imageLabel, BorderLayout.CENTER);

        add(imagePanel, BorderLayout.CENTER);
    }
}
