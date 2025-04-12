import java.util.Scanner;

/*  V trgovini EvroŠop® so vsi izdelki naprodaj za 1 evro. Vsaka stranka kupi samo po en
izdelek, plača pa ga bodisi s kovancem za 1 evro ali pa s kovancem za 2 evra. V prvem
primeru blagajničarka stranki seveda ne vrne ničesar (saj izdelek stane 1 evro), v drugem
pa ji vrne kovanec za 1 evro. Blagajna je na začetku prazna.

    Napišite program, ki prebere zaporedje podatkov o tem, s katerim kovancem je posamezna
stranka plačala izdelek, nato pa izpiše končno število kovancev v blagajni. Lahko se zgodi,
da blagajničarka stranki, ki je izdelek plačala s kovancem za 2 evra, ne more vrniti kovanca
za 1 evro, ker jih v blagajni preprosto ni. V tem primeru naj se program zaključi z izpisom
BANKROT. */

public class EvroShop {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int evro = 0;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int placilo = sc.nextInt();

            if(placilo == 1){
                evro++;
            } else if (placilo == 2){
                if (evro >= 1){
                    evro--; //vrne kovanec
                } else {
                    System.out.println("BANKROT");
                    return;
                } 
            }          
        }
        System.out.println(evro);
    }
}