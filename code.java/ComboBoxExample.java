import javax.swing.*;

public class ComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Example");

        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setBounds(50, 50, 100, 30);
        frame.add(comboBox);

        JButton button = new JButton("Submit");
        button.setBounds(50, 100, 100, 30);
        frame.add(button);

        button.addActionListener(e -> {
            String selectedOption = "Selected: " + comboBox.getSelectedItem();
            JOptionPane.showMessageDialog(frame, selectedOption);
        });

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
