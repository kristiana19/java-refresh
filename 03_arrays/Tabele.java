import java.util.Arrays;
import java.util.Scanner;

/* 

  Napišite metodo public static int steviloDeljivih(int[] t, int delitelj)
  ki vrne število elementov podane tabele, ki so deljivi s podanim deliteljem.  
                                                                                            */


public class Tabele {

    public static void main(String[] args) {
        int[] tabela = {3, 6, 9, 10, 12, 15, 20};
        int delitelj = 3;

        int rezultat = steviloDeljivih(tabela, delitelj);
        System.out.println("Število elementov, deljivih z " + delitelj + ": " + rezultat);
    }

    public static int steviloDeljivih(int[] t, int delitelj) {
        int stevec = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] % delitelj == 0) {
                stevec++;
            }
        }

        return stevec;
    }
}