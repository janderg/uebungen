package uebung04;

public class Lieblingszahl {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (i % 6 == 0 && i % 7 == 0 && i % 4 != 0 && quersumme(i) == 6) {
                System.out.println("Meine Lieblingszahl ist: " + i);
            }
        }
    }

    private static int quersumme(int number) {
        int x = number;
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }
}
