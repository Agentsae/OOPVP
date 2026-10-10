import javax.swing.*;

public class TextAreaExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Area Example");

        JTextArea area = new JTextArea("Welcome to Java");
        area.setBounds(50, 50, 200, 100);
        frame.add(area);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
