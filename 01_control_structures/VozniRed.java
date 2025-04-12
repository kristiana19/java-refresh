import java.util.Scanner;

/* Avtobus vozi v enakomernih časovnih presledkih. Napišite program, ki prebere čas začetka
dnevne vožnje (hz (ura) in mz (minuta)), čas konca dnevne vožnje (hk in mk) in interval
v minutah (d), nato pa izpiše dnevni vozni red. Prva vožnja se izvrši natanko ob času
začetka vožnje, zadnja pa ob času, ki je kvečjemu enak času konca vožnje. */

public class VozniRed {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int hz = sc.nextInt(); //ura zacetka
        int mz = sc.nextInt(); //minuta zacetka
        int hk = sc.nextInt(); //ura konca
        int mk = sc.nextInt(); //minuta konca

        int interval = sc.nextInt(); //interval v minutah

        //pretvorba v minute
        int zacetekVoznje = hz * 60 + mz;
        int konecVoznje = hk * 60 + mk;

        for (int index = zacetekVoznje; index <= konecVoznje; index += interval){
            //pretvorba v ure
            int ura = index / 60;
            int minuta = index % 60;
            System.out.printf("%02d:%02d\n", ura, minuta);
        }
    }
}