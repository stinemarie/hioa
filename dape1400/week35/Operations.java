import javax.swing.JOptionPane;

public class Operations
{
    public static float inputFloat ( String message )
    {
        return Float.parseFloat( JOptionPane.showInputDialog( message ) );
    }

    public static void main ( String[] args )
    {
        float a, b, sum, product, difference, quotient;

        // Input two floats
        a = inputFloat( "Enter a decimal number." );
        b = inputFloat( "Enter another decimal number." );

        // Calculate sum, product, difference and quotient
        sum = a + b;
        product = a * b;
        difference = a - b;
        quotient = a / b;

        // Output results
        JOptionPane.showMessageDialog(null,
                                      "Sum: " + a + " + " + b + " = " + sum + "\n" +
                                      "Product: " + a + " * " + b + " = " + product + "\n" +
                                      "Difference: " + a + " - " + b + " = " + difference + "\n" +
                                      "Quotient: " + a + " / " + b + " = " + quotient);
    }
}
