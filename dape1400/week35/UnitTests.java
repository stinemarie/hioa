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
}
