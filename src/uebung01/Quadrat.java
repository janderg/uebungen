package uebung01;
public class Quadrat {  
    public static void main( String[] args){ 
        int n = Integer.parseInt(args[0]);
        //int n = -5; //Zum Testen in VSCode
        int y = 0; 
        int b = n; //da ein negativer Wert bei n im Rechenprozess positiv gemacht wird, speichert b die originale Eingabe n ab
        int sum = 0;

        if (n < 0){ //Wenn die Eingabe negativ ist, wird sie * -1 genommen, damit diese in der Rechnung richtig funktioniert
            n *=-1;
        }
        for (int i=1; i<=n*n; i+=2){ // Es wird eine temporäre Variable i erstellt, wenn diese kleiner als die Quadratzahl aus n ist, wird sie um 2 erhöht
            sum += i;
            y += 1;
            System.out.println("Die " + y + ". ungerade Zahl ist " + i);   

            if (y == n){ //Wenn y die Anzahl an n erreicht hat hört die Schleife auf
                break;
            }
        }    

        if (b < 0){ 
            System.out.println("Die Quadratzahl aus dem Betrag von " + b + " ist = " + sum); //Ausgabe der Qudartzahl wenn n negativ ist
        }
        else {
            System.out.println("Die Quadratzahl aus dem Betrag von " + n + " ist = " + sum); //Ausgabe der Qudartzahl wenn n postiv ist
        }
    }
}