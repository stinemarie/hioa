/**

Eksempel 4:
  Vi skal lage et program som gjentatte ganger leser inn et antall
  sekunder og skriver ut dette konvertert til timer, minutter og
  sekunder. Programmet skal avsluttes når brukeren skriver et negativt
  tall.

Oppgave 3:
  Skriv et fullstendig program for eksempel 4 ovenfor.

**/

import javax.swing.JOptionPane;

public class TimeLoop
{
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * 60;

    public static int inputInteger( String message )
    {
        return Integer.parseInt(JOptionPane.showInputDialog( message ));
    }

    public static void main ( String[] args )
    {
        int seconds, minutes, hours;

        while (true)
        {
            seconds = inputInteger( "Oppgi et positivt antall sekunder. Negative tall avslutter." );

            if ( seconds < 0 )
                break;

            hours = seconds / SECONDS_PER_HOUR;
            seconds = seconds % SECONDS_PER_HOUR;
            minutes = seconds / SECONDS_PER_MINUTE;
            seconds = seconds % SECONDS_PER_MINUTE;

            JOptionPane.showMessageDialog( null,
                                           hours + " timer, "
                                           + minutes + " minutter, "
                                           + seconds + " sekunder" );
        }
    }
}
