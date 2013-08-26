import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;

@RunWith(JUnit4.class)
public class UnitTests
{
    private LawnMower lawnMower;

    public void setUp()
    {
        LawnMower lawnMower = new LawnMower();
    }

    @Test
    public void pass()
    {
        // Do nothing
    }
}
