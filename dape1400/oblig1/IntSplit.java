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

public class IntSplit
{
    /**
     * Split an integer into individual digits, and return them in a
     * string separated by three spaces. Handles numbers < 10^4
     **/
    public static String split(int n)
    {
        // Variables for individual digits
        int a, b, c, d, e;

        e = n % 10; // Store rightmost rigit from n in e
        n = n / 10; // Remove rightmost digit from n

        // Likewise for the other digits:
        d = n % 10;
        n = n / 10;
        c = n % 10;
        n = n / 10;
        b = n % 10;
        n = n / 10;
        a = n % 10;
        n = n / 10;

        return a + "   " + b + "   " + c + "   " + d + "   " + e;
    }

    public static void main( String[] args )
    {
        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer with up to five digits."));
        JOptionPane.showMessageDialog(null, split(n));
    }
}