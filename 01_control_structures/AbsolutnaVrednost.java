import java.util.Scanner;

//Napišite program, ki prebere celo število in izpiše njegovo absolutno vrednost.

public class AbsolutnaVrednost {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesite stevilo: ");
        int stevilo = sc.nextInt();

        int absolutnaVrednost;
        if(stevilo < 0){
            absolutnaVrednost = -stevilo;
        } else {
            absolutnaVrednost = stevilo;
        } 
        System.out.println("Absolutna vrednost od " + stevilo + " je: " + absolutnaVrednost);
        
    }
}