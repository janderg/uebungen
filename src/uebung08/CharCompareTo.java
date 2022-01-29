package uebung08;

import java.util.Arrays;
import java.util.Scanner;

public class CharCompareTo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Erstes Wort: ");
        String n1 = console.nextLine();
        System.out.println("Zweites Wort: ");
        String n2 = console.nextLine();
        char[] a = n1.toCharArray(), b = n2.toCharArray();
        System.out.println(Arrays.toString(a) + " | " + Arrays.toString(b));
        int D = compare(a, b);
        System.out.println("Lexikografischer Wert: " + D);
    }
    public static int compare(char[] a, char[] b) {
        int length1 = a.length, length2 = b.length;
        int limit = Math.min(length1, length2);
        int i = 0;
        while (i < limit) {
            char ch1 = a[i];
            char ch2 = b[i];
            if (ch1 != ch2) {
                return ch1 - ch2;
            }
            i++;
        }
        return length1 - length2;
    }
}
