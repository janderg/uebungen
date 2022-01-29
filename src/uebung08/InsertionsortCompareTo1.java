package uebung08;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionsortCompareTo1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Anzahl an Strings: ");
        int n = console.nextInt();
        System.out.println("Bitte geben Sie " + n + " Strings ein!");
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = console.next();
        }
        sort(a);
    }
    public static void sort(String[] f) { // Insertionsort
        int N = f.length;
        for (int i = 1; i < N; i++) { // f[0], ..., f[i-1] ist bereits sortiert
            // f[i] an richtiger Stelle einfuegen, d.h soweit noetig ..
            for (int j = i; j > 0 && f[j].compareTo(f[j-1]) < 0; j--) { // f[i] nach links ..
                String tmp = f[j];
                f[j] = f[j - 1];
                f[j - 1] = tmp; // .. "durchtauschen".
            }

        }
        System.out.println("Strings in lexikografischer Reinfolge: "+Arrays.toString(f));
    }
}
