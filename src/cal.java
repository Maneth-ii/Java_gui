import javax.swing.*;
import java.awt.*;

class Frame extends JFrame{

    JLabel label;
    Frame(){
        label = new JLabel();
        label.setText("Java");
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(JLabel.CENTER);


        this.add(label);
    }
}

public class third {
    public static void main(String[] args){
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setBounds(0,0,400,400);

    }
}

