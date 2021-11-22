package uebung02;
public class EuklidModern {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); // Wertuebernahme von ...
        int y = Integer.parseInt(args[1]); // ... der Kommandozeile
        //int x = ;
        //int y = ;
        if (x <= 0 || y <= 0) { // '||' steht fuer 'oder'
            System.out.println("nur positive Argumente!!");
            return; // Ende
        }
        System.out.println("| line \t| x  \t|  y \t| r  \t| comment");
        // ggT(x,y)                                    // M1
        int r = 0;
        tabulator("M1", x, y, r, "ggT(" + x + "," + y + ")");
        while (y != 0) {                             // M2
            tabulator("M2", x, y, r, "\twhile(" + y + " != 0)");
            r = x % y;                                 // M3
            tabulator("M3", x, y, r, "\t\t" + r + " = " + x + " % " + y + "");
            x = y;                                     // M4
            tabulator("M4", x, y, r, "\t\t" + x + "=" + y + "");
            y = r;                                     // M5
            tabulator("M5", x, y, r, "\t\t" + y + "=" + x + "");
        }
                                 // M6
        tabulator("M6", x, y, r, "= " + x);


    }

    public static void tabulator(String line, int x, int y, int r, String comment) {
        System.out.println("| " + line + " \t| " + x + " \t| " + y + " \t| " + r + " \t| " + comment);
    }
}   