package uebung05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class aufgabe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Zahl > 1: ");
        int n = scanner.nextInt();
        int[] arr = new int[n], prefsum = new int[n];
        int  pref = 0;
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                arr[i] = random.nextInt(1, n);
                pref += arr[i];
                prefsum[i] = pref;
            }
            System.out.println("Meine Zufallszahlen sind: " + Arrays.toString(arr));
            System.out.println("prefsum[n] = " + Arrays.toString(prefsum));
            System.out.println("Bitte übergebe nun jeweils zwei einzelne Werte i & j mit folgenden Eigenschaften: (i > 0 & i < j & j < n)");
            System.out.println("i:");
            int i = scanner1.nextInt();
            System.out.println("j:");
            int j = scanner2.nextInt();
            if (i < 0 || i >= j || j >= n) {
                System.out.println("Deine Werte erfüllen nicht die Eigenschaften!");
                return;
            }
            int sum = prefsum[j] - (i == 0 ? 0 : prefsum[i - 1]);
            System.out.println("Die Summe vom Intervall arr[" + i + ", " + j + "] ist: " + sum);
        } else System.out.println("Fehler, die Applikation wird beendet");
    }
}
