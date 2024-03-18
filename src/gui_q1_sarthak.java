import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui_q1_sarthak {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create the JFrame
        JFrame frame = new JFrame("Addition Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Create the JLabels
        JLabel num1Label = new JLabel("Number 1:");
        JLabel num2Label = new JLabel("Number 2:");
        JLabel resultLabel = new JLabel("Result:");

        // Create the JTextFields
        JTextField num1Field = new JTextField(10);
        JTextField num2Field = new JTextField(10);
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);

        // Create the JButton
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the values from the text fields
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());

                // Perform the addition
                int result = num1 + num2;

                // Set the result in the result field
                resultField.setText(String.valueOf(result));
            }
        });

        // Add the components to the frame
        frame.add(num1Label);
        frame.add(num1Field);
        frame.add(num2Label);
        frame.add(num2Field);
        frame.add(addButton);
        frame.add(resultLabel);
        frame.add(resultField);

        // Display the frame
        frame.setVisible(true);
    }
}
