package B3_Array_and_Method.Practive.SwapIndexOfArray;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter length of array:");
            n = scanner.nextInt();
        }while (n<2||n>20);
        int[] a= new int[n];
        for (int i = 0;i<n;i++){
            System.out.printf("Enter a[%d]:",i);
            a[i] = scanner.nextInt();
        }
        for (int i = 0;i<n/2;i++){
            int tam = a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=tam;
        }
        System.out.println("Array a after swap :");
        for (int i = 0;i<n;i++){
            System.out.print(a[i]+"\t");
        }
    }
}
