// Week 34, Task 7

import javax.swing.JOptionPane;

public class MinuteCalc {
    public static void main (String[] args) {
        int seconds, minutes;

        // Ask the user for number of seconds
        seconds = Integer.decode(JOptionPane.showInputDialog("Enter a whole number of seconds."));
        // Calculate number of whole minutes (throwing away the reminder)
        minutes = seconds / 60;
        // Print minutes
        JOptionPane.showMessageDialog(null, "" + seconds + " >= " + minutes + " minutes");
    }
}
