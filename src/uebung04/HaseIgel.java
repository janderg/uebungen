package uebung04;

import java.util.Scanner;

public class HaseIgel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bidde 4-stellige Hexadezimalzahl eingeben: ");
        long eingabe = Long.decode(keyboard.next());
        System.out.println(eingabe);
        long hase = eingabe;
        long igel = eingabe;
        long hasesum;
        long igelsum;
        while (hase != igel) {
            for (int i = 0x0000; i <= 0xFFFF; i += 0x0001) {
                igel *= igel;
                igel = igel / 0x0100 % 0x1000;
                igelsum = igel;
            }
            System.out.println("Hase: " + hase + "\t| Igel: " + igel);
            if (hase == igel) {
                break;
            }
        }
    }
}
