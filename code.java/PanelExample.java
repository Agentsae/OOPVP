import javax.swing.*;
import java.awt.*;

public class PanelExample {

     public static void main(String[] args) {
        JFrame frame = new JFrame("Panel Example");

        JPanel panel = new JPanel();
        panel.setBounds(50, 50, 300, 200);
        panel.setBackground(Color.CYAN);
        panel.setLayout(null);

        JButton button1 = new JButton("Button 1");
        button1.setBounds(20, 20, 100, 30);
        panel.add(button1);

        JButton button2 = new JButton("Button 2");
        button2.setBounds(150, 20, 100, 30);
        panel.add(button2);

        JTextArea area = new JTextArea("This is a panel example.");
        area.setBounds(20, 70, 250, 100);
        panel.add(area);

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}
