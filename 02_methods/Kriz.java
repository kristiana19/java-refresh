import java.util.Scanner;


/*          +
            +
            +
            +
        +++++++++
            +
            +
            +
            +            */


public class Kriz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //splosen primer

        int n = sc.nextInt();

        navpicniKrak(n);

        sredinskaLinija(n);

        navpicniKrak(n);

    }

    public static void sredinskaLinija(int n){
        for (int i = 1; i <= 2 * n + 1; i++){
            System.out.print("+");
        }
        System.out.println();
    }

    public static void navpicniKrak(int visina){
        for(int i = 1; i <= visina; i++){
            for(int j = 1; j <= visina; j++){
                System.out.print(" ");
            }
            System.out.println("+");
        }
    }

    /*  Vrstni red metod v razredu je lahko poljuben. Kljub temu pa je smiselno, da
        metode vsaj v grobem razporedimo bodisi »od zgoraj navzdol« (najprej main, nato
        metode, ki jih main kliˇce, nato metode, ki jih kliˇcejo te metode itd.) bodisi »od spodaj
        navzgor« (najprej metode na dnu hierarhije klicev, na koncu pa main). */
    

   /* public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

       navpicniKrak();

        for (int i = 1; i <= 9; i++){
            System.out.print("+");
        }
        System.out.println();

        navpicniKrak();
        
    }

    public static void navpicniKrak(){
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 4; j++){
                System.out.print(" ");
            }
            System.out.println("+");
        }
    } */
}