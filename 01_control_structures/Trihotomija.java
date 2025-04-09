import java.util.Scanner;

//Napišite program, ki prebere dve celi števili in izpiše 1, če je prvo število večje od drugega,
//0, če sta števili enaki, oziroma -1, če je prvo število majše od drugega.

public class Trihotomija {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int prvoStevilo = sc.nextInt();
        int drugoStevilo = sc.nextInt();

        if(prvoStevilo > drugoStevilo){
            System.out.println("1");
        } else if(prvoStevilo == drugoStevilo){
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
    }
}