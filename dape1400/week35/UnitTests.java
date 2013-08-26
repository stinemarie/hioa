import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class UnitTests
{
    private LawnMower lawnMower;

    @Test
    public void houseWiderThanLawn()
    {
        lawnMower = new LawnMower() {{ lawn_width=3; lawn_length=5; house_width=5; house_length=4; }};
        assertTrue(lawnMower.houseLargerThanLawn());
    }

    @Test
    public void houseLongerThanLawn()
    {
        lawnMower = new LawnMower() {{ lawn_width=5; lawn_length=5; house_width=5; house_length=10; }};
        assertTrue(lawnMower.houseLargerThanLawn());
    }

    @Test
    public void getLawnArea()
    {
        lawnMower = new LawnMower() {{ lawn_width=5; lawn_length=5; house_width=4; house_length=4; }};
        assertEquals(9, lawnMower.getLawnArea());
    }

    @Test
    public void getCuttingTimeInSeconds()
    {
        lawnMower = new LawnMower() {{ lawn_width=5; lawn_length=5; house_width=4; house_length=4; }};
        assertEquals(23, lawnMower.getCuttingTimeInSeconds());
    }

    @Test
    public void getCuttingTimeAsString()
    {
        lawnMower = new LawnMower() {{ lawn_width=5; lawn_length=5; house_width=4; house_length=4; }};
        assertEquals("0 hours, 0 minutes and 23 seconds", lawnMower.getCuttingTimeAsString());
    }

    @Test
    public void getCuttingTimeAsStringForHugeLawn()
    {
        lawnMower = new LawnMower() {{ lawn_width=1000; lawn_length=1000; house_width=10; house_length=10; }};
        assertEquals("694 hours, 22 minutes and 30 seconds", lawnMower.getCuttingTimeAsString());
    }
}
