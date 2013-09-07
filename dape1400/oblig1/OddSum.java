/*

Oppgave 2
---------

Lag et applikasjonsprogram som beregner og skriver ut summen av alle
oddetall mellom to grenser som brukeren skriver inn.

Programmet skal starte med å lese inn nedre og øvre grense for
summen. Dersom innlest øvre grense er mindre enn eller lik nedre
grense, skal programmet skrive ut en melding til brukeren om dette og
foreta ny innlesing. Dette skal gjentas inntil det er lest inn en øvre
grense som er større enn nedre grense.

Når godkjente grenser er lest inn, skal programmet beregne nevnte sum
og summen skal så skrives ut.

Grensene trenger ikke å være partall, men hvis en eller begge er det,
skal de tas med i summen.

 */

public class OddSum
{
    public static int sum(int m, int n)
    {
        if ( m >= n )
        {
            throw new IllegalArgumentException("The lower bound " + m + " is not lower than the upper bound " + n);
        }

        int sum = 0;

        // Adjust upper and lower bounds to be odd
        if ( m % 2 == 0 )
            sum += m++;
        if ( n % 2 == 0 )
            sum += n--;

        while ( m <= n )
        {
            sum += m;
            m += 2;
        }

        return sum;
    }
}
