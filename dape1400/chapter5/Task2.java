/* Oppgave 2

Lag et program som leser inn 10 heltallsverdier fra brukeren og
skriver ut (i en dialogboks) den største verdien som ble lest inn.  */

import javax.swing.JOptionPane;

public class Task2
{
    private static int inputInteger ()
    {
        return Integer.parseInt( JOptionPane.showInputDialog( "Oppgi et heltall." ) );
    }

    public static void main ( String[] args ) {
        int max = inputInteger();

        for ( int i = 0; i < 9; i++ )
        {
            max = Math.max( max, inputInteger() );
        }

        JOptionPane.showMessageDialog(null, "Det største tallet du oppga var " + max);
    }
}
