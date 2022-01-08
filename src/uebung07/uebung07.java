package uebung07;

import java.util.Arrays;

public class uebung07 {
    public static void main(String[] args) {
        int eingabe = Integer.parseInt(args[0]), k;
        while (eingabe > 100000 || eingabe <= 0){ //Eingabe wird überprüft
            System.out.println("Eingabe muss zwischen 0 und 100000. Neue Eingabe: ");
            eingabe = StdIn.readInt();
        }
        k = eingabe;
        Draw(k);
    }
    public static void Draw (int z){ //Draw soll erstmal die Zeichenkette zusammenstellen
        System.out.println(z);
        String[] arr = new String[z];
        for (int i = 0; i < z; i++) { //Array wird mit random Buchtaben (F,L,R) gefüllt
            arr[i] = Random(3);
        }
        System.out.println(Arrays.toString(arr)); //printed das Array aus
    }
    public static String Random (int y){ //Bei Random werden die Buchstaben kalkuliert
        String t = "";
        int k = StdRandom.uniform(1,4);
        switch (k) { // 3 Cases, weil die Chance 1/3 ist, dass einer der drei Buchstaben dran kommt
            case 1 -> t = "F";
            case 2 -> t = "L";
            case 3 -> t = "R";

        }
        return t;
    }
}
