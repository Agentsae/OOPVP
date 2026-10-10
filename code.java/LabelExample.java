import javax.swing.*;

public class LabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Example");

        JLabel l1,l2;

       
        l1=new JLabel("First Label");
        l1.setBounds(50, 50, 150, 30);
        frame.add(l1);

        l2 = new JLabel("Second Label");
        l2.setBounds(50, 100, 150, 30);
        frame.add(l2);

        JButton button = new JButton("Click Me");
        button.setBounds(50, 150, 100, 30);
        frame.add(button);

        button.addActionListener(e -> {
            l1.setText("Button Clicked!");
            l2.setText("You clicked the button.");
        });

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
