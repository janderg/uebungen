package uebung04;

import java.util.Scanner;

public class Lieblingszahl2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Rate meine Lieblingszahl :)");
        int a = keyboard.nextInt();
            if (a % 6 == 0 && a % 7 == 0 && a % 4 != 0 && quersumme(a) == 6) {
                System.out.println(a);
            }else System.out.println("Falsch! " + a + " ist nicht meine Lieblingszahl");

    }
    private static int quersumme(int number) {
        int x = number;
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }
}
