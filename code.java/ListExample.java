import javax.swing.*;

public class ListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("List Example");

        DefaultListModel<String> lm = new DefaultListModel<>();
        lm.addElement("Lagu 1");
        lm.addElement("Lagu 2");
        lm.addElement("Lagu 3");
        lm.addElement("Lagu 4");

        JList<String> list = new JList<>(lm);
        list.setBounds(50, 50, 100, 80);
        frame.add(list);

        JButton button = new JButton("Show Selected");
        button.setBounds(50, 150, 150, 30);
        frame.add(button);

        button.addActionListener(e -> {
            String selectedItem = list.getSelectedValue();
            JOptionPane.showMessageDialog(frame, "Selected: " + selectedItem);
        });

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
