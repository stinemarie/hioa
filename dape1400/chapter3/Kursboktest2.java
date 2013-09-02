import javax.swing.JOptionPane;

public class Kursboktest2
{
  public static void main( String[] args )
  {
    Kursbok2 protokoll = new Kursbok2();

    // Leser inn kursnavn:
    String navn = JOptionPane.showInputDialog( "Skriv kursnavn:" );

    // Viser hvilket kurs vi har opprettet kursbok for:
    protokoll.visTittel( navn );
  }
}
