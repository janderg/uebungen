package uebung04;

public class Lieblingszahl01 {
    public static void main(String[] args){
        int number = 1;
        while(number<=1000){
            if(number%6==0){
                if(number%7==0){
                    if(number%4>0){
                        int sum = 0;
                        int x = number;
                        while (x != 0) {
                            sum += (x % 10);
                            x /= 10;
                        }
                        if(sum==6){
                            System.out.println("Your number is " + number);
                            break;
                        }else{
                            number++;
                        }
                    }else{
                        number++;
                    }
                }else{
                    number++;
                }
            } else{
                number++;
            }
        }

    }
}
