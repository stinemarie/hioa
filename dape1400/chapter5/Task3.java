/* Oppgave 3

Utvid programmet fra oppgave 2 slik at det også skriver ut det nest største av de tallene som ble lest inn.
*/

import javax.swing.JOptionPane;

public class Task3
{
    private static int inputInteger ()
    {
        return Integer.parseInt( JOptionPane.showInputDialog( "Oppgi et positivt heltall." ) );
    }

    public static void main ( String[] args ) {
        /* This program only deals with positive integers. */
        int largest = 0;
        int second_largest = 0;
        int n; // current number in for loop

        for ( int i = 0; i < 10; i++ )
        {
            n = inputInteger();
            if ( n > largest )
            {
                second_largest = largest;
                largest = n;
            }
        }

        JOptionPane.showMessageDialog(null,
                                      "Det største tallet du oppga var " + largest
                                      + " og det nest største " + second_largest);
    }
}
