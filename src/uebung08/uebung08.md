# **Informatik I, Übung 08**

## **Sortieren/compareTo**

**1.**

    import java.util.Arrays;
    import java.util.Scanner;    

    public class InsertionsortCompareTo1 {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.println("Anzahl an Strings: ");
            int n = console.nextInt();
            System.out.println("Bitte geben Sie " + n + " Strings ein!");
            String[] a = new String[n];
            for (int i = 0; i < n; i++) {
                a[i] = console.next();
            }
            sort(a);
        }
        public static void sort(String[] f) { // Insertionsort
            int N = f.length;
            for (int i = 1; i < N; i++) {
                for (int j = i; j > 0 && f[j].compareTo(f[j-1]) < 0; j--) {
                String tmp = f[j];
                f[j] = f[j - 1];
                f[j - 1] = tmp; // .. "durchtauschen".
                }
            }
            System.out.println("Strings in lexikografischer Reinfolge: "+Arrays.toString(f));
        }
    }

**2.**

    import java.util.Arrays;
    import java.util.Scanner;
    
    public class CharCompareTo {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.println("Erstes Wort: ");
            String n1 = console.nextLine();
            System.out.println("Zweites Wort: ");
            String n2 = console.nextLine();
            char[] a = n1.toCharArray(), b = n2.toCharArray();
            System.out.println(Arrays.toString(a) + " | " + Arrays.toString(b));
            int D = compare(a, b);
            System.out.println("Wert nach lexikografischem Vergleich: " + D);
        }
        public static int compare(char[] a, char[] b) {
            int length1 = a.length, length2 = b.length;
            int limit = Math.min(length1, length2);
            int i = 0;
            while (i < limit) {
                char ch1 = a[i];
                char ch2 = b[i];
                    if (ch1 != ch2) {
                        return ch1 - ch2;
                    }
                i++;
                }
            return length1 - length2;
        }
    }

## **Suchen**

**1.**

*Idee:*

Eine Variable wird dem Wert von dem ersten Folgenglied zugeordnet. `int max = a[0]`<br>
Dann wird in einer for-Schleife geprüft ob `a[counter] > max ist`, wenn true, dann wird der neue höhere Wert `a[counter]` zu `max` <br>
und `y` bekommt den Wert von `counter`, also dem Indize des höchsten Wertes. Wenn der höchste Wert erreicht ist, dann geht die Schleife noch die restlichen Folgenglieder durch, <br>
aber die `if`-Abfrage wird immer `false` sein.

*Code:*

    import java.util.Arrays;
    import java.util.Scanner;
    
    public class Suchen1 {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.print("Länge des Arrays eingaben: ");
            int n = console.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                System.out.print("a["+i+"]: " );
                a[i] = console.nextInt();
            }
            System.out.println(Arrays.toString(a));
            int max = a[0];
            int y = 0;
            for (int counter = 0; counter < a.length; counter++) {
                if (a[counter] >= max) {
                    max = a[counter];
                    y = counter;
                }
            }
            System.out.println("Höchster Wert: "+max);
            System.out.println("Indize des höchsten Wertes: "+y);
        }
    }

**2.**

*Idee*:

Ähnliche Idee wie bei **1.**, nur dass die Rechung für die Indizes ergänzt wurde. $f_i - f_(((i+1)% n))$ $=$ `int abs = Math.abs(a[counter] - a[((counter + 1) % n)])`

*Code:*

    import java.util.Arrays;
    import java.util.Scanner;
    
    public class Suchen2 {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.print("Länge des Arrays eingaben: ");
            int n = console.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                System.out.print("a["+i+"]: " );
                a[i] = console.nextInt();
            }
            int[] b = new int[n];
            n -=1;
            int max = Math.abs(a[0]-a[((1)%n)]);
            int y = 0;
            for (int counter = 0; counter < a.length; counter++) {
                int abs = Math.abs(a[counter] - a[((counter + 1) % n)]);
                if (abs >= max) {
                    max = abs;
                    y = counter;
                }
                b[counter] = abs;  
            }
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));
            System.out.println("Höchster Wert: "+max);
            System.out.println("Indize des höchsten Wertes: "+y);
        }
    }