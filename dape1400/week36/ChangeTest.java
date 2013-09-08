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
        assertEquals("Tilbake:\n1 50-lapp\n1 20-krone\n3 1-kroner\n", Change.change(100.00, 27.00));
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
    public void hundred()
    {
        assertEquals("Tilbake:\n1 100-lapp\n", Change.split( 100.00 ) );
    }

    @Test
    public void twohundred()
    {
        assertEquals("Tilbake:\n1 200-lapp\n", Change.split( 200.00 ) );
    }

    @Test
    public void fivehundred()
    {
        assertEquals("Tilbake:\n1 500-lapp\n", Change.split( 500.00 ) );
    }

    @Test
    public void thousand()
    {
        assertEquals("Tilbake:\n1 1000-lapp\n", Change.split( 1000.00 ) );
    }

    @Test
    public void oneOfEach()
    {
        assertEquals("Tilbake:\n1 1000-lapp\n1 500-lapp\n1 200-lapp\n1 100-lapp\n1 50-lapp\n1 20-krone\n1 10-krone\n1 5-krone\n1 1-krone\n",
                     Change.split( (double) ( 1 + 5 + 10 + 20 + 50 + 100 + 200 + 500 + 1000 ) ) );
    }

    @Test
    public void split()
    {
        assertEquals("Tilbake:\n1 1-krone\n", Change.change(100.00, 99.00));
    }

    @Test
    public void rounding()
    {
        assertEquals("Tilbake:\n1 1-krone\n", Change.change(100.00, 99.49));
    }
}
