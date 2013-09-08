import javax.swing.JOptionPane;

public class SirkelTest
{
    private static float lesRadius()
    {
        return Float.parseFloat(JOptionPane.showInputDialog(" Oppgi radius for sirkelen. Negative tall avslutter. "));
    }

    public static void main(String[] args)
    {
        float radius;
        Sirkel sirkel;

        radius = lesRadius();

        while ( radius > 0 )
        {
            sirkel = new Sirkel(radius);
            sirkel.vis();
            radius = lesRadius();
        }

    }
} // end of class SirkelTest
