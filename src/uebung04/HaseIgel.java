package uebung04;

public class HaseIgel {
    public static void main(String[] args) {
        long a = 0xFFFF;
        long b = a;
        long na = a;

        for (int i = 0; i <= 0x100; i++) {
            a *= a;
            a = a / 10000 % 100;
            if (i==0){
                System.out.println("Länge: 0\t | Ergebnis: " + b);
            }
            System.out.println("Länge: " + (i + 1) + " \t | Ergebnis: " + a);
        }
    }
}
