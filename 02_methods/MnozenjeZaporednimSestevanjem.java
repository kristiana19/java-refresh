import java.util.Scanner;

/* Napišite program, ki prebere dve števili in izpiše njun zmnožek. Definirajte in smiselno
uporabite metodo, ki sprejme dve celi števili in vrne njuno vsoto. */

//npr. 6x7=42 ----> 6+6+6+6+6+6+6=42

public class MnozenjeZaporednimSestevanjem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int produkt = rezultat(a, b);
        System.out.println(produkt);
    }

    public static int rezultat(int a, int b){
        int vsota = 0;
        for(int i = 1; i <= b; i++){
            vsota = vsota + a;
        }
        return vsota;
    }
}