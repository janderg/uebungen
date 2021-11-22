package uebung02;
public class LonCapa2 {
    public static void main(String[] args) {
        int n = 17, k = 7 ; // ACHTUNG: DIE WERTE SIND IMMER UNTERSCHIEDLICH BEI DEN AUFGABEN

        int ergebnis = n - k + 1;
        int i = 2;
        int j = 1;
        while (i <= k) {
            ergebnis = ergebnis * (n - k + i);
            ergebnis = ergebnis / i;
            i = i + 1;
            System.out.println("durchlauf = " + j + " ergebnis = " + ergebnis);
            j++;
        }
        System.out.println(ergebnis);
    }
}
