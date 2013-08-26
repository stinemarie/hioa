import javax.swing.JOptionPane;

public class Addisjon
{
   public static void main( String args[] )
   {
      String førsteSifferstreng;
      String andreSifferstreng;

      float førstetall;
      float andretall;
      float sum;

      // Leser inn første tall fra bruker i form av en sifferstreng:
      førsteSifferstreng = JOptionPane.showInputDialog( 
      		"Skriv inn første hele tall" );

      // Leser inn andre tall fra bruker i form av en sifferstreng:
      andreSifferstreng =
         JOptionPane.showInputDialog( "Skriv inn andre hele tall" );

      // Konverterer sifferstrengene til tallverdier:
      førstetall = Float.parseFloat( førsteSifferstreng );
      andretall = Float.parseFloat( andreSifferstreng );

      // Adderer tallene og lagrer summen i variabelen sum:
      sum = førstetall + andretall;

      // Viser resultatet:
      JOptionPane.showMessageDialog( null, førstetall + " + " + andretall + " = " + sum,
         "Resultater", JOptionPane.PLAIN_MESSAGE );
   } // slutt på main-metoden
}  // slutt på klassen Addisjon
