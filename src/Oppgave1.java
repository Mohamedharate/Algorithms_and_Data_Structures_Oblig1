import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oppgave1 {

    public static int maks(int[] a){

        if (a.length == 0){
            throw new NoSuchElementException("Et tomt array har ingen maksverdi");
        }

        for (int i = 0; i < a.length-1 ; i++) if (a[i]>a[i+1]){ //Går bare gjennom for-løkken når et tall er større enn det neste
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        } //n-1+x sammenlikninger

        return a[a.length-1];


    }

    public static int ombyttinger(int[] a){

        if (a.length == 0){
            throw new NoSuchElementException("Et tomt array gjøringen ombyttinger");
        }

        int teller = 0;

        for (int i = 0; i < a.length-1 ; i++) if (a[i]>a[i+1]){ //Går bare gjennom for-løkken når et tall er større enn det neste
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
            teller++;
        } //n-1+x
          // sammenlikninger

        return teller;
    }


    /*Dersom man utfører metoden på et array der alle tall er ulike og den er sortert i stigende rekkefølge vil
      koden inne i for-loopen aldri kjøre, og den vil være veldig effektiv. Dersom den er sortert i synkende rekkefølge
      vil if-setningen alltid være sann, og den vil være lite effektiv. I gjennomsnitt er det n(n-1)/4 inversjoner i et
      tilfeldig array, og det blir antall ganger koden går gjennom if-løkken.
    */

}
