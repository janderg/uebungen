package uebung09;

import java.util.Scanner;

public class Geld {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("---Eingabe für Betrag 1---"); //Eingabe Betrag 1
        System.out.print("Euro: \t");
        int e1 = console.nextInt();
        System.out.print("Cent: \t");
        int c1 = console.nextInt();
        System.out.print("Betrag 1: ");
        Geld betrag1 = new Geld(e1, c1);
        System.out.println(betrag1);

        System.out.println("---Eingabe für Betrag 2---"); //Eingabe Betrag 2
        System.out.print("Euro: \t");
        int e2 = console.nextInt();
        System.out.print("Cent: \t");
        int c2 = console.nextInt();
        Geld betrag2 = new Geld(e2, c2);
        System.out.print("Betrag 2: ");
        System.out.println(betrag2);
        System.out.println("---");

        boolean b = betrag1.equals(betrag2); //? betrag1 == betrag2
        System.out.print("Sind Betrag 1 und 2 gleich: ");
        System.out.println(b);

        betrag1.add(betrag2); //Betrag 1 + Betrag 2
        System.out.print("Betrag 1 + 2: ");
        System.out.println(betrag1);
    }
    private int euro , cent ;
    // Konstruktor
    public Geld (int e, int c) {
        euro = e;
        cent = c;
        if (cent > 99) cent = umrechnen();

    }
    private int umrechnen(){ //100 Cent -> 1 Euro
        int c = cent % 100;
        int e = (cent - c) / 100;
        euro += e;
        cent = c;
        return c;
    }
    boolean equals(Geld g){ //Überprüfung ob die Beträge gleich sind
        return this.euro == g.euro && this.cent == g.cent;
    }
    public void add(Geld g){ //Beträge werden addiert
        this.euro+= g.euro;
        this.cent+= g.cent;
        this.cent = umrechnen();

    }
    public String toString(){ //Strings werden an die Beträge gehangen
        if (cent < 10) {
            return euro + ",0" + cent + " Euro";
        }
        return euro + "," + cent + " Euro";
    }
}
