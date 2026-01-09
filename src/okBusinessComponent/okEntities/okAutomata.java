package okBusinessComponent.okEntities;

import java.util.Scanner;

public class okAutomata {

    static final Integer er = -10;
    static final Integer ok = 100;
    static final String alfabeto = "a,b,c,d,t, ";
    static final Integer[][] mt = {//  a    b    c    d    t    esp
                                      {1   ,er  ,er  ,er  ,er  ,er}, // q0
                                      {er  ,2   ,er  ,er  ,er  ,ok}, // q1 *
                                      {er  ,2   ,3   ,er  ,er  ,ok}, // q2 *
                                      {er  ,er  ,er  ,4   ,er  ,er}, // q3
                                      {er  ,er  ,er  ,er  ,5   ,er}, // q4
                                      {er  ,er  ,er  ,er  ,5   ,ok}  // q5 *
                                };

    @SuppressWarnings("resource")
    private int okgetIndexAlfabeto(String okCaracter){
        Scanner scAlfa = new Scanner(alfabeto).useDelimiter(",");
        for (int i = 0; scAlfa.hasNext(); i++)
            if (okCaracter.equals(scAlfa.next()))
                return i;
        return er;
    }

    public boolean okcheckTipoArsenal(String okArsenal) {
        int q = 0;
        //System.out.println("Evaluando :"+ okArsenal);
        for(int i = 0; i < okArsenal.length(); i++){
            int okIndexAlfa = okgetIndexAlfabeto(okArsenal.charAt(i) + "");
            if (okIndexAlfa == er || mt[q][okIndexAlfa].equals(er))
                return false;
            q = mt[q][okIndexAlfa];
        }
        return (q == ok);
    }

}
