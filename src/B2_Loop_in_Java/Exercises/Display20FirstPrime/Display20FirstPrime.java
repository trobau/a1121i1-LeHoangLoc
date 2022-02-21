package B2_Loop_in_Java.Exercises.Display20FirstPrime;

import java.util.Scanner;

public class Display20FirstPrime {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = kb.nextInt();
        int y = 0;
        while (x > 0){
            if(isPrime(y)){
                System.out.println(y);
                x--;
            }
            y++;
        }
    }
    public static boolean isPrime(int number) {
        boolean check = true;
        if (number < 2)
            check = false;
        else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }
        return check;
    }
}
