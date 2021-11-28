package uebung04;

import java.util.Scanner;

public class HaseIgel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bidde 4-stellige Hexadezimalzahl eingeben: ");
        long eingabe = Long.decode(keyboard.next());
        System.out.println(eingabe);
        //TODO: Eingabe zu hex machen
        for (int i = 0x0000; i <= 0xFFFF; i += 0x0001) {
            eingabe *= eingabe;
            eingabe = eingabe / 0x0100 % 0x1000;
            String hex = Integer.toHexString((int) eingabe);
            System.out.println(hex);
        }
    }
}
