package B2_Loop_in_Java.Practive.CheckPrime;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrime = true;
        int number;
        do {
            System.out.println("Enter a numbers :");
            number = scanner.nextInt();
        }while (number<2);
        for (int i = 2;i<=Math.sqrt(number);i++) {
            if (number%i==0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.printf("%3d is Prime",number);
        }else System.out.printf("%3d is NOT Prime",number);
    }
}
