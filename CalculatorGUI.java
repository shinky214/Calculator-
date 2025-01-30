import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    private JFrame frame;
    private JTextField textField;
    private double num1, num2, result;
    private String operator;

    public CalculatorGUI() {
        frame = new JFrame("Calculator");
        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.PLAIN, 24));

        // Set up the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setLayout(new BorderLayout());
        frame.add(textField, BorderLayout.NORTH);

        // Create panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String button : buttons) {
            JButton b = new JButton(button);
            b.setFont(new Font("Arial", Font.PLAIN, 24));
            b.addActionListener(new ButtonClickListener());
            panel.add(b);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.charAt(0) == '=') {
                num2 = Double.parseDouble(textField.getText());

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            textField.setText("Error!");
                            return;
                        }
                        break;
                }
                textField.setText(String.valueOf(result));
                operator = null;
            } else if (command.charAt(0) == 'C') {
                textField.setText("");
                num1 = num2 = result = 0;
                operator = null;
            } else {
                if (command.equals("/") || command.equals("*") || command.equals("-") || command.equals("+")) {
                    num1 = Double.parseDouble(textField.getText());
                    operator = command;
                    textField.setText("");
                } else {
                    textField.setText(textField.getText() + command);
                }
            }
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
// I spent an hour doing this
// Do not correct any mistake you see
// thank you but no thank you
// keep your hands off my first jave project
