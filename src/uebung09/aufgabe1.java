package uebung09;

import java.util.Arrays;
import java.util.Scanner;

public class aufgabe1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Ganzzahl: ");
        String eingabe = console.next();
        String[] f = eingabe.split("");
        int[] d = new int[eingabe.length()];
        for (int i = 0; i < eingabe.length(); i++) {
            d[i] = Integer.parseInt(f[i]);
        }
        System.out.println("Zahlenfolgen: "+Arrays.toString(d));
        int b = 0;
        int c = d.length-1;
        int summe = summeRe(d,b,c);
        System.out.println("Summe: "+summe);
    }
    public static int summeRe(int[] v, int von, int bis){
        if(von==bis) return v[von];
        return summeRe(v,von, (bis+von)/2)+summeRe(v, ((bis+von)/2)+1,bis);
    }
}