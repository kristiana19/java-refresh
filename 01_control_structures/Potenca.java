import java.util.Scanner;

/*  Napišite program, ki prebere števili a in b in izpiše vrednost potence a^b.
    Nalogo rešite s pomočjo zaporednih množenj, ne z metodo Math.pow. */

public class Potenca {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int rezultat = 1;
        for (int i = 1; i <= b; i++){
            rezultat = rezultat * a;
        }

        System.out.println(rezultat);

        

    }
}