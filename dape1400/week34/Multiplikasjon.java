import javax.swing.JOptionPane;

public class Multiplikasjon
{
   public static void main( String args[] )
   {
      String førsteSifferstreng;
      String andreSifferstreng;

      int førstetall;
      int andretall;
      int produkt;

      // Leser inn første tall fra bruker i form av en sifferstreng:
      førsteSifferstreng = JOptionPane.showInputDialog( 
      		"Skriv inn første hele tall" );

      // Leser inn andre tall fra bruker i form av en sifferstreng:
      andreSifferstreng =
         JOptionPane.showInputDialog( "Skriv inn andre hele tall" );

      // Konverterer sifferstrengene til tallverdier:
      førstetall = Integer.parseInt( førsteSifferstreng );
      andretall = Integer.parseInt( andreSifferstreng );

      // Multipliserer tallene og lagrer produktet i variabelen produkt:
      produkt = førstetall * andretall;

      // Viser resultatet:
      JOptionPane.showMessageDialog( null, førstetall + " * " + andretall + " = " + produkt,
         "Resultater", JOptionPane.PLAIN_MESSAGE );
   } // slutt på main-metoden
}  // slutt på klassen Multiplikasjon
