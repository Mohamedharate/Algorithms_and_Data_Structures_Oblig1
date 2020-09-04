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
        int antall = a.length;
        if (a.length == 0){ return 0; }
        for (int i = 0; i < a.length;i++){
            for (int j = 0; j < i;j++){
                if (a[i] == a[j]){
                    antall--;
                    break;
                }
            }
        }
        return antall;
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

        String res = "";
        int runde = 0;
        int bokstavNummer  = 0;

        for (int i = 0; i < s.length;i++) {

            if (s[i].length() > 0 && bokstavNummer < s[i].length())
                res += s[i].charAt(bokstavNummer);

            if (i == s.length-1 && runde <= s[i].length()+1){
                i=-1;
                bokstavNummer++;
                runde++;
            }
        }
        return res;
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        int size = a.length;

        int[] indeks = new int[a.length];
        for (int i = 0; i < size; i++) { indeks[i] = i; }

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[indeks[j]] < a[indeks[i]]) {
                    int temp = indeks[j];
                    indeks[j] = indeks[i];
                    indeks[i] = temp;
                }
            }
        }
        return indeks;
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        int size = a.length;
        if (size < 3) throw
                new java.util.NoSuchElementException("a.length(" + size + ") < 3!");

        int m = 0;
        int nm = 1;
        int nnm = 2;

        int minverdi = a[m];
        int nestMinverdi = a[nm];
        int tredjeMinverdi = a[nnm];

        int[] ny =  indekssortering(new int[]{minverdi,nestMinverdi,tredjeMinverdi});
        m = ny[0];
        nm = ny[1];
        nnm = ny[2];

        minverdi = a[m];
        nestMinverdi = a[nm];
        tredjeMinverdi = a[nnm];


        for (int i = 3;i<size;i++){
            if (a[i] < tredjeMinverdi){
                if (a[i] < nestMinverdi){
                    if (a[i] < minverdi){
                        nnm = nm;
                        tredjeMinverdi = nestMinverdi;

                        nm = m;
                        nestMinverdi = minverdi;

                        m = i;
                        minverdi = a[m];
                    }
                    else {
                        nnm = nm;
                        tredjeMinverdi = nestMinverdi;

                        nm = i;
                        nestMinverdi = a[i];
                    }
                }
                else {
                    nnm = i;
                    tredjeMinverdi = a[nnm];
                }
            }
        }

        return new int[]{m,nm,nnm};
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        if (a.isEmpty()){return true;};

        if (a.length()>b.length()){ return false;}

        char[] stringa = a.toCharArray();
        char[] stringb = b.toCharArray();
        int[] intArray = new int[256];

        for (char c : stringb) { intArray[c]++; }
        for (int i : stringa){ intArray[i]--; }
        for (int i : intArray){ if (i < 0){ return false; }
        }
        return true;
    }

}  // Oblig1
