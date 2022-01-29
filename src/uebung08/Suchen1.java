package uebung08;

import java.util.Arrays;
import java.util.Scanner;

public class Suchen1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Länge des Arrays eingaben: ");
        int n = console.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("a["+i+"]: " );
            a[i] = console.nextInt();
        }
        System.out.println(Arrays.toString(a));
        int max = a[0];
        int y = 0;
        for (int counter = 0; counter < a.length; counter++) {
            if (a[counter] > max) {
                max = a[counter];
                y = counter;
            }
        }
        System.out.println("Höchster Wert: "+max);
        System.out.println("Indize des höchsten Wertes: "+y);
    }
}
