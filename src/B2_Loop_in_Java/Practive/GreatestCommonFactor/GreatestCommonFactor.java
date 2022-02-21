package B2_Loop_in_Java.Practive.GreatestCommonFactor;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        a = Math.abs(a);
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        b = Math.abs(b);
        if (a ==0||b==0){
            System.out.println("No greatest common factor");
        }
        while (a!=b){
            if (a>b)
                a=a-b;
            else b=b-a;
        }
        System.out.println("Greatest common factor "+b);
    }
}
