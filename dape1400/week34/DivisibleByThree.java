import javax.swing.JOptionPane;

public class DivisibleByThree {
    public static int inputInteger( String message )
    {
        return Integer.parseInt(JOptionPane.showInputDialog (message));
    }

    public static void main ( String[] args )
    {
        int number;
        String message;

        // Input an integer
        number = inputInteger("Oppgi et heltall.");

        // If the integer is divisible with 3, output "<n> is divisible by 3"
        if ( number % 3 == 0 ) {
            message = number + " is divisable by 3.";
        }
        else { // number % 3 != 0
            // It not then output "<n> is not divisible by 3"
            message = number + " is not divisable by 3.";
        }

        // Display the message
        JOptionPane.showMessageDialog(null, message);
    }
}