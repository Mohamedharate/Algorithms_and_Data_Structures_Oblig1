public class Oppgave7 {

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

    public static void main(String[] args) {
        String abc = "ABC";
        String entotre = "";

        System.out.println(flett(abc, entotre));

    }
}
