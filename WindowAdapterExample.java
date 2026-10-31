import javax.swing.*;
import java.awt.event.*;

public class WindowAdapterExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("WindowAdapter Example");
        frame.setSize(300, 200);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Application terminates");
                System.exit(0);
            }
        });
        
        frame.setVisible(true);
    }
}