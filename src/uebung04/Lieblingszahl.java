package uebung04;

import java.util.Scanner;

public class Lieblingszahl {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Rate deine Lieblingszahl :)");
        int a = keyboard.nextInt();
        if (a <= 1000) {
            if (a % 6 == 0) {
                if (a % 7 == 0) {
                    if (a % 4 > 0) {
                        int c = 0;
                        int b = a;
                        while (b != 0) {
                            c += (b % 10);
                            b /= 10;
                        }
                        if (c == 6) {
                            System.out.println("Richtig! " + a +" ist deine Lieblingszahl");
                        } else Error(a);
                    } else Error(a);
                } else Error(a);
            } else Error(a);
        }else Error(a);
    }

    public static void Error(int a) {
        System.out.println("Falsch! " + a + " ist nicht meine Lieblingszahl");
    }
}
