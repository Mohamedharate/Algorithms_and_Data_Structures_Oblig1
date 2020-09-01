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
    public static String flett(String s, String t){

        String resultat ="";

        if (s.isEmpty()){ //Dersom noen av strengene er tomme, returner den andre strengen
            return t;
        }

        if (t.isEmpty()){
            return s;
        }

        if (s.length()>t.length()){ // i tilfelle der s er lengre enn t
            for (int i = 0; i<t.length(); i++ ){

                resultat += s.charAt(i);
                resultat += t.charAt(i);

                if (i==t.length()-1){ //Sjekker om vi er ved enden av ordet t
                    resultat += s.substring(t.length()); //legger til resten av s
                }
            }
        }else{ //I det tilfelle der t er lengre enn s

            for (int i = 0; i<s.length(); i++){

                resultat += s.charAt(i);
                resultat += t.charAt(i);

                if (i==s.length()-1){ //Sjekker her om vi er på slutten av ordet s
                    resultat += t.substring(s.length()); //legger til resten av t
                }
            }

        }

        return resultat;
    }

    /// 7b)
    public static String flett(String... s){

        if (s.length == 0){
            return "";
        }

        String resultat="";
        int makslengde = s[0].length();

        for (int k = 1; k<s.length ; k++) { //for å finne den ytterste grensen til sjekken
            if (s[k].length() > makslengde) {
                makslengde = s[k].length();
            }
        }

        for (int j=0; j<makslengde; j++){
            for (int i = 0; i<s.length; i++){
                if (j<s[i].toCharArray().length){
                    resultat += "" + s[i].toCharArray()[j];
                }
            }
        }

        return resultat;
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
