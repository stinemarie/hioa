/**

Eksempel 4:

  Vi skal lage et program som gjentatte ganger leser inn et antall
  sekunder og skriver ut dette konvertert til timer, minutter og
  sekunder. Programmet skal avsluttes når brukeren skriver et negativt
  tall.

Oppgave 3:

  Skriv et fullstendig program for eksempel 4 ovenfor.

Oppgave 4:

  Lag en forbedret versjon av programmet fra oppgave 3.

  Forbedringen skal gå ut på at dersom det innleste antall sekunder er
  mindre enn 3600, er det bare antall minutter og sekunder som skal
  skrives ut. Dersom det innleste antall sekunder er mindre enn 60,
  skal heller ikke antall minutter skrives ut. Da er det altså bare
  det innleste antall sekunder som skal skrives ut. (For å få til
  denne forbedringen, er det greiest å opprette en egen
  String-variabel for utskriften.)

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
        String message;

        while (true)
        {
            seconds = inputInteger( "Oppgi et positivt antall sekunder. Negative tall avslutter." );

            if ( seconds < 0 )
                break;

            hours = seconds / SECONDS_PER_HOUR;
            seconds = seconds % SECONDS_PER_HOUR;
            minutes = seconds / SECONDS_PER_MINUTE;
            seconds = seconds % SECONDS_PER_MINUTE;

            message = "";
            if ( hours > 0 )
                message += hours + " timer, ";
            if ( minutes > 0 )
                message += minutes + " minutter, ";
            message += seconds + " sekunder";

            JOptionPane.showMessageDialog( null, message );
        }
    }
}
