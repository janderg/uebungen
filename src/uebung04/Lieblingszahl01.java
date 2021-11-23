package uebung04;

public class Lieblingszahl01 {
    public static void main(String[] args){
        int a = 1;
        while(a<=1000){
            if(a%6==0){
                if(a%7==0){
                    if(a%4>0){
                        int sum = 0;
                        int x = a;
                        while (x != 0) {
                            sum += (x % 10);
                            x /= 10;
                        }
                        if(sum==6){
                            System.out.println("Meine Lieblingszahl ist " + a);
                            break;
                        }else{
                            a++;
                        }
                    }else{
                        a++;
                    }
                }else{
                    a++;
                }
            } else{
                a++;
            }
        }

    }
}
