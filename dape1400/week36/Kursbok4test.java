/*

Oppgave 1, del 2
----------------

Lag et testprogram som bruker den nye klassen din og den nye
funksjonaliteten den har.

1. Programmet skal opprette et Kursbok4-objekt, som ved opprettelsen
   (via konstruktørens parametre) gir datafeltene i Kursbok4-objektet
   startverdier.

2. Skriv så disse dataene ut på skjermen ved hjelp av
   visTittel-metoden.

3. Tenk det nå at kurset du har lagret vedier for skal skifte navn,
   kurskode, antall studiepoeng og lærer, og at det derfor må foretas
   ny innlesing av disse verdiene. Bruk set-metodene til å sørge for
   at de nye verdiene blir lagret i Kursbok4-objektets datafelt.

4. Til slutt skal programmet vise på skjermen hva som nå er blitt
   registrert i Kursbok4-objektet.

*/

import javax.swing.JOptionPane;

public class Kursbok4test
{
    public static void main( String[] args )
    {
        Kursbok4 kursbok = new Kursbok4("Programmering", "dape1400", 10, "Eva Hadler Vidhovde");

        kursbok.visTittel();

        kursbok.setKursnavn(JOptionPane.showInputDialog("Oppgi nytt kursnavn."));
        kursbok.setKurskode(JOptionPane.showInputDialog("Oppgi ny kurskode."));
        kursbok.setStudiepoeng(Integer.parseInt(JOptionPane.showInputDialog("Oppgi antall studiepoeng.")));
        kursbok.setFaglærer(JOptionPane.showInputDialog("Oppgi ny faglærer."));

        kursbok.visTittel();
    }
}