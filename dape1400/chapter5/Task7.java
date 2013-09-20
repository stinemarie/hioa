/* Oppgave 7

Lag et program som leser inn hele tall fra brukeren inntil det blir
lest inn et negativt tall. Programmet skal telle opp hvor mange av de
innleste tallene som er mellom 10 og 50 (ingen av grensene inkludert)
og skrive ut dette antallet. */

import javax.swing.JOptionPane;

public class Task7
{
    private static final int LOWER = 10;
    private static final int UPPER = 50;

    private static int inputInteger()
    {
        return Integer.parseInt( JOptionPane.showInputDialog( "Oppgi et heltall. Negative tall avslutter." ) );
    }

    public static void main( String[] args )
    {
        int counted = 0;

        for ( int n = inputInteger(); n >= 0; n = inputInteger() ) {
            if ( LOWER < n && n < UPPER )
                counted += 1;
        }

        JOptionPane.showMessageDialog( null, counted + " tall var større enn " + LOWER + " og mindre enn " + UPPER + ".",
                                       "Antall", JOptionPane.INFORMATION_MESSAGE );
    }
}
