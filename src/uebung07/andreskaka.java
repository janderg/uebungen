package uebung07;

import java.util.Arrays;

public class andreskaka {
    public static void main(String[] args) {
        StdOut.print("Bitte geben Sie D oder R ein: ");
        char c = StdIn.readChar();
        StdOut.print("Bitte geben Sie eine Zahl zwischen 0 und 20 ein: ");
        int k = StdIn.readInt();
        if (k < 0 || k > 20) {
            StdOut.print("Falsche Zahl wurde eingeben!");
            StdOut.println();
            return;
        }
        int exp = k + 1;
        int base = 2;
        int laenge = (int) (Math.pow(base, exp)) - 1;
        char[] a = new char[laenge];
        if (c == 'D') {
            drawcurve(a, k);
            StdOut.println("Drachenkurve der Ordnung: " + k);
        } else if (c == 'R') {
            random(a, k);
            StdOut.println("Zufällige Zeichenkette  der Länge: " + k);
        } else {
            StdOut.print("Falscher Buchstabe wurde eingegeben!");
            StdOut.println();
            return;
        }
        System.out.println(Arrays.toString(a));
        StdOut.println();
    }

    public static void drawcurve(char[] a, int w) {
        a[0] = 'F';
        int sum = 1;
        int hop;
        for (int i = 0; i < w; i++) {
            a[sum] = 'R';
            hop = 1;
            for (int j = sum; j > 0; j--) {
                if (a[j - 1] == 'F') {
                    a[sum + hop] = 'F';
                    hop += 1;
                } else if (a[j - 1] == 'R') {
                    a[sum + hop] = 'L';
                    hop += 1;
                } else if (a[j - 1] == 'L') {
                    a[sum + hop] = 'R';
                    hop += 1;
                }
            }
            sum += hop;
        }

    }

    public static void random(char[] a, int k) {
        String c = "FRL";
        int d = c.length();
        for (int i = 0; i < k; i++) {
            a[i] = c.charAt(StdRandom.uniform(d));
        }
    }
}
