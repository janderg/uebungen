package uebung08;

import java.util.Arrays;
import java.util.Scanner;

public class Josephus {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Länge N: "); //Eingabe von Länge N
        int n = console.nextInt();
        System.out.print("Schrittweite S: "); //Eingabe von Schrittweite S
        int s = console.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) { //Array zur Darstellung der Folge vor Permutation
            a[i] = i+1;
        }
        System.out.println("Normale Folge: \t"+Arrays.toString(a));
        int[] jos = josephusPermutation(n,s); //Start der Permutation
        System.out.println("Permutation: \t"+Arrays.toString(jos));
    }
    private static int[] josephusPermutation(int length, int step){
        round = 1;
        int[] circle = new int[length];
        for(int i=0;i<length;i++) circle[i] = -1; //Array wird mit -1 befüllt damit geprüft werden kann, ob die schon befüllt wurden
        josephusRecursive(circle,-1,step); //Rekursion wird gestartet
        return circle; //Returnt fertige Permutation
    }
    private static int round;
    private static void josephusRecursive(int[] circle, int last, int step) {
        int taken = 0; //Schritte
        while(taken!=step) { //läuft immer zwei steps
            last++; //Wird hochgezählt, damit befüllte Folgen übersprungen werden
            if(last>=circle.length) last = (last%circle.length); //Startet wieder bei circle[0]
            if(circle[last]==-1) taken++; //Wenn Feld noch nicht befüllt, dann erhöht sich taken

        }
        circle[last] = round++; //Richtigen Wert in Indize
        if(circle[last] == circle.length) return; //geht zurück wenn alles befüllt wurde
        else josephusRecursive(circle,last,step); //wiederholt den Vorgang wenn noch unbefüllt Felder da sind
    }
}
