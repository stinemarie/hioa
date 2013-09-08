/*

Skriv et program som finner ut hva som skal gis tilbake av
vekslepenger når det betales med en hundrelapp for et beløp som er
mindre enn 100 kroner.

Beløpet som skal betales skal programmet lese inn. Du kan forutsette
at beløpet er avrundet til nærmeste krone.

Vekslepenger skal angis i form av en utskrift. De skal være i størst
mulige myntenheter.

Myntenheter som ikke er med i tilbakebetalingen skal ikke tas med i
utskriften. (Utskriften skal f.eks. ikke inneholde noe slikt som "0
5-kroner".)

Lag også utskriften slik at den skiller mellom entall og flertall på
den måten at det skrives f.eks. "1 1-krone", men "2 1-kroner".

Dersom f.eks. beløpet som skal betales er kr. 27.00, skal utskriften
være omtrent som følger:
Tilbake:
1 50-lapp
1 20-krone
2 1-kroner

Matias: Lærerens eksempel over er nok feil. 100 - 27 = 73, dvs at det
        skal gis tilbake 3 1-kroner, ikke 2.

(Hint: Uttrykk først tilbakebeløpet i antall femtiører. Leser du inn
beløpet som et desimaltall, vil du da få bruk for å typekonvertere til
heltall ved å skrive (int) foran det som skal konverteres. Bruk
operatorene / og % for suksessivt å finne ut hvor mange det blir av
50-lapper, 20-kroner etc.)

Ekstra utfordring:

1. Modifiser programmet slik at korrekt avrunding til nærmeste krone
   blir foretatt på tilbakebetalingsbeløpet. (En kan da skrive inn
   vilkårlige beløp opp til 100.)

2. Utvid programmet slik at det ikke er begrenset til beløp under 100
   kr. Da må innbetalt beløp leses inn i tillegg til beløpet som skal
   betales. Dessuten må du i tillegg til 50-lapp ta med de andre
   seddeltypene.
 */

public class Change
{
    public static String change( double price, double paid )
    {
        return split( price - paid );
    }

    public static String split( double money )
    {
        long thousands, fivehundreds, twohundreds, hundreds, fifties, twenties, tens, fives, ones;
        String response = "Tilbake:\n";

        ones = Math.round(money);

        thousands = ones / 1000;
        ones %= 1000;
        fivehundreds = ones / 500;
        ones %= 500;
        twohundreds = ones / 200;
        ones %= 200;
        hundreds = ones / 100;
        ones %= 100;
        fifties = ones / 50;
        ones %= 50;
        twenties = ones / 20;
        ones %= 20;
        tens = ones / 10;
        ones %= 10;
        fives = ones / 5;
        ones %= 5;

        // There will only ever be one of 500, 100, 50, 10 and 5

        if ( thousands > 0 )
            response += thousands + " 1000-lapp" + ( fifties > 1 ? "er" : "") + "\n";
        if ( fivehundreds > 0 )
            response += fivehundreds + " 500-lapp" + ( fivehundreds > 1 ? "er" : "") + "\n";
        if ( twohundreds > 0 )
            response += twohundreds + " 200-lapp" + ( twohundreds > 1 ? "er" : "") + "\n";
        if ( hundreds > 0 )
            response += hundreds + " 100-lapp\n";
        if ( fifties > 0 )
            response += fifties + " 50-lapp\n";
        if ( twenties > 0 )
            response += twenties + " 20-krone" + ( twenties > 1 ? "r" : "") + "\n";
        if ( tens > 0 )
            response += tens + " 10-krone\n";
        if ( fives > 0 )
            response += fives + " 5-krone\n";
        if ( ones > 0 )
            response += ones + " 1-krone" + ( ones > 1 ? "r" : "") + "\n";

        return response;
    }

    public static void main ( String[] args )
    {
        
    }
}
