package uebung03;

import uebung07.StdIn;

public class ISBN10 {
    public static void main(String[] args) {

        int isbn9;
        int sum = 0;
        int sum2 = 0;
        int i = 9;
        int x;
        boolean addition = true;

        System.out.print("Bitte geben Sie die zu prüfende Zahl ein: ");
        isbn9 = StdIn.readInt();
        while (isbn9 < 100000000 || isbn9 > 999999999) { //Überprüfung, ob eine 9-stellige Zahl eingeben wurde
            System.out.print("Die Eingabe muss 9-stellig sein: ");
            isbn9 = StdIn.readInt();
        }
        x = isbn9;
        //Gewichtete Quersumme
        do {
            sum += (isbn9 % 10) * i; //Modulo gibt die letzte Zahl wieder, welche mal i gerechnet wird
            isbn9 /= 10; //Die letzte Ziffer, mit der man vorher gerechnet hat wird entfernt
            i--; //zuerst die 9. Stelle dann immer 1 weniger
        }
        while (i > 0);

        //alternierenden Quersumme
        do {
            //Prüfung auf ob Addition oder Subtraktion
            if (addition) {
                //Modulo kapselt die letzte Ziffer wieder ab
                sum2 += sum % 10; //1. Durchlauf wird addiert
            } else {
                sum2 -= sum % 10; //every other Durchlauf wird subtrahiert
            }
            addition = !addition; //Nach jedem Durchlauf wird true zu false und false zu true (false + false = true; true + false = false, siehe Wahrheitstabelle in Notizen)
            sum /= 10; //Streichen der letzten Stelle
        }
        while (sum != 0);  //Wiederholen bis sum = 0

        //Wenn sum2 negativ ist, wird solange bis sum2 positiv ist +11 addiert
        if (sum2 < 0) {
            do {
                sum2 += 11;
            }
            while (sum2 < 0);
        }
        //Wenn 10 rauskommt, 10 -> X
        if (sum2 == 10) {
            System.out.println("Die Prüfziffer von " + x + " lautet: X. Die ISBN10 ist: " + x +"X");
        } else {
            System.out.println("Die Prüfziffer von " + x + " lautet: " + sum2 +". Die ISBN10 ist: " + x + sum2);
        }
    }
}