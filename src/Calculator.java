import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Calculator {
    int boardWidth = 360; //window
    int boardHeight = 540;

    Color light = new Color(238,240,235);
    Color darkSmooth = new Color(244,249,233);
    Color darkDarker = new Color(180, 184, 171);
    Color blue = new Color(40,75,99);
    Color black = new Color(28,28,28);

    String[] buttonValues = {
            "AC", "+/-", "%", "÷",
            "7", "8", "9", "×",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", ".", "√", "="
    };
    String[] rightSymbols = {"÷", "×", "-", "+", "="};
    String[] topSymbols = {"AC", "+/-", "%"};

    JFrame frame = new JFrame("Calculator");
    JLabel displayLabel = new JLabel();
    JPanel displayPanel = new JPanel();
    JPanel buttonsPanel = new JPanel();

    Calculator(){
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        displayLabel.setBackground(darkDarker);
        displayLabel.setForeground(black);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 80));
        displayLabel.setHorizontalAlignment(JLabel.RIGHT);
        displayLabel.setText("0");
        displayLabel.setOpaque(true);

        displayPanel.setLayout(new BorderLayout());
        displayPanel.add(displayLabel);
        frame.add(displayPanel, BorderLayout.NORTH);

        buttonsPanel.setLayout(new GridLayout(5,4)); //5 rows | 4 columns
        buttonsPanel.setBackground(darkSmooth);
        frame.add(buttonsPanel);

        for (int i = 0; i < buttonValues.length; i++){
            JButton button = new JButton();
            String buttonValue = buttonValues[i];
            button.setFont(new Font("Arial", Font.PLAIN, 30));
            button.setText(buttonValue);
            button.setFocusable(false);
            button.setBorder(new LineBorder(darkDarker));
            if (Arrays.asList(topSymbols).contains(buttonValue)){
                button.setBackground(light);
                button.setForeground(black);
            }
            else if (Arrays.asList(rightSymbols).contains(buttonValue)){
                button.setBackground(blue);
                button.setForeground(black);
            }
            else {
                button.setBackground(darkDarker);
                button.setForeground(black);
            }

            buttonsPanel.add(button);

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    String buttonValue = button.getText();
                    if (Arrays.asList(rightSymbols).contains(buttonValue)){

                    }
                    else if (Arrays.asList(topSymbols).contains(buttonValue)){

                    }
                    else { //digits or .

                    }
                }
            });
        }
    }
}
