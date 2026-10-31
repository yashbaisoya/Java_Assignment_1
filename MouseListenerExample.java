import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseListener Example");
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(200, 200));
        
        panel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(Color.BLUE);
            }
            public void mouseExited(MouseEvent e) {
                panel.setBackground(Color.LIGHT_GRAY);
            }
        });
        
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}