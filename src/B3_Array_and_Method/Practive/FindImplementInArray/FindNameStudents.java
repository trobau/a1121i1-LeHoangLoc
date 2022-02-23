package B3_Array_and_Method.Practive.FindImplementInArray;

import java.util.Scanner;

public class FindNameStudents {
    public static void main(String[] args) {
        String[] students = {"Hue","Dao","Mai","Huong","Thao"};
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a name's student :");
        String input_name = kb.nextLine();
        boolean isExist =false;
        for (int i=0;i<students.length;i++){
            if (students[i].equals(input_name)){
                System.out.println("Position of the studens in the list "+input_name+" is "+(i+1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("NOT found "+input_name+" in the list");
    }
}
