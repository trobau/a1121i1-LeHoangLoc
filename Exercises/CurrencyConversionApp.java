package B1_Intro_to_Java.Exercises;

import java.util.Scanner;

public class CurrencyConversionApp {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter USD : ");
        usd = kb.nextDouble();
        double conversion = usd*vnd;
        System.out.println("VND : "+conversion);
    }
}
