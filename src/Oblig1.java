////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
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

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
