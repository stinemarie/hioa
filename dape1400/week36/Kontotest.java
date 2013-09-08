import javax.swing.JOptionPane;

public class Kontotest
{
    public static void main(String[] args)
    {
        Konto a, b;

        a = new Konto( "Ola Nordmann", "1234", 1000 );
        b = new Konto( "Per Svenske", "1234", 100 );

        JOptionPane.showMessageDialog(null, "Nåværende innehaver: " + b.getInnehaver());
        b.setInnehaver(JOptionPane.showInputDialog("Ny innehaver?"));
        JOptionPane.showMessageDialog(null, "Ny innehaver: " + b.getInnehaver());

        JOptionPane.showMessageDialog(null, "Kontonummer: " + b.getKontonummer());
        JOptionPane.showMessageDialog(null, "Saldo: " + b.getSaldo());

        b.kontoutskrift();
        JOptionPane.showMessageDialog(null, b.taUt(Double.parseDouble(JOptionPane.showInputDialog("Velg beløp å ta ut."))));
        b.kontoutskrift();
        JOptionPane.showMessageDialog(null, b.settInn(Double.parseDouble(JOptionPane.showInputDialog("Velg beløp å sette inn."))));
        b.kontoutskrift();


    }
} // end of class Kontotest
