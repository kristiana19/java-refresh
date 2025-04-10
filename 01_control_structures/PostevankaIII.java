import java.util.Scanner;

/*  Napišite program, ki prebere števili a in b in izpisuje poštevanko števila a tako dolgo,
    dokler rezultat ni večji od b. */

public class PostevankaIII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int stevilo = 1;
        while (a * stevilo < b){
            System.out.println(a * stevilo);
            stevilo++;
        }

        /* 
        for (int stevilo = 1; ; stevilo++){
            int rezultat = a * stevilo;
            System.out.println(rezultat);
            if (rezultat > b){
                break;
            }
        } */
    }
}