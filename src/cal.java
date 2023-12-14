import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Frame extends JFrame implements ActionListener {

    JLabel display = new JLabel("0");
    JLabel display2 = new JLabel("");

    JButton clearDisplay = new JButton("C");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton zero = new JButton("0");
    JButton add = new JButton("+");
    JButton subtract = new JButton("-");
    JButton multiply = new JButton("*");
    JButton divide = new JButton("/");
    JButton equal = new JButton("=");

    double num1, num2, result;
    char operator;

    Frame() {
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        equal.addActionListener(this);
        clearDisplay.addActionListener(this);

        display.setBorder(new LineBorder(Color.RED));
        display2.setBorder(new LineBorder(Color.RED));

        this.setLayout(new GridLayout(6, 6, 10, 10));
        this.add(display2);
        this.add(display);
        this.add(clearDisplay);
        this.add(one);
        this.add(two);
        this.add(three);
        this.add(four);
        this.add(five);
        this.add(six);
        this.add(seven);
        this.add(eight);
        this.add(nine);
        this.add(zero);
        this.add(add);
        this.add(subtract);
        this.add(multiply);
        this.add(divide);
        this.add(equal);
    }

    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String buttonText = clickedButton.getText();

        if (Character.isDigit(buttonText.charAt(0))) {
            if(display.getText().equals("0")){
                display.setText("");
            }
            display.setText(display.getText() + buttonText);

        } else if (buttonText.charAt(0) == '+' || buttonText.charAt(0) == '-' ||
                buttonText.charAt(0) == '*' || buttonText.charAt(0) == '/') {
            num1 = Double.parseDouble(display.getText());
            operator = buttonText.charAt(0);
            display2.setText(num1+""+operator);
            display.setText("");
        } else if (buttonText.charAt(0) == '=') {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        display.setBackground(Color.RED);
                        display.setText("Error");
                        return;
                    }
                    break;
            }
            display2.setText("");
            display.setText(String.valueOf(result));
        } else if (buttonText.charAt(0) == 'C') {
            display.setText("");
            display2.setText("");
        }
    }
}

public class cal {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
