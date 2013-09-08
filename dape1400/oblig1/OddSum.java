/* Matias Hermanrud Fjeld <mhf@hex.no>, S193364, DAPE1400 */

/*

Oppgave 2
---------

Lag et applikasjonsprogram som beregner og skriver ut summen av alle
oddetall mellom to grenser som brukeren skriver inn.

Programmet skal starte med å lese inn nedre og øvre grense for
summen. Dersom innlest øvre grense er mindre enn eller lik nedre
grense, skal programmet skrive ut en melding til brukeren om dette og
foreta ny innlesing. Dette skal gjentas inntil det er lest inn en øvre
grense som er større enn nedre grense.

Når godkjente grenser er lest inn, skal programmet beregne nevnte sum
og summen skal så skrives ut.

Grensene trenger ikke å være partall, men hvis en eller begge er det,
skal de tas med i summen.

 */

import javax.swing.JOptionPane;


/**
 * Application that calculates the sum of all odd numbers between two bounds
 */
public class OddSum
{
    public static int sum(int m, int n)
    {
        if ( m >= n )
            throw new IllegalArgumentException("The lower bound must be lower than the upper bound.");

        int sum = 0;

        // Include even bounds in the sum
        if ( m % 2 == 0 )
            sum += m++;
        if ( n % 2 == 0 )
            sum += n--;

        while ( m <= n )
        {
            sum += m;
            m += 2;
        }

        return sum;
    }

    public static int inputInteger( String message )
    {
        return Integer.parseInt( JOptionPane.showInputDialog( message ) );
    }

    public static void main ( String[] args )
    {
        int m, n, sum;

        while ( true )
        {
            m = inputInteger( "Input an integer." );
            n = inputInteger( "Input an integer higher than " + m + "." );

            // It's easier to ask for forgiveness than permission.
            try
            {
                sum = sum(m, n);
            }
            catch ( IllegalArgumentException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage() );
                continue; // Try again
            }

            break; // No exception was thrown
        }

        JOptionPane.showMessageDialog(null,
                                      "The sum of all odd integers between " + m
                                      + " and " + n + " inclusive is " + sum);
    }
}
