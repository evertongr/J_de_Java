// Picture 2.7: Addition1.java
// Program to addition two numbers and print the result

/* Object: program to addition two numbers input to user and print the result in the screen
   Developer: Everton
   Develop in 02.21.2023 04:10 PM
*/
import java.util.Scanner; //This program use the class Scanner
public class Addition1
{
    // method main begin the execution of the app Java
    public static void main(String[] args)
    {
        // create a Scanner to get a number to user
        Scanner input = new Scanner(System.in);

        int number1; // first number to addition
        int number2; // second number to addition
        int sum; // addition number1 and number2

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read first number input to user

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read second number input to user

        sum = number1 + number2; // addition the numbers and save the result in sum

        System.out.printf("Sum is %d%n", sum); // print sum

    } // end the method
} // end the class
