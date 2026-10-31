import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyListener Example");
        JLabel label = new JLabel("Label: ");
        JTextField textField = new JTextField(15);
        
        textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                label.setText("Label: Key Pressed: " + e.getKeyChar());
            }
        });
        
        frame.setLayout(new FlowLayout());
        frame.add(textField);
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}