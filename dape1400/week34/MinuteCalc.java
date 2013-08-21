// Week 34, Task 7 and 8

import javax.swing.JOptionPane;

public class MinuteCalc {
    protected static final int SECONDS_PER_MINUTE = 60;
    protected static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * 60;

    public static void main (String[] args) {
        int secondsInputByUser;
        int hours, minutes, seconds;

        // Ask the user for number of seconds
        secondsInputByUser = Integer.decode(JOptionPane.showInputDialog("Enter a whole number of seconds."));

        // Calculate number of whole minutes
        hours = secondsInputByUser / SECONDS_PER_HOUR;
        seconds = secondsInputByUser % SECONDS_PER_HOUR;
        // ... and hours and remaining seconds
        minutes = seconds / SECONDS_PER_MINUTE;
        seconds = seconds % SECONDS_PER_MINUTE;

        // Print hours, minutes and seconds
        JOptionPane.showMessageDialog(null, "" + secondsInputByUser + " seconds = " + hours + " hours, "
                                      + minutes + " minutes, " + seconds + " seconds");
    }
}
