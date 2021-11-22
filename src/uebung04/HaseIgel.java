package uebung04;

public class HaseIgel {
    public static void main(String[] args) {
        long a = 0x0A;
        long b = a;
        for (int i = 0; i <= 100; i++) {
            a *= a;
            a = a / 100 % 1000;
            if (i==0){
                System.out.println("Länge: 0\t | Ergebnis: " + b);
            }
            System.out.println("Länge: " + (i + 1) + " \t | Ergebnis: " + a);
        }
    }
}
