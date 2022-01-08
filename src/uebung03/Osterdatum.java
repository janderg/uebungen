package uebung03;

import uebung07.StdIn;

public class Osterdatum {
    public static void main (String [] args){
        System.out.print("Bidde die Jahreszahl eingeben: ");
        int j = StdIn.readInt();
        int a = j % 19;
        int b = j % 4;
        int c = j % 7;
        int d = (19 * a + 23) % 30;
        int n = 3;
        if (j > 1799){
            n = 4;
        }
        int e = (2*b + 4*c + 6*d + n) % 7;
        if (e + d > 9){
            int apriltag = d + e - 9;
            System.out.println("Ostern war im Jahre " + j + " am " + apriltag + ". April.");
        }
        else {
            int maerztag = 22 + d + e;
            System.out.println("Ostern war im Jahre " + j + " am " + maerztag + ". März.");
        }
    }

}