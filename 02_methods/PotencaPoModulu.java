import java.util.Scanner;

/* Napišite program, ki prebere števila a, b in m in izpiše rezultat izraza a^b mod m. */

public class PotencaPoModulu {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();

        int izpis = modul(a, b, m);
        System.out.println(izpis);
    }

    public static int modul(int a, int b, int m){

        double potenca = Math.pow(a, b); //Math.pow po defaultu vrne double

        int rezultat = (int) potenca % m;

        return rezultat;
    }
}