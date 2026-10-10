import javax.swing.*;

public class TextFieldExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Text Field Example");

        JTextField t1, t2;
        t1 = new JTextField(10);
        t1.setText("Welcome to Java");
        t1.setBounds(50, 100, 200, 30);
        frame.add(t1);

        t2 = new JTextField(10);
        t2.setText("AWT tutorial");
        t2.setBounds(50, 150, 200, 30);
        frame.add(t2);
        JButton button = new JButton("Submit");


        button.addActionListener(e -> {
            String input = t1.getText();
            JOptionPane.showMessageDialog(frame, "You entered: " + input);
        });

        button.setBounds(50, 200, 100, 30);
        
        frame.add(button);
        frame.setSize (400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}