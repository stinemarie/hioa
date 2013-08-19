import javax.swing.JOptionPane;

public class Greeter {
    public static void main(String[] args) {
        String first_name, last_name, full_name;
        // Input first name
        first_name = JOptionPane.showInputDialog("Enter first name:");

        // Input last name
        last_name = JOptionPane.showInputDialog("Enter last name:");

        // Join the first name and surname into full name
        full_name = first_name + " " + last_name;

        // Print the full name as part of a text
        JOptionPane.showMessageDialog(null, "Hello, " + full_name + "!");
    }
}
