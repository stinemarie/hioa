/* Matias Hermanrud Fjeld <mhf@hex.no>, S193364, DAPE1400 */

import javax.swing.JOptionPane;

/**
 * Applikasjon som leser inn radius fra bruker og viser egenskaper ved en sirkel.
 */
public class SirkelTest
{
    private static double lesRadius()
    {
        return Double.parseDouble(JOptionPane.showInputDialog(" Oppgi radius for sirkelen. Negative tall avslutter. "));
    }

    public static void main(String[] args)
    {
        double radius;
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
