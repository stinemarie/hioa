/*

Oppgave 2
---------

Lag et applikasjonsprogram som leser inn vekten til et brev i antall
hele gram og som skriver ut riktig porto (på grunnlag av portotabellen
nedenfor). Dersom brevet er for tungt, skal melding om dette skrives ut
istedenfor portoen. (Gjør bruk av if- og/eller if-else-setninger.)

Vekt i g til og med | Porto
20                  | 9.00
50                  | 14.00
100                 | 17.00
350                 | 27.00
1000                | 67.00
2000                | 145.00

 */

import javax.swing.JOptionPane;

public class Postage
{
    public static int inputInteger ( String message )
    {
        return Integer.parseInt(JOptionPane.showInputDialog( message ));
    }

    public static void main ( String[] args )
    {
        int weight; // In grams
        int postage; // in NOK

        while (true)
        {
            weight = inputInteger("Enter weight of the letter");

            if ( weight < 0 )
                break;

            if (weight <= 20)
                postage = 9;
            else if (weight <= 50)
                postage = 14;
            else if (weight <= 100)
                postage = 17;
            else if (weight <= 350)
                postage = 27;
            else if (weight <= 1000)
                postage = 67;
            else if (weight <= 2000)
                postage = 145;
            else
                postage = 0;

            if (weight > 2000)
                JOptionPane.showMessageDialog(null, "The letter weighs more than 2000 grams, and is too heavy.");
            else
                JOptionPane.showMessageDialog(null, "The letter will cost " + postage + " NOK to send.");
        }
    }
}
