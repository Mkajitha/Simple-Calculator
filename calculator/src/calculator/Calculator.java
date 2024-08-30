package calculator;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        boolean exit=false;
        while (!exit) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
        int a;
        int b;
        double result; 
        
        switch(choice){
            case 1:
                Addition();
                break;
            case 2:
                Substraction();
                break;
            case 3:
                Multiplication();
                break;
            case 4:
                Division();
                break;  
            default:
                System.out.println("Exit");
                return;
             
        }
        }
        s.close();
        
        
    }
    public static void Addition(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }
    public static void Substraction(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }
    public static void Multiplication(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }
    public static void Division(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
         if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Division by zero");
        }
    }
    
    
}
