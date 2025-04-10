import java.util.Scanner;

//Napišite program, ki prebere tri števila in jih izpiše v naraščajočem vrstnem redu.

public class UrejanjeTrojice {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int prvoStevilo = sc.nextInt();
        int drugoStevilo = sc.nextInt();
        int tretjeStevilo = sc.nextInt();

        int najmanjsi, najvecji, srednji;

        najmanjsi = Math.min(prvoStevilo, Math.min(drugoStevilo, tretjeStevilo));
        najvecji = Math.max(prvoStevilo, Math.max(drugoStevilo, tretjeStevilo));

        srednji = prvoStevilo + drugoStevilo + tretjeStevilo - najmanjsi - najvecji;

        System.out.println(najmanjsi + " " + srednji + " " + najvecji);
    
    }
}