import javax.swing.JOptionPane;

public class Konto
{
    private String innehaver, kontonummer;
    private double saldo;

    public Konto ( String innehaver, String kontonummer, double saldo )
    {
        this.innehaver = innehaver;
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }

    public void setInnehaver( String innehaver )
    {
        this.innehaver = innehaver;
    }

    public String getInnehaver ()
    {
        return innehaver;
    }

    public String getKontonummer()
    {
        return kontonummer;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void kontoutskrift()
    {
        JOptionPane.showMessageDialog(null,
                                      "Innehaver: " + innehaver
                                      + "\nkontonummer: " + kontonummer
                                      + "\nSaldo: " + saldo);
    }

    public String settInn(double beløp)
    {
        saldo += beløp;
        return "Satt inn " + beløp + " på konto " + kontonummer + "\nNy saldo: " + saldo;
    }

    public String taUt(double beløp)
    {
        if ( saldo >= beløp )
        {
            saldo -= beløp;
            return "Tok ut " + beløp + " fra " + kontonummer + "\nNy saldo: " + saldo;
        }
        else
            return "Det er ikke dekning på kontoen.";
    }
} // end of class Konto
