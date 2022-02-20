package B1_Intro_to_Java.Practive;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeapYear = true;
            }else isLeapYear = true;
        }
        if (isLeapYear) System.out.printf("%d is Leap Year", year);
        else System.out.printf("%d is NOT Leap Year",year);
    }
}
