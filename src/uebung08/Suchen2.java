package uebung08;

import java.util.Arrays;
import java.util.Scanner;

public class Suchen2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Länge des Arrays eingaben: ");
        int n = console.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("a["+i+"]: " );
            a[i] = console.nextInt();
        }
        int[] b = new int[n];
        n -=1;
        int max = Math.abs(a[0]-a[((1)%n)]);
        int y = 0;
        for (int counter = 0; counter < a.length; counter++) {

            int abs = Math.abs(a[counter] - a[((counter + 1) % n)]);
            if (abs >= max) {
                max = abs;
                y = counter;
            }
            b[counter] = abs;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("Höchster Wert: "+max);
        System.out.println("Indize des höchsten Wertes: "+y);
    }
}
