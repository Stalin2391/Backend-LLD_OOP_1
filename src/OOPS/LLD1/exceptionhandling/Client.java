package OOPS.LLD1.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Enter a number:");
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//
//            System.out.println("Number: " + a);
//            System.out.println("Number: " + b);
//        }
//        catch (InputMismatchException e) {
//            System.out.println("Invalid input! Please enter a number.");
//        }

        // if user gives 0 then it will throw exception  - ArithmeticException e.g, 10 / 0
//        System.out.println(a/b);

        // Better code should include proper checks and exception handling.

//        if(b != 0) {
//            System.out.println(a/b);
//        }

//        System.out.println("After Exception");

        int[] arr = new int[5];

        for(int i = 0; i <= 5; i++){
            try {
                System.out.println(arr[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid array index");
            }

        }

    }
}
