package uebung05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class aufgabe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int aMean;
        int gMean = 0;
        int aMeanSum = 0;
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                arr[i] = random.nextInt(1,n);
                aMeanSum += arr[i];

            }
            System.out.println("Meine Zufallszahlen["+n+"] sind: " + Arrays.toString(arr));
            aMean = aMeanSum/n;
            System.out.println("Die Summe aus Zufallszahlen["+n+"] ist: "+aMeanSum);
            System.out.println("Das arithmetische Mittel von: "+aMeanSum+"/"+n+" ist " +aMean);
        }else System.out.println("FEHLER; ABBRUCH!!!!!!");
    }
}
