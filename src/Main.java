import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainFrame extends JFrame implements ActionListener {
    JLabel title;
    int count;
    JButton incrementButton;
    JButton decrementButton;

    MainFrame() {
        title = new JLabel();
        title.setText("Hello, World! " + count);
        title.setVerticalAlignment(JLabel.TOP);
        title.setSize(30, 30);
        title.setHorizontalAlignment(JLabel.CENTER);

//increment
        incrementButton = new JButton("increment");
        incrementButton.setBackground(Color.CYAN);
        incrementButton.addActionListener(this); // Add ActionListener to incrementButton

//decremetn
        decrementButton = new JButton("decrement");
        decrementButton.setBackground(Color.RED);
        decrementButton.addActionListener(this); // Add ActionListener to decrementButton
//input Field


        this.setLayout(new FlowLayout());
        this.add(title);
        this.add(incrementButton);
        this.add(decrementButton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == incrementButton) {
            count++;
        }
        if (e.getSource() == decrementButton) {
            count--;
        }
        title.setText("Hello, World! " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();

        frame.setVisible(true);
        frame.setTitle("JAVA");
        frame.setSize(800, 680);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
