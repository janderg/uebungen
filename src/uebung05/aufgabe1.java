package uebung05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class aufgabe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Obere Grenze(i): ");
        int n = scanner.nextInt();
        System.out.println("Untere Grenze(j):");
        int j = scanner.nextInt();
        int[] arr = new int[n];
        int[] prefsum = new int[n];
        int sum, sumj = 0, sumi = 0;
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                arr[i] = random.nextInt(1, n);
                prefsum[i] = sumi + arr[i];
                sumi = prefsum[i];
                if (i < j) {
                    sumj = sumi;
                }
            }
            sum = sumi - sumj;
            System.out.println("Meine Zufallszahlen sind: " + Arrays.toString(arr));
            System.out.println("prefsum[i] = " + sum);
        } else System.out.println("Fehler, die Applikation wird beendet");
    }
}
