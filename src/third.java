import javax.swing.*;
import java.awt.*;

class Frame extends JFrame{
    Frame(){

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

