
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Exp10_1 extends JFrame implements ActionListener {
    private JTextField input1;
    private JTextField input2;
    private JTextField output;

    public Exp10_1() {
        // Create text fields
        input1 = new JTextField(10);
        input2 = new JTextField(10);
        output = new JTextField(10);
        output.setEditable(false); // Disable editing in the output field

        // Create buttons
        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Subtract");
        JButton mulButton = new JButton("Multiply");
        JButton divButton = new JButton("Divide");

        // Add action listeners
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        // Add components to the frame
        add(new JLabel("Input 1:"));
        add(input1);
        add(new JLabel("Input 2:"));
        add(input2);
        add(new JLabel("Output:"));
        add(output);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        
        // Set the frame properties
        setLayout(new java.awt.FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Simple Calculator");
        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        try {
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());
            double result = 0;

            switch (command) {
                case "Add":
                    result = num1 + num2;
                    break;
                case "Subtract":
                    result = num1 - num2;
                    break;
                case "Multiply":
                    result = num1 * num2;
                    break;
                case "Divide":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        output.setText("Error: Div by 0");
                        return;
                    }
                    break;
            }

            output.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            output.setText("Error: Invalid Input");
        }
    }

    public static void main(String[] args) {
        new Exp10_1();
    }
}

