public class OddSum
{
    public static int sum(int m, int n)
    {
        int sum = 0;

        // Adjust upper and lower bounds to be odd
        if ( m % 2 == 0 )
            sum += m++;
        if ( n % 2 == 0 )
            sum += n--;

        while ( m <= n )
        {
            sum += m;
            m += 2;
        }

        return sum;
    }
}
