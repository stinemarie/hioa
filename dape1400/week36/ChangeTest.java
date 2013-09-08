import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ChangeTest
{
    @Test
    public void twentyseven()
    {
        assertEquals("Tilbake:\n1 50-lapp\n1 20-krone\n3 1-kroner\n", Change.change(27.00));
    }

    @Test
    public void one()
    {
        assertEquals("Tilbake:\n1 1-krone\n", Change.split( 1.00 ) );
    }

    @Test
    public void five()
    {
        assertEquals("Tilbake:\n1 5-krone\n", Change.split( 5.00 ) );
    }

    @Test
    public void ten()
    {
        assertEquals("Tilbake:\n1 10-krone\n", Change.split( 10.00 ) );
    }

    @Test
    public void twenty()
    {
        assertEquals("Tilbake:\n1 20-krone\n", Change.split( 20.00 ) );
    }

    @Test
    public void fifty()
    {
        assertEquals("Tilbake:\n1 50-lapp\n", Change.split( 50.00 ) );
    }

    @Test
    public void oneOfEach()
    {
        assertEquals("Tilbake:\n1 50-lapp\n1 20-krone\n1 10-krone\n1 5-krone\n1 1-krone\n",
                     Change.split( (double) ( 1 + 5 + 10 + 20 + 50 ) ) );
    }

    @Test
    public void split()
    {
        assertEquals("Tilbake:\n1 1-krone\n", Change.change(99.00));
    }

    @Test
    public void rounding()
    {
        assertEquals("Tilbake:\n1 1-krone\n", Change.change(99.49));
    }
}
