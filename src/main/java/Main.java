import javax.sound.midi.SysexMessage;
import java.net.CacheRequest;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an operation: ");
        System.out.println("1 add");
        System.out.println("2 subtract");
        System.out.println("3 multiply");
        System.out.println("4 divide");
        System.out.println("5 fibonacci");
        System.out.println("6 int to binary");
        int number = input.nextInt();
        if (number == 1) {
            System.out.print("First");
            int a = input.nextInt();
            System.out.print("Second");
            int b = input.nextInt();
            System.out.print(calc.add(a,b));
        }
        if (number == 2) {
            System.out.print("First");
            int a = input.nextInt();
            System.out.print("Second");
            int b = input.nextInt();
            System.out.print(calc.subtract(a,b));
        }
        if (number == 3) {
            System.out.print("First");
            int a = input.nextInt();
            System.out.print("Second");
            int b = input.nextInt();
            System.out.print(calc.multiply(a,b));
        }
        if (number == 4) {
            System.out.print("First");
            int a = input.nextInt();
            System.out.print("Second");
            int b = input.nextInt();
            System.out.print(calc.divide(a,b));
        }
        if (number == 5) {
            System.out.print("Which Fib");
            int a = input.nextInt();
            System.out.print(calc.fibonacciNumberFinder(a));
        }
        if (number == 6) {
            System.out.print("To Binary");
            int a = input.nextInt();
            System.out.print(calc.intToBinaryNumber(a));
        }

        // closing the scanner object
        input.close();
    }
}
