/* Matias Hermanrud Fjeld <mhf@hex.no>, S193364, DAPE1400 */

import javax.swing.JOptionPane;

/**
 * En klasse for å beregne omkrets, areal og diameter av en sirkel
 * utifra radius.
 */
public class Sirkel
{
    private double radius;

    public Sirkel ( double radius )
    {
        this.radius = ( radius >= 0 ) ? radius : 0;
    }

    public void setRadius( double radius )
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double omkrets()
    {
        return 2 * Math.PI * radius;
    }

    public double areal()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    public double diameter()
    {
        return radius * 2;
    }

    public void vis()
    {
        JOptionPane.showMessageDialog( null,
                                       "Radius: " + radius
                                       + "\nDiameter: " + diameter()
                                       + "\nOmkrets: " + omkrets()
                                       + "\nAreal: " + areal());
    }

} // end of class Sirkel
