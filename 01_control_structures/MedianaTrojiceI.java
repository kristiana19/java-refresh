import java.util.Scanner;

// Napišite program, ki prebere tri števila in izpiše srednje med njimi 
// (tj. število, od katerega je vsaj eno od preostalih dveh števil v trojici manjše ali enako 
// in vsaj eno večje ali enako).

public class MedianaTrojiceI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prvoStevilo = sc.nextInt();
        int drugoStevilo = sc.nextInt();
        int tretjeStevilo = sc.nextInt();

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

        System.out.println("Srednje število je: " + srednjeStevilo);
    }
}
