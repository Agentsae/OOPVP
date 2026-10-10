import javax.swing.*;

public class CheckBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Check Box Example");

        JCheckBox cb1 = new JCheckBox("c++");
        cb1.setBounds(50, 50, 100, 30);
        frame.add(cb1);

        JCheckBox cb2 = new JCheckBox("Java", true);
        cb2.setBounds(50, 100, 100, 30);
        frame.add(cb2);

        JButton button = new JButton("Submit");
        button.setBounds(50, 150, 100, 30);
        frame.add(button);

        button.addActionListener(e -> {
            StringBuilder selectedOptions = new StringBuilder("Selected: ");
            if (cb1.isSelected()) selectedOptions.append("Option 1 ");
            if (cb2.isSelected()) selectedOptions.append("Option 2 ");
            JOptionPane.showMessageDialog(frame, selectedOptions.toString());
        });

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}