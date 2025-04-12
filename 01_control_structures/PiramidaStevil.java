import java.util.Scanner;

/* Napišite program, ki prebere število n in nariše »piramido« števil višine n, kot jo prikazujeta primera v nadaljevanju. */

public class PiramidaStevil {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int steviloVrstic = 1; steviloVrstic <= n; steviloVrstic++){

            //presledki v piramidi
            for (int presledki = 1; presledki <= n - steviloVrstic; presledki++){
                System.out.print(" ");
            }

            //stevilke v piramidi
            int start = (steviloVrstic - 1) % 10; //zacetna stevilka v vrstici
            for (int stevilaVPiramidi = 1; stevilaVPiramidi <= 2 * steviloVrstic - 1; stevilaVPiramidi++){
                System.out.print((start + stevilaVPiramidi) % 10);
            }

            //nova vrstica
            System.out.println();
        }
    }
}