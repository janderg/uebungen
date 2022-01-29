package uebung09;
import java.util.Arrays;
import java.util.Scanner;

public class binaerSuche {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double eingabe = console.nextDouble();
        int laenge = (int) eingabe;
        if (eingabe < 0) {
            System.out.println(Double.NaN);
            return;
        }
        double ergebnis = wurzel(eingabe, laenge);
        for (int i = 0; ergebnis*ergebnis <= eingabe; i++) ergebnis += 0.000000001;
        System.out.println("Wurzel aus "+ eingabe +": " +ergebnis);
        System.out.println("Quadrat aus "+ergebnis +": " +ergebnis*ergebnis);
    }
    public static double wurzel(double eingabe, int laenge){
        double[] a = new double[laenge];
        for (int i = 0; i < laenge; i++) a[i] = i + 1;
        System.out.println(Arrays.toString(a));
        return binaereSuche(a, eingabe,0,laenge);

    }
    public static double binaereSuche(double[] a, double eingabe, int left, int right) {
        if(left == right) return left;
        else {
            int m = (left + right) / 2;
            if(eingabe < a[m] * a[m]) return binaereSuche(a, eingabe, left, m);
            else return binaereSuche(a, eingabe, m + 1, right);
        }
    }
}