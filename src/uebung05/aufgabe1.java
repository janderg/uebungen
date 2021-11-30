package uebung05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class aufgabe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                arr[i] = random.nextInt(1,n);
                sum+= arr[i];
            }
            System.out.println("Meine Zufallszahlen sind: " + Arrays.toString(arr));
            System.out.println("Die Summe aus arr["+n+"] = "+sum);
        } else {
            System.out.println("Fehler, die Applikation wird beendet");
        }
    }
}
