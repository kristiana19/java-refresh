import java.util.Scanner;

/*  Napišite metodo, ki sprejme tabelo tipa int[] in izpiše njeno vsebino
    v obratnem vrstnem redu. */


public class ObratnaTabela {

    public static void main(String[] args) {
        int[] tabela = {10, 20, 30, 40, 50};

        izpisiObratno(tabela);
    }

    public static void izpisiObratno(int[] t) {
        System.out.println("Tabela v obratnem vrstnem redu:");
        for (int i = t.length - 1; i >= 0; i--) {
            System.out.print(t[i] + " ");
        }
    }
}
