import calculator.Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        System.out.println("Select Operation From the below options");
        System.out.println("1. Square Root");
        System.out.println("2. Factorial");
        System.out.println("3. Logarithm");
        System.out.println("4. Power");
        System.out.println("5. Quit");

        int key = scan.nextInt();
        while(key!=5){
            if(key==1){
                System.out.println("Enter number");
                int x = scan.nextInt();
                System.out.println("Square root of " + x + " is: " + calc.square_root(x));
            }
            else if(key == 2)
            {
                System.out.println("Enter number");
                int x = scan.nextInt();
                System.out.println("Factorial of " + x + " is: " + calc.factorial(x));
            }
            else if(key == 3)
            {
                System.out.println("Enter number");
                int x = scan.nextInt();
                System.out.println("Logarithm of " + x + " is: " + calc.log(x));
            }
            else if(key == 4)
            {
                System.out.println("Enter base");
                int x = scan.nextInt();
                System.out.println("Enter power");
                int y = scan.nextInt();
                System.out.println("Power of " + x +"raised to" + y + " is: " + calc.power(x, y));
            }
            System.out.println("Select Operation From the below options");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Logarithm");
            System.out.println("4. Power");
            System.out.println("5. Quit");
            key = scan.nextInt();
        }
    }
}
