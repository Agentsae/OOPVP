import java.awt.event.*;
import java.awt.*;

public class ActionListenerExample implements ActionListener, WindowListener {

    TextField tf;
    
    public void actionPerformed(ActionEvent e) {
        tf.setText("Button Clicked !");
    }

    public ActionListenerExample() {
        Frame f = new Frame("ActionListener Example");

        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);

        Button b = new Button("Click Here");
        b.setBounds(50, 100, 60, 30);

        b.addActionListener(this);
        f.addWindowListener(this);
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ActionListenerExample();
    }

    // WindowListener methods
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowClosed(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
}