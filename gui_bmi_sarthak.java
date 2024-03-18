import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class gui_bmi_sarthak {
    private JFrame frame;
    private JTextField heightField;
    private JTextField weightField;
    private JTextField resultField;

    public gui_bmi_sarthak() {
        frame = new JFrame("BMI Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2));

        JLabel heightLabel = new JLabel("Height (in cm):");
        heightField = new JTextField();
        JLabel weightLabel = new JLabel("Weight (in kg):");
        weightField = new JTextField();
        JButton calculateButton = new JButton("Calculate");
        resultField = new JTextField();

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double height = Double.parseDouble(heightField.getText());
                double weight = Double.parseDouble(weightField.getText());

                double bmi = calculateBMI(height, weight);
                resultField.setText(String.format("%.2f", bmi));
            }
        });

        frame.add(heightLabel);
        frame.add(heightField);
        frame.add(weightLabel);
        frame.add(weightField);
        frame.add(calculateButton);
        frame.add(resultField);

        frame.setVisible(true);
    }

    private double calculateBMI(double height, double weight) {
        double heightInMeters = height / 100;
        return weight / (heightInMeters * heightInMeters);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new gui_bmi_sarthak();
            }
        });
    }
}
