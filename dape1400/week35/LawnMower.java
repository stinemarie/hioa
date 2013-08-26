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

public class LawnMower
{
    protected int lawn_width, lawn_length, house_width, house_length; // meters
    private static final double CUTTING_RATE = 0.4; // square meters per second

    public boolean houseLargerThanLawn()
    {
        return ( ( lawn_width < house_width ) || ( lawn_length < house_length ) );
    }

    public int getLawnArea()
    {
        // Unit: meters * meters
        return lawn_width * lawn_length - house_width * house_length;
    }

    public double getCuttingTimeInSeconds()
    {
        // Unit: ( meters * meters ) / ( meters * meters / seconds ) = seconds
        return getLawnArea() / CUTTING_RATE;
    }

    public static void main ( String[] args )
    {
        // Input lawn and house width and length

        // If any lawn dimension is smaller than the corresponding
        // house dimension, notify the user and stop execution.

        // Calculate lawn area
        // Calculate cutting time from cutting rate and lawn area

        // Convert seconds to hours, minutes and seconds

        // Display the cutting time.
    }
};