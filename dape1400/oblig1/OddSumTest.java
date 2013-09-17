/* Matias Hermanrud Fjeld <mhf@hex.no>, S193364, DAPE1400 */

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Units tests for OddSum
 */
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

    @Test(expected=IllegalArgumentException.class)
    public void illegalArgument()
    {
        OddSum.sum(10, 4);
    }

    @Test
    public void negative()
    {
        assertEquals(0, OddSum.sum(-5, 5));
    }
}
