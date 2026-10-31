import java.awt.*;
import java.awt.event.*;

public class AWTMenuExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Menu Example");
        MenuBar menuBar = new MenuBar();
        
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        
        frame.setMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setVisible(true);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}