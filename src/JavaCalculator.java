import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char mathOperator;

    private JPanel JavaCalculator;
    private JTextField txtDisplay;
    private JButton buttonEquals;
    private JButton buttonMultiply;
    private JButton buttonTwo;
    private JButton buttonThree;
    private JButton buttonFive;
    private JButton buttonEight;
    private JButton buttonZero;
    private JButton buttonPlus;
    private JButton buttonSix;
    private JButton buttonNine;
    private JButton buttonClear;
    private JButton buttonMinus;
    private JButton buttonDivide;
    private JButton buttonOne;
    private JButton buttonFour;
    private JButton buttonSeven;
    private JButton buttonPoint;

    private void getOperator(String buttonText) {
        mathOperator = buttonText.charAt(0);
        total1 += Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
    }

    public JavaCalculator() {
        //haalt (get) de text die in de button staat op en laat hem zien op de display(set)
        //omdat je meerdere nummer op je display wil kunnen gebruiken roep je steeds de
        // txtdisplay weer op en + je daar de button waarde weer bij op
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonOneText = txtDisplay.getText() + buttonOne.getText();
                txtDisplay.setText(buttonOneText);
            }
        });
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonTwoText = txtDisplay.getText() + buttonTwo.getText();
                txtDisplay.setText(buttonTwoText);
            }
        });
        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonThreeText = txtDisplay.getText() + buttonThree.getText();
                txtDisplay.setText(buttonThreeText);
            }
        });
        buttonFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonFourText = txtDisplay.getText() + buttonFour.getText();
                txtDisplay.setText(buttonFourText);
            }
        });
        buttonFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonFiveText = txtDisplay.getText() + buttonFive.getText();
                txtDisplay.setText(buttonFiveText);
            }
        });
        buttonSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonSixText = txtDisplay.getText() + buttonSix.getText();
                txtDisplay.setText(buttonSixText);
            }
        });
        buttonSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonSevenText = txtDisplay.getText() + buttonSeven.getText();
                txtDisplay.setText(buttonSevenText);
            }
        });
        buttonEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonEightText = txtDisplay.getText() + buttonEight.getText();
                txtDisplay.setText(buttonEightText);
            }
        });
        buttonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonNineText = txtDisplay.getText() + buttonNine.getText();
                txtDisplay.setText(buttonNineText);
            }
        });
        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonZeroText = txtDisplay.getText() + buttonZero.getText();
                txtDisplay.setText(buttonZeroText);
            }
        });
        buttonPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //dit maakt het netter => 0. ipv .
                if (txtDisplay.getText().equals("")) {
                    txtDisplay.setText("0.");
                }
                //dit debuged gevallen al 1... of ..0 0f .4.
                else if (txtDisplay.getText().contains(".")) {
                    buttonPoint.setEnabled(false);
                }
                else {
                    String buttonPointText = txtDisplay.getText() + buttonPoint.getText();
                    txtDisplay.setText(buttonPointText);
                }
                buttonPoint.setEnabled(true);
            }
        });
        //als je op de clear button klikt moet de waarde van tatol2 weer naar 0 en het veld
        // moet een lege string laten zien
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total2 = 0;
                txtDisplay.setText("");
            }
        });
        // ("") cleared de display
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = buttonPlus.getText();
                getOperator(button_text);
            }
        });
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = buttonMinus.getText();
                getOperator(button_text);
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = buttonDivide.getText();
                getOperator(button_text);
            }
        });
        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = buttonMultiply.getText();
                getOperator(button_text);
            }
        });
        //total2 = total1 + Double.parseDouble(txtDisplay.getText()); dit covert de string naar een double en
        //het result wordt dat bij total1 opgeteld en stored in total2
        //omdat het als text een string dus moet worden weergegeven in het display field moet je de
        // double weer naar een string cconverten => txtDisplay.setText(Double.toString(total2));
        //vervolgens kan de total1 weer gecleared worden door hem op 0 te zetten.
        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                switch (mathOperator){
                    case '+':
                        total2 = total1 + Double.parseDouble(txtDisplay.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(txtDisplay.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(txtDisplay.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(txtDisplay.getText());
                        break;
                }

                txtDisplay.setText(Double.toString(total2));
                total1 = 0;
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
