package uebung02;
public class LonCapa1 {
    public static void main(String[] args) {
        int x = 166, y = 628; // ACHTUNG: DIE WERTE SIND IMMER UNTERSCHIEDLICH BEI DEN AUFGABEN

        int i = 1;
        int r = 0;
        while (y != 0){
            r = x % y;
            x = y;
            y = r;
            System.out.println("durchlauf = "+i +" y = "+y +" r = "+r + " x = "+x);
            i ++;
        }
        System.out.println(x);
    }
}
