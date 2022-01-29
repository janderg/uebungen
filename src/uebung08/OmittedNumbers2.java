package uebung08;

import java.util.Arrays;
import java.util.Scanner;

public class OmittedNumbers2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Länge vom Array: ");
        int N = console.nextInt(); //Eingabe der Länge
        int[] c = new int[N];
        for(int i = 0;i< c.length; i++){ //Array wird befüllt
            c[i] = i + 1;
        }
        System.out.println(Arrays.toString(c));
        for(int k = 2; k < N;k++) {//k = Schrittweite
            int f = 0; //jede Iteration zurück auf 0 gesetzt
            int p = k; // Stellen, welche weggestrichen werden
            int counter = 0;
            for (int j = 0; j < N; j++) {
                if (c[j] != 0) f++; //Wenn Stelle noch nicht weggestrichen wurde erhöht sich f
                if (f == p) { //Wenn f = p, dann wird die Stelle[j] zu 0. p erhöht sich um die Schrittweite k
                    c[j] = 0;
                    p = k + p;
                    counter++;
                }
            }
            if (counter == 0){ //Wenn Counter nicht zuvor erhöht wurde, dann Ende
                for (int i = 0; i < N; i++) {
                    if (c[i] != 0) System.out.print(c[i]+" "); //Ausgabe des Arrays
                }
                return;
            }
        }

    }
}