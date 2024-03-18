import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui_celcius_sarthak extends JFrame {
    private JTextField fahrenheitTextField;
    private JLabel celsiusLabel;

    public gui_celcius_sarthak() {
        setTitle("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        // Create components
        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        fahrenheitTextField = new JTextField(10);
        JButton convertButton = new JButton("Convert");
        celsiusLabel = new JLabel("Celsius:");

        // Set layout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(fahrenheitLabel);
        add(fahrenheitTextField);
        add(convertButton);
        add(celsiusLabel);

        // Add action listener to the convert button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertTemperature();
            }
        });
    }

    private void convertTemperature() {
        try {
            double fahrenheit = Double.parseDouble(fahrenheitTextField.getText());
            double celsius = (fahrenheit - 32) * 5 / 9;
            celsiusLabel.setText("Celsius: " + celsius);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter a valid temperature in Fahrenheit.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new gui_celcius_sarthak().setVisible(true);
            }
        });
    }
}
