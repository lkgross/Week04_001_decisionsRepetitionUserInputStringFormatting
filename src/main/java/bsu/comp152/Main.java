package bsu.comp152;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printProceed("y");
        printProceed("n");
        printProceed("Y");
        powerWhile(16);

        int day = 1;
        switch (day){
            case 0:
                System.out.println("Sun");
                break;
            case 1:
                System.out.println("Mon");
                break;
            default:
                System.out.println("ERROR");
        }
        System.out.println("Laura".toLowerCase());

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many powers of two do you want?");
        int numberOfPowers = keyboard.nextInt();
        printTable(numberOfPowers);
        System.out.println("What is your first name?");
        // nextLine: Java reads the first string it finds in the buffer, including a newline character
        // (This means nextLine will "consume" a newline character it finds in the buffer.)
        String firstName = keyboard.next();
        System.out.println("What is your last name?");
        String lastName = keyboard.nextLine();
        System.out.println("What is your age?");
        int age = keyboard.nextInt();
        System.out.printf("If the value is %b, then do " +
                "the action", true);


    }

    /**
     * printProceed-
     * A static method to print a message according to
     * whether the value of proceed is "y", "n", or
     * something else.
     * @param proceed
     */
    public static void printProceed(String proceed){
        // Don't use == for strings.
        // Don't do proceed == "y"!
        if (proceed.equals("y")) {
            System.out.println("Hello world!");
        } else if (proceed.equals("n")) {
            System.out.println("Let's quit!");
        } else {
            System.out.println("Error!");
        }
    }

    /**
     * powerWhile-
     * Calculates the log base 2 of n to within an integer.
     * @param n
     */
    public static void powerWhile(int n) {
        int power = 1;
        int count = 0;
        while (power <= n / 2) {
            power = 2 * power;
            count++;
        }
        System.out.println("An integer for log base 2 of " + n +
                " is " + count);
    }

    public static void printTable(int numberRows){
        int n = numberRows-1;
        int power = 1;
        /*
         * Declare and initialize a loop variable i with
         * int i = 0;
         * Continue the for loop so long as a loop-continuation
         * condition is met. Here it's:
         * i < n;
         * Increment the loop variable at each pass through the loop with
         * i++
         */
        for (int i = 0; i < n+1; i++){
            System.out.println(i + " " + power);
            power = 2*power;
        }
    }
}