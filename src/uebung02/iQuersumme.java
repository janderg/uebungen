package uebung02;
public class iQuersumme {
    public static void main( String[] args ){ 
        //int number = Integer.parseInt(args[0]);
        int number = 3242;
        int x = number;
        int sum;
        do {
            sum = 0;
            while (x > 0) {
                sum += x % 10;
                x = x / 10;
            }
            x = sum;
        } while (sum >= 10); //falls sum 2stellig ist, wird der Vorgang wiederholt bis sum < 10
        System.out.println("Die iterierte Quersumme von " + number + " ist " + sum);
    } 
}
