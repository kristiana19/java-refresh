import java.util.Scanner;

//Napišite program, ki prebere števili a in b in izpiše tisti večkratnik števila a, 
//ki je najmanj oddaljen od števila b. 
//Če obstajata dva takšna večkratnika, naj izpiše manjšega od njiju.

public class NajblizjiVeckratnik {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesite stevilo a: ");  //npr. a = 7
        int a = sc.nextInt();

        System.out.print("Vnesite stevilo b: "); //npr. b = 20
        int b = sc.nextInt();

        int k = b / a; // npr. 20 / 7 = 2 -----> to pomeni da je drugi veckratnik (2 * 7 = 14) najblizji manjsi veckratnik stevila 20.
     
        int kandidat1 = k * a;       // 2 * 7 = 14
        int kandidat2 = (k + 1) * a; // 3 * 7 = 21

        int razlika1 = Math.abs(kandidat1 - b);
        int razlika2 = Math.abs(kandidat2 - b);

        int rezultat;
        
        if (razlika1 < razlika2) {
            rezultat = kandidat1;
        } else if (razlika2 < razlika1) {
            rezultat = kandidat2;
        } else {
            // ce so enako oddaljeni, izberemo manjsega
            rezultat = Math.min(kandidat1, kandidat2);
        }
        System.out.println("Najbližji večkratnik števila " + a + " številu " + b + " je: " + rezultat);
    }
}