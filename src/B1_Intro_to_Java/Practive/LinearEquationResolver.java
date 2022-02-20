package B1_Intro_to_Java.Practive;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Give a equation as'*X+b=c',please enter constants: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a :");
        Double a = scanner.nextDouble();
        System.out.println("b :");
        Double b = scanner.nextDouble();
        System.out.println("c :");
        Double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
