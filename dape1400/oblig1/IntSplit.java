/* Matias Hermanrud Fjeld <mhf@hex.no>, S193364, DAPE1400 */

/*

Oppgave 1:

Øvelse i å bruke de aritmetiske operatorene i java.

Skriv en applikasjon som leser inn et femsifret heltall fra brukeren,
splitter opp tallet i enkeltsifre og så skriver enkeltsifrene ut igjen
med tre mellomrom (blanke tegn) mellom hvert siffer. Dersom det for
eksempel blir lest inn 98765, skal programmet skrive ut 9 8 7 6 5

Det er her meningen at du skal behandle tallet som en int-verdi og
bruke regneoperasjoner for å splitte det opp i enkeltsifre. (Det
innleste tallet og hvert enkelt siffer skal lagres i hver sin
heltallsvariabel. Du skal altså ikke behandle tallet som en
sifferstreng og bruke String-metoder.)

Frivillig utfordrning: Prøv å modifisere programmet slik at det virker
for et vilkårlig antall sifre i det innleste tallet (forutsatt at
tallet ikke er for stort til å kunne leses inn som en int-verdi).

*/

import javax.swing.JOptionPane;

/**
 * Application that splits a string into individual digits
 */
public class IntSplit
{
    /**
     * Split an integer into individual digits, and return them in a
     * string separated by three spaces.
     */
    public static String split(int n)
    {
        String result = "";
        boolean negative = ( n < 0 );
        n = negative ? ( n * -1 ) : n;

        while ( true )
        {
            result = (n % 10) + result;
            n /= 10; // Remove rightmost rigit from n

            if (n == 0)
                return negative ? ( "-   " + result ) : result;
            else
                result = "   " + result;
        }
    }

    public static void main( String[] args )
    {
        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer with up to five digits."));
        JOptionPane.showMessageDialog(null, split(n));
    }
}
