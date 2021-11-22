package uebung02;
public class EuklidKlassisch {

    public static void main( String[] args ){
        int x = Integer.parseInt(args[0]); // Wertuebernahme von ...
        int y = Integer.parseInt(args[1]); // ... der Kommandozeile
        //int x = ;
        //int y = ;
        if ( x <= 0 || y <= 0)  { // '||' steht fuer 'oder'
            System.out.println("nur positive Argumente!!");
            return; // Ende
        }
        System.out.println("| line \t| x  \t| y \t| comment");
        // ggT(x,y)                                    // K1
        tabulator("K1", x, y, "ggT("+x+","+y+")");
        while ( y != 0 ) {                             // K2
            tabulator("K2", x, y, "while ( "+y+" != 0 )");
            if ( x > y ) {                              // K3
                tabulator("K3", x, y, "if ( " + x + " > " + y + " )");

                x = x - y;                             // K4
                tabulator("K4", x, y, "" + x + "= " + x + " - " + y + "");
            } else {
                y = y - x;                             // K5
                tabulator("K5", x, y, "" + x + "= " + x + " - " + y + "");
            }

        }
                              // K6
        tabulator("K6", x, y, "="+x+"");




    }
    public static void tabulator(String line, int x, int y, String comment) {
        System.out.println("| " + line + " \t| " + x + " \t| " + y + " \t| " + comment);
    }
}