import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui_sarthak_interface_q4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Leap Year Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JLabel yearLabel = new JLabel("Enter a year:");
        JTextField yearTextField = new JTextField(10);
        JButton checkButton = new JButton("Check");

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String yearString = yearTextField.getText();
                int year = Integer.parseInt(yearString);

                boolean isLeapYear = isLeapYear(year);

                String result;
                if (isLeapYear) {
                    result = year + " is a leap year.";
                } else {
                    result = year + " is not a leap year.";
                }

                JOptionPane.showMessageDialog(frame, result);
            }
        });

        frame.add(yearLabel);
        frame.add(yearTextField);
        frame.add(checkButton);

        frame.setVisible(true);
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
