import javax.swing.*;

public class RadioExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button Example");

        JRadioButton rb1 = new JRadioButton("Option 1");
        rb1.setBounds(50, 50, 100, 30);
        frame.add(rb1);

        JRadioButton rb2 = new JRadioButton("Option 2", true);
        rb2.setBounds(50, 100, 100, 30);
        frame.add(rb2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        JButton button = new JButton("Submit");
        button.setBounds(50, 150, 100, 30);
        frame.add(button);

        button.addActionListener(e -> {
            String selectedOption = "Selected: ";
            if (rb1.isSelected()) selectedOption += "Option 1";
            else if (rb2.isSelected()) selectedOption += "Option 2";
            JOptionPane.showMessageDialog(frame, selectedOption);
        });

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
