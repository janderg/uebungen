package uebung03;
public class Middlesquare {
    public static void main (String[] args){
        System.out.print("Geben Sie eine zweistellige, positive Zahl ein: ");	
        int a = StdIn.readInt();
        while(a<10||a>99){
            if (a<0){
                StdOut.println("Bitte nur eine positive Zahl eingeben! ");
            }
            else {
                StdOut.println("Bitte nur eine zweistellige Zahl eingeben! ");
            }
            System.out.print("Neuer Versuch: ");
            a=StdIn.readInt();
        }
        for (int i=0; i<=100;i++){
	        a *= a;		//a quadrieren
            a = a/10 % 100;	//a aktualisieren
            System.out.println("Länge: " + (i + 1) + " \t | Ergebnis: "+ a); 	//a ausgeben
        }
    }
}
