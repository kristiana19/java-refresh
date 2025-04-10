import java.util.Scanner;

//Napišite program, ki prebere število n in izpiše zaporedje n zvezdic.

public class ZaporedjeZvezdic {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int stevilo = 0; stevilo < n; stevilo++){
            System.out.print("*");
        }
    }
}