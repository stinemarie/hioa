/* Oppgave 6

Lag et applikasjonsprogram som trekker 100 slumptall (hele tall) i
intervallet fra 0 (inkludert) til 100 (ikke inkludert).

Du får et slikt tall ved å skrive
  int tall = (int) (Math.random() * 100);

Programmet skal skrive ut i tabellform alle tall som blir trukket, med
10 tall per linje. Utskriften skal gjøres i et tekstområde som blir
plassert i dialogboks.

Programmet skal også finne og skrive ut det minste, det nest minste,
det nest største og det største av tallene som blir trukket. På
utskriften vil du kunne se om det er funnet riktige verdier for disse
tallene!

*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Task6
{
    private static final int COUNT = 100;
    private static final int NUMBERS_PER_ROW = 10;
    private static final int RANDOM_RANGE = 100; // Exclusive

    public static void main ( String[] args )
    {
        int n; // The current random number in the for loop
        int smallest = RANDOM_RANGE;
        int second_smallest = RANDOM_RANGE;
        int largest = 0;
        int second_largest = 0;
        JTextArea textArea = new JTextArea();

        for ( int i = 1; i <= COUNT; i++ )
        {
            n = (int) ( Math.random() * RANDOM_RANGE );
            if ( n < smallest )
                smallest = n;
            if ( ( smallest < n) && ( n < second_smallest ) )
                second_smallest = n;
            if ( largest < n )
                largest = n;
            if ( ( second_largest < n ) && ( n < largest ) )
                second_largest = n;
            if ( i % NUMBERS_PER_ROW == 0 )
                textArea.append(n + "\n");
            else
                textArea.append(n + " \t");
        }

        textArea.append("\nStørste tall: " + largest + "\n");
        textArea.append("Nest største tall: " + second_largest + "\n");
        textArea.append("Nest minste tall: " + second_smallest + "\n");
        textArea.append("Minste tall: " + smallest);

        JOptionPane.showMessageDialog(null, textArea, "Tilfeldige tall", JOptionPane.PLAIN_MESSAGE);
    }
}
