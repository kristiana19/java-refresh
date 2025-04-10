import java.util.Scanner;

//Napišite program, ki prebere števili a in b 
//in po vrsti izpiše rezultate množenja števila a s števili od 1 do vključno b.

public class PostevankaI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int n = 1; n <= b; n++){
            System.out.println(a * n);
        }
    }
}