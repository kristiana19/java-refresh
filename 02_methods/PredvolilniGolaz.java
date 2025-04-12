import java.util.Scanner;

/* Politiku Gvidu1 je podpora pred volitvami nevarno padla, zato se odloči, da bo izbranim
skupinam volilcev plačeval kosila v dobrih gostilnah tako dolgo, dokler mu ne zmanjka
denarja. Vsak dan povabi določeno skupino ljudi v izbrano gostilno. Cena pogostitve se
v osnovi izračuna kot zmnožek števila kosil in cene kosila, izbrano vino pa ceno poveča za
navzgor zaokroženo polovico (če cena celotne pogostitve brez vina znaša 45 evrov, je cena
z vinom enaka 45 + 23 = 68 evrov, če pa bi brez vina odšteli 46 evrov, bi z vinom 46 +
23 = 69 evrov). Napišite program, ki najprej prebere podatek o začetni zalogi Gvidovega
denarja, nato pa zaporedoma bere podatke o pogostitvah ter sproti izpisuje njihove cene
in preostalo zalogo denarja. Program naj se zaključi, ko zmanjka vhoda ali pa Gvidovega
denarja.
V programu definirajte in uporabite metodo, ki sprejme podatke o pogostitvi in vrne njeno
ceno. */

public class PredvolilniGolaz {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
    
        int zacetnaKolicinaDenarja = sc.nextInt();

        //dokler imamo vhodne podatke in dokler Gvid ima denarja
        while (sc.hasNextInt() && zacetnaKolicinaDenarja > 0){
            //preberemo stevilo kosil in ceno enega kosila
            int stKosil = sc.nextInt();
            int cenaKosila = sc.nextInt();
            int vino = sc.nextInt();

            //izracunamo ceno pogostitve
            int cenaPogostitve = pogostitev(stKosil, cenaKosila, vino);

            if (zacetnaKolicinaDenarja >= cenaPogostitve){
                zacetnaKolicinaDenarja -= cenaPogostitve;
                System.out.println(cenaPogostitve + " " + zacetnaKolicinaDenarja);
            } else {
                System.out.println(cenaPogostitve + "  -");
                break; //ce nima dovolj denarja, se program ustavi
            }
            
            
        }
    }

    public static int pogostitev(int stKosil, int cenaKosila, int vino){
        int osnovnaCena = stKosil * cenaKosila;
        if (vino == 1){
            int dodatek = (int) Math.ceil(osnovnaCena / 2.0);
            return osnovnaCena + dodatek;
        } else {
            return osnovnaCena;
        }
    }

    
}
