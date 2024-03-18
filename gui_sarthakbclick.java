import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui_sarthakbclick {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Click Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Click a button");
        panel.add(label);

        JButton button1 = new JButton("Button 1");
        panel.add(button1);

        JButton button2 = new JButton("Button 2");
        panel.add(button2);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button-1 clicked");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button-2 clicked");
            }
        });

        frame.setVisible(true);
    }
}
