package uebung02;
public class Quersumme {
        public static void main( String[] args ){ 
            //int n = Integer.parseInt(args[0]); 
            int n = 3242;
            int sum = 0;
            int x = n;
            while (n != 0){
                sum +=(n % 10); //Beispiel: 115 % 10 = 5, 11 % 10 = 1, 1 % 10 = 1, 5+1+1 = 7
                n /= 10; //Bei int Division werden Nachkommstellen abgetrennt
            }
            System.out.println("Die Quersumme von " + x + " ist " +sum); 
        } 
}
