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
        lawnMower = new LawnMower( 3, 5, 5, 4 );
        assertTrue(lawnMower.houseLargerThanLawn());
    }

    @Test
    public void houseLongerThanLawn()
    {
        lawnMower = new LawnMower( 5, 5, 5, 10);
        assertTrue(lawnMower.houseLargerThanLawn());
    }

    @Test
    public void getLawnArea()
    {
        lawnMower = new LawnMower( 5, 5, 4, 4 );
        assertEquals(9, lawnMower.getLawnArea());
    }

    @Test
    public void getCuttingTimeInSeconds()
    {
        lawnMower = new LawnMower( 5, 5, 4, 4 );
        assertEquals(23, lawnMower.getCuttingTimeInSeconds());
    }

    @Test
    public void getCuttingTimeAsString()
    {
        lawnMower = new LawnMower( 5, 5, 4, 4 );
        assertEquals("0 hours, 0 minutes and 23 seconds", lawnMower.getCuttingTimeAsString());
    }

    @Test
    public void getCuttingTimeAsStringForHugeLawn()
    {
        lawnMower = new LawnMower( 1000, 1000, 10, 10);
        assertEquals("694 hours, 22 minutes and 30 seconds", lawnMower.getCuttingTimeAsString());
    }
}
