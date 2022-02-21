package B2_Loop_in_Java.Practive.MathInterest;

import java.util.Scanner;

public class InterestMathApp {
    public static void main(String[] args) {
        int month = 1;
        double interestRate =1.0;
        double money = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount : ");
        money=scanner.nextDouble();
        System.out.println("Enter number of month :");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage : ");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of intersest :"+totalInterest);
    }
}
