package uebung04;

import java.util.Scanner;

public class HaseIgel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        long eingabe = Integer.getInteger(args[0]);
        long hase = eingabe;
        long igel = eingabe;
        while (hase == igel) {
            for (int i = 0x0000; i <= 0xFFFF; i += 0x0001) {
                igel *= igel;
                igel = igel / 0x0100 % 0x1000;


            }
            for (int i = 0x0000; i <= 0xFFFF; i += 0x0002) {
                hase *= hase;
                hase = hase / 0x0100 % 0x1000;


            }
            System.out.println("Hase: " + hase + "\t| Igel: " + igel);
            if (hase == igel) {
                break;
            }
        }
    }
}
