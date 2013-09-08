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
}
