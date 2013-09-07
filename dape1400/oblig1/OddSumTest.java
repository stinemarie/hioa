import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class OddSumTest
{
    @Test
    public void oddToOddTogether()
    {
        assertEquals(8, OddSum.sum(3, 5));
    }

    @Test
    public void oddToOddApart()
    {
        assertEquals(16, OddSum.sum(1, 7));
    }

    @Test
    public void oddToEven()
    {
        assertEquals(17, OddSum.sum(2, 7));
    }

    @Test
    public void evenToEven()
    {
        assertEquals(25, OddSum.sum(2, 8));
    }
}
