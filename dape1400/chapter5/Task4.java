/* Oppgave 4

Lag et program som beregner og skriver ut summen av alle hele tall
mellom to grenser som brukeren skriver inn.

Programmet skal starte med å lese inn nedre og øvre grense for
summen. Dersom innlest øvre grense er mindre enn eller lik nedre
grense, skal programmet skrive ut en melding til brukeren om dette og
deretter avslutte.

Ellers skal programmet beregne nevnte sum - nedre grense skal tas med
i summen, men ikke øvre grense - og summen skal skrives ut. */

import javax.swing.JOptionPane;

public class Task4
{
    public static void main ( String[] args )
    {
        int first = Integer.parseInt( JOptionPane.showInputDialog( "Oppgi et heltall." ) );
        int last = Integer.parseInt( JOptionPane.showInputDialog( "Oppgi et heltall større enn " + first ) );
        int sum = 0;

        if ( last <= first )
            JOptionPane.showMessageDialog(null, "De andre tallet var mindre enn eller lik det første.");
        else
        {
            for ( int i = first; i < last; i++ )
            {
                sum += i;
            }
            // Alternatively: sum = (last - 1 - first) * (last - first) / 2;

            JOptionPane.showMessageDialog(null, "Summen av alle tall fra og med " + first + " til " + last + " er " + sum);
        }

        
    }
}
