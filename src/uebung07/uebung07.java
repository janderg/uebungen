package uebung07;

import java.util.Arrays;

public class uebung07 {
    public static void main(String[] args) {
        StdOut.print("Bitte geben Sie D oder R ein: ");
        char c = StdIn.readChar();
            if (c == 'D') { //Es wird überprüft, ob D oder R eingegeben
                StdOut.print("Bitte geben Sie eine Zahl zwischen 0 und 20 ein: ");
                int k = StdIn.readInt();
                while (k < 0 || k > 20) {
                    StdOut.print("Falsche Zahl wurde eingeben!");
                    k = StdIn.readInt();
                }
                char[] a = new char[(int) (Math.pow(2, (k + 1))) - 1]; //Formel für Drachenkurve
                DragonCurve(a, k);
            }
            else if (c == 'R'){
                System.out.println("Bitte eine Zahl zwischen 0 und 100000 eingaben: ");
                int eingabe = StdIn.readInt();
                while (eingabe > 100000 || eingabe <= 0) { //Eingabe wird überprüft
                    System.out.println("Eingabe muss zwischen 0 und 100000. Neue Eingabe: ");
                    eingabe = StdIn.readInt();
                }
                Random(eingabe);
            }
            else {
                System.out.println("Invalide Eingabe");
            }
    }
    public static void Random (int z){ //Draw soll erstmal die Zeichenkette zusammenstellen
        System.out.println(z);
        String[] arr = new String[z];
        for (int i = 0; i < z; i++) { //Array wird mit random Buchtaben (F,L,R) gefüllt
            arr[i] = RandomCalc();
        }
        System.out.println(Arrays.toString(arr)); //Ausgabe von Random
    }
    public static String RandomCalc(){ //Bei Random werden die Buchstaben kalkuliert
        String t = "";
        int k = StdRandom.uniform(1,4);
        switch (k) { // 3 Cases, weil die Chance 1/3 ist, dass einer der drei Buchstaben dran kommt
            case 1:
                t = "F";
                break;
            case 2:
                t = "L";
                break;
            case 3:
                t = "R";
                break;
        }
        return t;
    }
    public static void DragonCurve(char[] a, int w){
        a[0] = 'F';
        int sum = 1, durchlauf;
        for (int i = 0; i < w; i++) {
            a[sum] = 'R';
            durchlauf = 1;
            for (int j = sum; j > 0; j--) {
                if (a[j - 1] == 'F') {
                    a[sum + durchlauf] = 'F';
                    durchlauf += 1;
                } else if (a[j - 1] == 'R') { //Umkehrung von R -> L
                    a[sum + durchlauf] = 'L';
                    durchlauf += 1;
                } else if (a[j - 1] == 'L') { //Umkehrung von L -> R
                    a[sum + durchlauf] = 'R';
                    durchlauf += 1;
                }
            }
            sum += durchlauf;
        }
        System.out.println(Arrays.toString(a)); //Ausgabe von DragonCurve
    }
}
