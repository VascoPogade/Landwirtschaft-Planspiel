import javax.swing.*;
import java.awt.*;

public class EndPanel extends JPanel {
    public EndPanel(String caption, ImageIcon image) {
        setLayout(new BorderLayout());

        JLabel captionLabel = new JLabel(caption, JLabel.CENTER);
        captionLabel.setFont(new Font("Serif", Font.BOLD, 36)); // Customize font size and style
        add(captionLabel, BorderLayout.NORTH);

        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50)); // Add padding around the image

        JLabel imageLabel = new JLabel(image);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imagePanel.add(imageLabel, BorderLayout.CENTER);

        add(imagePanel, BorderLayout.CENTER);
    }
}
