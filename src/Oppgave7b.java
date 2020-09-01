public class Oppgave7b {

    public static String flett(String... s){

        if (s.length == 0){
            return "";
        }

        String resultat="";
        int makslengde = s[0].length();

        for (int k = 1; k<makslengde ; k++) { //for å finne den ytterste grensen til sjekken
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

    public static void main(String[] args) {

        System.out.println(flett());

    }

}
