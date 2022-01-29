# **Informatik I, Übung 09**
## **Binäre Suche**

**1.** <br>
Typ `double` gibt den genausten Wert von einer Wurzel wieder, den man über Java ausgeben kann. <br>
Quadratfunktion: $f^(-1)(x) = 4.47213595499958 * 4.47213595499958 = 20$ <br>
Umkehrung der Quadratfunktion: $f(x) = sqrt (x)$; `double x = Math.sqrt(20);` $rarr$ `4.47213595499958` <br>
**2.** <br>

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
            for (int i = 0; i < laenge; i++) a[i] = i+1;
            System.out.println(Arrays.toString(a));
            return binaereSuche(a, eingabe,0,laenge);
        }
        public static double binaereSuche(double[] a, double eingabe, int left, int right) {
            if(left == right) return left;
            else {
                int m = (left + right) / 2;
                if(eingabe < a[m] * a[m]) return binaereSuche(a, eingabe, left, m)
                else return binaereSuche(a, eingabe, m+1, right);
            }
        }
    }