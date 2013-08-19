import javax.swing.JOptionPane;
import java.lang.Math;

public class AreaCalc {
    public static void main (String[] args) {
        double radius, area;
        
        radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle:"));
        area = Math.PI * Math.pow(radius, 2);
        JOptionPane.showMessageDialog(null, "The area of the circle is " + area);
    }
}
