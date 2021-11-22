package uebung03;

public class LonCapa {
    public static void main(String[] args){
        int i = 11;
        if (i > 6) {
            System.out.println("count");
            if (i % 7 == 0) {
                System.out.println("count");
                if (i != 9) {
                    System.out.println("count");
                } else {
                    System.out.println("count");
                    System.out.println("count");
                }
            } else {
                System.out.println("count");
                System.out.println("count");
            }
        } else {
            System.out.println("count");
            System.out.println("count");
        }
        while (i < 15) {
            i = i + 5;
            System.out.println("count");
            while (i < 16) {
                i = i + 4;
                System.out.println("count");
                if (i % 7 == 0) {
                    System.out.println("count");
                } else {
                    System.out.println("count");
                    System.out.println("count");
                }
            }
        }
    }
}