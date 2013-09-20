/* Oppgave 5

Skriv et program som beregner og skriver ut andre og tredje potens av
de hele tallene fra 0 til 10, sammen med tallene selv, og vis det som
en en tabell i JTextArea med kolonner for Tall, Andrepotens og
Tredjepotens.

Bruk en løkke for å beregne potensene og tilføye verdiene i et
tekstområde.

For å få til pene kolonner, kan du på hver linje i tabellen tilføye
strengen "\t" (et tabulatortegn) etter hver verdi (unntatt etter siste
verdien på linja).

Prøv å lage programmet slik at det er lett å endre det i tilfelle vi
isteden ønsker å skrive ut tall og potenser for tall fra et annet
intervall. */

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Task5
{
    static final int MIN = 0;
    static final int MAX = 10;

    public static void main( String[] args )
    {
        JTextArea textArea = new JTextArea( "Tall\tAndrepotens\tTredjepotens\n" );

        for ( int i = MIN; i <= MAX; i++ )
            textArea.append( i + "\t" + ((int) Math.pow( i, 2 )) + "\t" + ((int) Math.pow( i, 3 )) + "\n" );

        JOptionPane.showMessageDialog(null, textArea, "Potenstabell", JOptionPane.PLAIN_MESSAGE);
    }
}
