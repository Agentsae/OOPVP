import javax.swing.*;
            
    public class PasswordFieldExample {
         public static void main(String[] args) {
                JFrame frame = new JFrame("Password Field Example");
            
                    JPasswordField passwordField = new JPasswordField(10);
                    passwordField.setBounds(50, 50, 200, 30);
                    frame.add(passwordField);
            
                    JButton toggleButton = new JButton("Show");
                    toggleButton.setBounds(260, 50, 80, 30);
                    frame.add(toggleButton);
            
                    JButton submitButton = new JButton("Submit");
                    submitButton.setBounds(50, 100, 100, 30);
                    frame.add(submitButton);
            
                    // Toggle Show/Hide functionality
                    toggleButton.addActionListener(e -> {
                        if (toggleButton.getText().equals("Show")) {
                            passwordField.setEchoChar((char) 0);  // Show password
                            toggleButton.setText("Hide");
                        } else {
                            passwordField.setEchoChar('•');  // Hide password (use • or *)
                            toggleButton.setText("Show");
                        }
                    });
            
                    submitButton.addActionListener(e -> {
                        char[] password = passwordField.getPassword();
                        JOptionPane.showMessageDialog(frame, "New Password entered");
                    });
            
                    frame.setSize(400, 400);
                    frame.setLayout(null);
                    frame.setVisible(true);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }