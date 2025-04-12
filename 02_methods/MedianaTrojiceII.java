import java.util.Scanner;

/* Napišite program, ki prebere tri števila in izpiše srednje med njimi (tj. število, od katerega
je vsaj eno od preostalih dveh števil v trojici manjše ali enako in vsaj eno večje ali enako).
Definirajte in smiselno uporabite metodi min in maks, ki sprejmeta dve celi števili in vrneta
manjše (min) oziroma večje (maks) izmed njiju */

public class MedianaTrojiceII {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int prvoStevilo = sc.nextInt();
        int drugoStevilo = sc.nextInt();
        int tretjeStevilo = sc.nextInt();
        //int srednjeSt;
        
        int rezultat = srednjeStevilo(prvoStevilo, drugoStevilo, tretjeStevilo);
        System.out.println(rezultat);

    }

    public static int srednjeStevilo(int prvoStevilo, int drugoStevilo, int tretjeStevilo){
        int srednjeStevilo;

        if ((prvoStevilo >= drugoStevilo && prvoStevilo <= tretjeStevilo) || 
            (prvoStevilo <= drugoStevilo && prvoStevilo >= tretjeStevilo)) {
            srednjeStevilo = prvoStevilo;
        } else if ((drugoStevilo >= prvoStevilo && drugoStevilo <= tretjeStevilo) || 
                (drugoStevilo <= prvoStevilo && drugoStevilo >= tretjeStevilo)) {
                srednjeStevilo = drugoStevilo;
            } else {
                srednjeStevilo = tretjeStevilo;
            }

        return srednjeStevilo;
    }

}