package uebung05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class aufgabe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt(), aMean, aMeanSum = 0;
        int[] arr = new int[n];
        double gMean, gMeanSum = 1;
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                arr[i] = random.nextInt(1, n + 1);
                aMeanSum += arr[i];
                gMeanSum *= arr[i];
            }
            System.out.println("Meine Zufallszahlen[" + n + "] sind: " + Arrays.toString(arr));
            aMean = aMeanSum / n;
            gMean = (int) Math.pow(aMeanSum, 1.0 / n);
            System.out.println("Das arithmetische Mittel von: " + aMeanSum + " ist " + aMean);
            System.out.println("Das geometrische Mittel von " + gMeanSum + " ist " + gMean);
            if (aMean >= gMean) {
                System.out.println("OK");
            } else System.out.println("WIDERLEGT");
        } else System.out.println("FEHLER!!! !1!ABBRUCH!!11!");
    }
}
