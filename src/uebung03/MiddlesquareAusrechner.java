package uebung03;
public class MiddlesquareAusrechner {
    public static void main (String[] args){
        int a = 10;
        int c = 0;
        for (int i = 10; i <= 99; i++) {
            a +=1;
            c += 1;
            int b = a;
            for (int y=0; y<=100;y++){
                a = a * a;
                a= a/10 % 100;
                System.out.println("Länge: " + (y + 1) + " \t | Ergebnis: "+ a);
            }
            a = b;
            System.out.println("Folge: " + (c + 11 ));
        }
    }
}
//test für git