public class OddSum
{
    public static int sum(int m, int n)
    {
        int sum = 0;

        while ( m <= n )
        {
            sum += m;
            m += 2;
        }

        return sum;
    }
}
