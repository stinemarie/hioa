/*

Oppgave 1, del 1
----------------

Modifiser klassen Kursbok4 i Introduksjon til programmering, kapittel
3, eksempel 4 på følgende måte:

1. Tilføy (deklarer) tre ekstra datafelt, et for kursets kurskode, et
   for antall studiepoeng og et for navnet på kursets faglærer.

2. Skriv en konstruktør som gir startverdier til ALLE datafeltene i
   klassen. Konstruktøren skal ha fire parametre, (en for kursnavnet,
   en for kurskoden, en for antall studiepoeng og en for navnet på
   faglærer)

3. Tilføy set- og get-metoder for de nye datafeltene.

4. Modifiser visTittel-metoden slik at også kurskoden, antall
   studiepoeng og navnet på fagelærer for kurset skrives ut i
   dialogvinduet. Fordel utskriften over flere linjer.

 */

import javax.swing.JOptionPane;

public class Kursbok4
{
    private String kursnavn, kurskode, faglærer;
    private int studiepoeng;

  // Konstruktør som initialiserer datafeltet kursnavn.
    public Kursbok4( String kursnavn, String kurskode, int studiepoeng, String faglærer)
  {
      this.kursnavn = kursnavn;
      this.kurskode = kurskode;
      this.studiepoeng = studiepoeng;
      this.faglærer = faglærer;
  }

  public void setKursnavn( String navn )
  {
    kursnavn = navn;
  }

  public String getKursnavn()
  {
    return kursnavn;
  }

  public void setKurskode( String kurskode )
  {
      this.kurskode = kurskode;
  }

  public String getKurskode()
  {
    return kurskode;
  }

  public void setStudiepoeng( int studiepoeng )
    {
        this.studiepoeng = studiepoeng;
    }

    public int getStudiepoeng()
    {
        return studiepoeng;
    }

    public void setFaglærer(String faglærer)
    {
        this.faglærer = faglærer;
    }

    public String getFaglærer()
    {
        return faglærer;
    }

  public void visTittel()
  {
    JOptionPane.showMessageDialog( null,
                                   "Kursbok for " + kursnavn
                                   + "\nKurskode: " + kurskode
                                   + "\nStudiepoeng: " + studiepoeng
                                   + "\nFaglærer: " + faglærer);
  }
}
