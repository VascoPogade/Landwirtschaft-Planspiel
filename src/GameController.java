public class GameController {
    private Player player;
    private MainFrame mainFrame;

    public GameController() {
        player = new Player();
        mainFrame = new MainFrame();
        
        mainFrame.optionPanel1.addOptionButtonListener(e -> handleOption1());
        mainFrame.optionPanel2.addOptionButtonListener(e -> handleOption2());

        updateGUI();
    }

    private void handleOption1() {
        // Implement logic for option 1
        updateGUI();
    }

    private void handleOption2() {
        // Implement logic for option 2
        updateGUI();
    }

    private void updateGUI() {
        // Update the attributes panel with the player's current attributes extracted from the player object
    }

    public static void main(String[] args) {
        new GameController();
    }
}
