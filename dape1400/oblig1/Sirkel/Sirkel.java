/* Matias Hermanrud Fjeld <mhf@hex.no>, S193364, DAPE1400 */

import javax.swing.JOptionPane;

/**
 * En klasse for å beregne omkrets, areal og diameter av en sirkel
 * utifra radius.
 */
public class Sirkel
{
    private float radius;

    public Sirkel ( float radius )
    {
        this.radius = ( radius >= 0 ) ? radius : 0;
    }

    public void setRadius( float radius )
    {
        this.radius = radius;
    }

    public float getRadius()
    {
        return radius;
    }

    public float omkrets()
    {
        // Math.PI is a double, but radius is a float.
        return 2 * ( (float) Math.PI ) * radius;
    }

    public float areal()
    {
        return (float) ( Math.PI * Math.pow(radius, 2) );
    }

    public float diameter()
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
