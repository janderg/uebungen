package uebung07;

public class king {
    public static void main(String[] args) {
        System.out.print("res: "+String.valueOf(foo(9)));
    }
    public static boolean foo(int x) {
        boolean b , res;
        int t;
        b = true;
        t = 2;
        while ((t*t <= x) && b) {
            b = ((x%t) != 0); //wenn x%t = 0 dann false, x%t != 0 dann true
            t++;
            System.out.println("b: " + String.valueOf(b));
        }
        res = (b && (x != 1));
        return res;
    }
}
