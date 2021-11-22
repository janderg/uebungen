package uebung01;
public class Quadrat2 {  
    public static void main( String[] args){ 
        int x = Integer.parseInt(args[0]);
        int y = 0; 
        int sum = 0;
        for (int i=1; i<=x*2; i+=2){ // Es wird eine temporäre Variable i erstellt, wenn diese kleiner als die Quadratzahl aus x ist, wird sie um 2 erhöht
            sum += i;
            y += 1;
            System.out.println("Die " + y + ". ungerade Zahl ist " + i);   
        }    
    System.out.println("Die Quadratzahl aus dem Betrag von " + x + " ist = " + sum);
    }
}