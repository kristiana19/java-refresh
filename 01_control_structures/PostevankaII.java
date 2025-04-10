import java.util.Scanner;

/*  Napišite program, ki prebere števili a in b in izpiše poštevanko števila a s faktorji od 1 do
    vključno b. */


public class PostevankaII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int stevilo = 1; stevilo <= b; stevilo++){
            System.out.printf("%d * %d = %d%n", a, stevilo, a * stevilo);
        }
    }
}