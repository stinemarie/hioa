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
        assertEquals("0   0   0   0   1", IntSplit.split(1));
    }

    @Test
    public void IntSplit98765()
    {
        assertEquals("9   8   7   6   5", IntSplit.split(98765));
    }
}
