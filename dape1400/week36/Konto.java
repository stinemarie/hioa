<  nødvendige import-setning(er)  >

public class Konto
{
    <  Datafeltene for kontoinnehavers navn, kontornummer og saldo. >

    <  Kontruktør som skal gi startverdier til ALLE datafeltene  >

    <  set-metode for kontoinnehaverens navn >

    <  get-metode for kontoinnehaverens navn, kontonummer og saldo  >

    <  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. >

    <  Metode som setter inn et beløp på kontoen.
       Beløpets størrelse skal tas imot via en parameter til metoden.
       Metoden skal returnere en tekst som inneholder informasjon om
       den nye saldoen.  >

    <  Metode som tar ut et beløp fra kontoen, under forutsetning av
       at det er dekning for beløpet.
       Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
       Hvis det er dekning på kontoen, skal metoden returnere en tekst
       med informasjon om den nye saldoen. Hvis  det ikke er dekning,
       skal den returnerte teksten inneholde informasjon om det. >

} // end of class Konto
