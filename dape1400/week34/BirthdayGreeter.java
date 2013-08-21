// Week 34, Task 6

import javax.swing.JOptionPane;
import java.util.Calendar;

public class BirthdayGreeter {
    public static void main (String[] args) {
        String name;
        int yearOfBirth, ageThisYear;

        // Input users name
        name = JOptionPane.showInputDialog("Enter your name.");
        // Input users year of birth
        yearOfBirth = Integer.decode(JOptionPane.showInputDialog("What is your year of birth?"));
        // Calculate age this year
        ageThisYear = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
        // Output greeting with name and age
        JOptionPane.showMessageDialog(null, "Hi " + name + ", this year you'll be " + ageThisYear + " years old.");
    }
}
