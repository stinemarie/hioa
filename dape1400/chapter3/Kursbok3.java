import javax.swing.JOptionPane;

public class Kursbok3
{
  private String kursnavn;

  public void setKursnavn( String navn )
  {
    kursnavn = navn;
  }

  public String getKursnavn()
  {
    return kursnavn;
  }

  public void visTittel()
  {
    JOptionPane.showMessageDialog( null, "Kursbok for " + kursnavn );
  }
}
