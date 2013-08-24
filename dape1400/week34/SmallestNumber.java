import javax.swing.JOptionPane;

public class SmallestNumber
{
    public static int inputInt(String message)
    {
        return Integer.parseInt( JOptionPane.showInputDialog( message ) );
    }

    public static void main( String[] args)
    {
        int first, second, third;
        String message;

        first = inputInt( "Enter a number." );
        second = inputInt( "Enter another number." );
        third = inputInt( "Enter a final number." );

        if ( first <= second && first <= third )
            message = first + " is the smallest number.";
        else if ( second <= first && second <= third )
            message = second + " is the smallest number.";
        else /** The first two conditions are false, thus the following proposition is true:
              *    ! ( first <= second && first <= third ) && ! ( second <= first && second <= third )
              *
              *  We can rewite the proposition using de Morgan's law:
              *    ( !( first <= second ) || !( first <= third ) ) && ( !( second <= first ) || !( second <= third ) )
              *
              *  Then combine the negations with the inequalities:
              *    ( first > second || first > third ) && ( second > first || second > third ) )
              *
              *  Using the rule of commutativity we get the following proposition:
              *    ( second < first || third < first ) && (first < second || third < second)
              *
              *  Because (second < first && first < second) is a contradiction, we can rewrite the proposition as:
              *    ( third < first && ( first < second || third < second ) )
              *    || ( third < second && ( second < first || third < first ) )
              *
              *  The distributive property allows us to rewrite the proposition as:
              *    ( third < first && first < second )
              *    || ( third < first && third < second )
              *    || ( third < second && second < first )
              *    || ( third < second && third < first )
              *
              *  Combining inequalities and simplifying gives us:
              *    ( third < first < second )
              *    || ( third < first && third < second )
              *    || ( third < second < first )
              *
              * Thus I have proven that this code block is executed
              * only when the third number is the smallest number.
              **/
            message = third + " is the smallest number.";

        JOptionPane.showMessageDialog(null, message);
    }
}
