import java.awt.*;
import java.awt.event.*;

public class AWTButtonClick {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Button Example");
        Button button = new Button("Click the button");
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });
        
        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}