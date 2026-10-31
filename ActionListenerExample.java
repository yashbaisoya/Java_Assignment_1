import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener Example");
        JButton button = new JButton("Click the button");
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hello User");
            }
        });
        
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}