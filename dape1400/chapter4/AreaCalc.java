/*

I kapittel 2, oppgave 5 skulle du lage et program som leste inn radien
til en sirkel og skrev ut sirkelens areal. Lag en ny versjon av dette
programmet ved at programmet også beregner og skriver ut sirkelens
omkrets. (Formelen for omkrets er 2 * Π * r.)

Dessuten skal innlesing av radius og utskrift av areal og omkrets
foretas gjentatte ganger, inntil det leses inn en negativ verdi for
radien. (Utskrift av areal og omkrets kan gjøres i en og samme
dialogboks.)

 */

import javax.swing.JOptionPane;
import java.lang.Math;

public class AreaCalc {
    public static void main (String[] args) {
        double radius, area, circumference;
        
        while ( true )
        {
            radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle:"));

            if ( radius < 0 )
                break;

            area = Math.PI * Math.pow(radius, 2);
            circumference = 2 * Math.PI * radius;

            JOptionPane.showMessageDialog(null,
                                          "The area of the circle is " + area
                                          + ",\nand the circumference is " + circumference);
        }
    }
}
