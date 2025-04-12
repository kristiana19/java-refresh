import java.util.Scanner;

/*  Na smučarskem tekmovanju nastopa n tekmovalcev. Tekmovalec odsmuča progo dvakrat,
njegov rezultat pa je seštevek obeh časov. Če ga diskvalificirajo, se njegov rezultat ne
upošteva. Če ga diskvalificirajo že v prvem teku, potem v drugem sploh ne bo nastopal.

    Vaš program naj najprej prebere število n, nato pa za vsakega tekmovalca še njegov rezultat
v prvem in drugem teku (če v prvem ni bil diskvalificiran). Rezultat je podan bodisi kot
pozitivno celo število, ki podaja čas vožnje, ali pa kot število 0, ki pomeni diskvalifikacijo.

    Če so vse tekmovalce diskvalificirali, naj program to sporoči, sicer pa naj izpiše zaporedno
številko tekmovalca z najboljšim skupnim časom in njegov skupni čas. Če je najboljših
tekmovalcev več, naj program izbere tistega z najmanjšo zaporedno številko. */

public class Smucanje {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //stevilo tekmovalcev

        int najboljsiCas = Integer.MAX_VALUE; // začetno največje možno število
        int najboljsiTekmovalec = 0; // pomeni da še ni nobenega najboljšega
        int stevecUspesnih = 0; // koliko jih ni bilo diskvalificiranih

        for (int i = 1; i <= n; i++){ //obdelamo vsakega tekmovalca posebej
            int prviCasTeka = sc.nextInt();

            if (prviCasTeka == 0){
                //DISKVALIFIKACIJA - nic ne beremo dalje
                continue;
            }

            int drugiCasTeka = sc.nextInt();

            if (drugiCasTeka == 0) {
                continue; // diskvalifikacija, čeprav je prvi čas OK
            }

            int skupniCas = prviCasTeka + drugiCasTeka;
            stevecUspesnih++; //na tej tocki je uspesno zakljucil oba teka

            //se posodobi najboljsi, ce je boljsi od dosedanjega
            if (skupniCas < najboljsiCas) {
                najboljsiCas = skupniCas;
                najboljsiTekmovalec = i;
            }
            
        }

        //izpis rezultata glede na stevilo uspesnih tekmovalcev
        if (stevecUspesnih == 0){
            System.out.println("VSI TEKMOVALCI SO BILI DISKVALIFICIRANI");
        } else {
            System.out.println(najboljsiTekmovalec);
            System.out.println(najboljsiCas);
        }        
    }
}