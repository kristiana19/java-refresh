import java.util.Scanner;

//Napišite program, ki prebere pozitivna cela števila h1, m1, h2 in m2 in izpiše razliko
//(v minutah) med časoma h1:m1 in h2:m2. 
//Na primer, razlika med časoma 15:58 in 18:04 
//(h1 = 15, m1 = 58, h2 = 18, m2 = 4) znaša 126 minut.

public class CasovnaRazlikaI {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Vnesite prvi cas (ura in minuta): ");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();

        System.out.println("Vnesite drugi cas (ura in minuta): ");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();

        //pretvorba casa v minute
        int cas1 = h1 * 60 + m1;
        int cas2 = h2 * 60 + m2;

        int razlika = cas2 - cas1;

        System.out.println("Razlika med casoma " + h1 + ":" + m1 + " in " + h2 + ":" + m2 + " znasa " + razlika + " minut.");
    }
}