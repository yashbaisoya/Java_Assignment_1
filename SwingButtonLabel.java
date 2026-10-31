import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingButtonLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Button & Label");
        JLabel label = new JLabel("Initial Label Text");
        JButton button = new JButton("Click the button");
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Pressed");
            }
        });
        
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}