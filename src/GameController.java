public class GameController {
    private Player player;
    private MainFrame mainFrame;
    int scenarioNumber;

    String[] questions;
    String[] options1;
    String[] options2;

    String questionText1 = "You have the option to invest in new technology for your farm. This will increase your harvest by 10%, but it will also increase your risk by 5%. Do you want to proceed?";
    String questionText2 = "You have the option to implement sustainable farming practices. This will increase your sustainability by 10%, but it will also decrease your harvest by 5%. Do you want to proceed?";
    String questionText3 = "You have the option to increase your workforce. This will increase your employee satisfaction by 10%, but it will also decrease your profit by 5%. Do you want to proceed?";
    String questionText4 = "You have the option to invest in marketing. This will increase your reputation by 10%, but it will also decrease your profit by 5%. Do you want to proceed?";
    String questionText5 = "You have the option to expand your farm. This will increase your harvest by 10%, but it will also increase your risk by 5%. Do you want to proceed?";
    String questionText6 = "You have the option to improve your production process. This will increase your harvest by 10%, but it will also decrease your profit by 5%. Do you want to proceed?";
    String questionText7 = "You have the option to implement long-term cultivation strategies. This will increase your harvest by 15%, but it will also decrease your profit by 10%. Do you want to proceed?";
    String questionText8 = "You have the option to invest in employee training. This will increase your employee satisfaction by 10%, but it will also decrease your profit by 5%. Do you want to proceed?";
    String questionText9 = "You have the option to invest in renewable energy sources. This will increase your sustainability by 15%, but it will also decrease your profit by 10%. Do you want to proceed?";
    String questionText10 = "You have the option to reduce your workforce. This will decrease your employee satisfaction by 10%, but it will also increase your profit by 5%. Do you want to proceed?";
    String questionText11 = "You have the option to reduce your marketing budget. This will decrease your reputation by 10%, but it will also increase your profit by 5%. Do you want to proceed?";
    String questionText12 = "You have the option to reduce your farm size. This will decrease your harvest by 10%, but it will also decrease your risk by 5%. Do you want to proceed?";
    String questionText13 = "You have the option to reduce your investment in technology. This will decrease your harvest by 10%, but it will also decrease your risk by 5%. Do you want to proceed?";
    String questionText14 = "You have the option to reduce your investment in renewable energy sources. This will decrease your sustainability by 15%, but it will also increase your profit by 10%. Do you want to proceed?";
    String questionText15 = "You have the option to reduce your investment in employee training. This will decrease your employee satisfaction by 10%, but it will also increase your profit by 5%. Do you want to proceed?";
    String questionText16 = "You have the option to reduce your investment in sustainable farming practices. This will decrease your sustainability by 10%, but it will also increase your harvest by 5%. Do you want to proceed?";
    String questionText17 = "You have the option to reduce your investment in marketing. This will decrease your reputation by 10%, but it will also increase your profit by 5%. Do you want to proceed?";

    String question1Option1Text = "Invest in new technology";
    String question1Option2Text = "Do not invest in new technology";
    String question2Option1Text = "Implement sustainable farming practices";
    String question2Option2Text = "Do not implement sustainable farming practices";
    String question3Option1Text = "Increase workforce";
    String question3Option2Text = "Do not increase workforce";
    String question4Option1Text = "Invest in marketing";
    String question4Option2Text = "Do not invest in marketing";
    String question5Option1Text = "Expand farm";
    String question5Option2Text = "Do not expand farm";
    String question6Option1Text = "Improve production process";
    String question6Option2Text = "Do not improve production process";
    String question7Option1Text = "Implement long-term cultivation strategies";
    String question7Option2Text = "Do not implement long-term cultivation strategies";
    String question8Option1Text = "Invest in employee training";
    String question8Option2Text = "Do not invest in employee training";
    String question9Option1Text = "Invest in renewable energy sources";
    String question9Option2Text = "Do not invest in renewable energy sources";
    String question10Option1Text = "Reduce workforce";
    String question10Option2Text = "Do not reduce workforce";
    String question11Option1Text = "Reduce marketing budget";
    String question11Option2Text = "Do not reduce marketing budget";
    String question12Option1Text = "Reduce farm size";
    String question12Option2Text = "Do not reduce farm size";
    String question13Option1Text = "Reduce investment in technology";
    String question13Option2Text = "Do not reduce investment in technology";
    String question14Option1Text = "Reduce investment in renewable energy sources";
    String question14Option2Text = "Do not reduce investment in renewable energy sources";
    String question15Option1Text = "Reduce investment in employee training";
    String question15Option2Text = "Do not reduce investment in employee training";
    String question16Option1Text = "Reduce investment in sustainable farming practices";
    String question16Option2Text = "Do not reduce investment in sustainable farming practices";
    String question17Option1Text = "Reduce investment in marketing";
    String question17Option2Text = "Do not reduce investment in marketing";


    public GameController() {
        player = new Player();
        mainFrame = new MainFrame();
        scenarioNumber = 0;
        mainFrame.scenarioPanel.setScenarioText(questionText1);
        mainFrame.optionPanel1.setOptionText(question1Option1Text);
        mainFrame.optionPanel2.setOptionText(question1Option2Text);

        questions = new String[]{questionText1, questionText2, questionText3, questionText4, questionText5, questionText6, questionText7, questionText8, questionText9, questionText10, questionText11, questionText12, questionText13, questionText14, questionText15, questionText16, questionText17};
        options1 = new String[]{question1Option1Text, question2Option1Text, question3Option1Text, question4Option1Text, question5Option1Text, question6Option1Text, question7Option1Text, question8Option1Text, question9Option1Text, question10Option1Text, question11Option1Text, question12Option1Text, question13Option1Text, question14Option1Text, question15Option1Text, question16Option1Text, question17Option1Text};
        options2 = new String[]{question1Option2Text, question2Option2Text, question3Option2Text, question4Option2Text, question5Option2Text, question6Option2Text, question7Option2Text, question8Option2Text, question9Option2Text, question10Option2Text, question11Option2Text, question12Option2Text, question13Option2Text, question14Option2Text, question15Option2Text, question16Option2Text, question17Option2Text};

        mainFrame.optionPanel1.addOptionButtonListener(e -> handleOption1());
        mainFrame.optionPanel2.addOptionButtonListener(e -> handleOption2());

        updateGUI();
    }

    private void handleOption1() {
        // Implement logic for option 1
        // mainFrame.optionPanel1.setOptionText("New explanatory text for Option 1");
        nextScenario();
        updateGUI();
    }

    private void handleOption2() {
        // Implement logic for option 2
        nextScenario();
        updateGUI();
    }

    private void updateGUI() {
        // Update the attributes panel with the player's current attributes extracted from the player object
    }

    private void nextScenario() {
        // Implement logic to move to the next scenario
        if (scenarioNumber >= questions.length - 1) {
            endGame();
        }

        mainFrame.scenarioPanel.setScenarioText(questions[scenarioNumber+1]);
        mainFrame.optionPanel1.setOptionText(options1[scenarioNumber+1]);
        mainFrame.optionPanel2.setOptionText(options2[scenarioNumber+1]);

        scenarioNumber++;
    }

    private void endGame() {
        // Implement logic to end the game
        mainFrame.scenarioPanel.setScenarioText("Game Ended");
    }
}