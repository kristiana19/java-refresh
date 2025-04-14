import java.util.Scanner;

/*Napišite program, ki bere števila, dokler uporabnik ne vnese nicle,
nato pa naj izpiše vsa vnesena števila (razen nicle). Lahko predpostavite, da uporabnik ne bo vnesel vec kot, denimo, 100 števil. (Kako bi se naloge lotili, ce tega
ne bi mogli predpostaviti?) */


public class Stevila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] stevila = new int[100];  // Fiksna dolžina
        int vnesenih = 0;

        System.out.println("Vnašaj števila (0 za konec):");

        while (true) {
            int vnos = sc.nextInt();
            if (vnos == 0) {
                break;
            }
            stevila[vnesenih] = vnos;
            vnesenih++;
        }

        System.out.println("Vnesena števila:");
        for (int i = 0; i < vnesenih; i++) {
            System.out.print(stevila[i] + " ");
        }

        sc.close();
    }
}
