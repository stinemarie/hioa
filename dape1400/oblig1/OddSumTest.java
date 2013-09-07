import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class OddSumTest
{
    @Test
    public void threeFive()
    {
        assertEquals(8, OddSum.sum(3, 5));
    }

    @Test
    public void oneSeven()
    {
        assertEquals(16, OddSum.sum(1, 7));
    }
}
