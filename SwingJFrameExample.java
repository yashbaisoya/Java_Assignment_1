import javax.swing.*;

public class SwingJFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Swing App");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}