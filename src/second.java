import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.MissingFormatArgumentException;

class MainFrame1 extends JFrame implements ActionListener{
        String word = "--";
        JTextField inputField;
        JButton submitBtn;
        JLabel label;
    MainFrame1(){

        inputField = new JTextField("Hello");
        submitBtn = new JButton("submit");
        label = new JLabel(word);

        label.setForeground(Color.white);
        inputField.setColumns(10);

        submitBtn.setBackground(Color.red);
        submitBtn.setForeground(Color.WHITE);
        submitBtn.addActionListener(this);

        this.setLayout(new FlowLayout());
        this.add(inputField);
        this.add(submitBtn);
        this.add(label);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == submitBtn){
            String word = inputField.getText();
            label.setText(word);
        }
    }
}

class second{
    public static void main(String[] args){
        MainFrame1 frame = new MainFrame1();

        frame.setTitle("Hello Program");
        frame.setBounds(0,0,200,420);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.black);
        frame.getContentPane().setForeground(Color.white);



    }
}