/**

Oppgave 7

Skriv et program som leser inn lengden og bredden til en
rektangulær plen, samt lengden og bredden til et rektangulært hus
som står på plenen, alle mål i antall hele meter. (Alt utenom det
arealet som huset opptar regner vi som plen.)

Programmet skal beregne og skrive ut hvor lang tid det tar å klippe
plenen når klippehastigheten er 0.4 kvadratmeter pr. sekund.

Tiden skal skrives ut i antall timer, minutter og sekunder.

Programmet skal sjekke at inndataene er konsistente, det vil si at
huset ikke har større lengde eller bredde enn det plenen har.

I tilfelle feil i inndata skal programmet skrive ut en feilmelding
istedenfor å foreta beregning.

**/

import javax.swing.JOptionPane;

public class LawnMower
{
    private int lawn_width, lawn_length, house_width, house_length; // meters
    private static final float CUTTING_RATE = (float) 0.4; // square meters per second
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * 60;

    public LawnMower ( int lawn_width_in_meters, int lawn_length_in_meters,
                       int house_width_in_meters, int house_length_in_meters )
    {
        lawn_width = lawn_width_in_meters;
        lawn_length = lawn_length_in_meters;
        house_width = house_width_in_meters;
        house_length = house_length_in_meters;
    }

    public boolean houseLargerThanLawn()
    {
        return ( ( lawn_width < house_width ) || ( lawn_length < house_length ) );
    }

    public int getLawnArea()
    {
        // Unit: meters * meters
        return lawn_width * lawn_length - house_width * house_length;
    }

    public int getCuttingTimeInSeconds()
    {
        // Unit: ( meters * meters ) / ( meters * meters / seconds ) = seconds
        return Math.round(getLawnArea() / CUTTING_RATE);
    }

    public String getCuttingTimeAsString()
    {
        int hours, minutes, seconds;

        seconds = getCuttingTimeInSeconds();

        hours = seconds / SECONDS_PER_HOUR;
        seconds = seconds % SECONDS_PER_HOUR;

        minutes = seconds / SECONDS_PER_MINUTE;
        seconds = seconds % SECONDS_PER_MINUTE;

        return hours + " hours, " + minutes + " minutes and " + seconds + " seconds";
    }

    public static int inputInteger( String message )
    {
        return Integer.parseInt( JOptionPane.showInputDialog ( message ) );
    }

    public static void main ( String[] args )
    {
        LawnMower lawnMower = new LawnMower( inputInteger( "Enter lawn width in meters." ),
                                             inputInteger( "Enter lawn length in meters." ),
                                             inputInteger( "Enter house width in meters." ),
                                             inputInteger( "Enter house length in meters." ));

        if (lawnMower.houseLargerThanLawn())
            JOptionPane.showMessageDialog( null, "The house is larger than the lawn.",
                                           "Invalid input", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog( null, "The lawn will be cut in " + lawnMower.getCuttingTimeAsString() + '.',
                                           "Lawn cutting time", JOptionPane.INFORMATION_MESSAGE);
    }
};
