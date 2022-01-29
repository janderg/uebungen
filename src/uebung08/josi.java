package uebung08;

import java.util.Arrays;

public class josi {
    public static void main(String[] args) {
        int[] jos = josephusPermutation(5,2);
        System.out.println(Arrays.toString(jos));
        //inversePermutation(jos,jos.length);
    }
    private static int[] josephusPermutation(int length, int step){
        round = 1;
        int[] circle = new int[length];
        for(int i=0;i<length;i++) circle[i] = -1;     // fülle array mit -1 für vergleiche ob schon richtig befüllt oder nicht
        josephusRecursive(circle,-1,step);
        return circle;
    }
    private static int round;
    private static void josephusRecursive(int[] circle, int last, int step) {
        int taken = 0; // tatsächlich "gelaufene" felder
        while(taken!=step) {
            last++; // last hochzählen aber nicht == schritte die wir laufen (bereits vergebene elemente überspringen)
            if(last>=circle.length) last = (last%circle.length); // index läuft rechts über -> geh wieder nach vorne
                if(circle[last]==-1) taken++; // freies feld, wir erhöhen unsere genommenen schritte
        }
        circle[last] = round++; // runde in momentanen index packen
        if(circle[last] == circle.length) return; // haben wir die letzte zahl erwischt? dann ende
        else josephusRecursive(circle,last,step); // sonst weitermachen
    }
    /*static void inversePermutation(int arr[], int size)    {
        int i ,j;        for ( i = 0; i < size; i++) {
            for ( j = 0; j < size; j++){
                if (arr[j] == i + 1){
                    System.out.print( j + 1 + " ");
                    break;
                }
            }
        }
    }*/
}
