import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class IntSplitTest
{
    @Test
    public void IntSplitSingleDigit()
    {
        assertEquals("1", IntSplit.split(1));
    }

    @Test
    public void IntSplit98765()
    {
        assertEquals("9   8   7   6   5", IntSplit.split(98765));
    }

    @Test
    public void IntSplitZero()
    {
        assertEquals("0", IntSplit.split(0));
    }

    @Test
    public void IntSplitLarge()
    {
        assertEquals("2   1   4   7   4   8   3   6   4   7", IntSplit.split(Integer.MAX_VALUE));
    }

    @Test
    public void negative()
    {
        assertEquals("-   1", IntSplit.split(-1));
    }
}
