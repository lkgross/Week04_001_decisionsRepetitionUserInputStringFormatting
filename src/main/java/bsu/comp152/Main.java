package bsu.comp152;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printProceed("y");
        printProceed("n");
        printProceed("Y");
        powerWhile(-3);

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
        /*
         * When the user types keystrokes at the keyboard, those keystrokes are stored in an area of memory that is sometimes called the keyboard buffer.
         * Note Pressing the Enter key causes a newline character to be stored in the keyboard buffer.
         * Note nextInt will remove and return the first integer it finds in the keyboard buffer.
         */
        int numberOfPowers = keyboard.nextInt();
        printTable(numberOfPowers);
        System.out.println("What is your first name?");
        // nextLine: Java reads the first string it finds in the buffer, including a newline character
        // (This means nextLine will "consume" a newline character it finds in the buffer.)
        String firstName = keyboard.nextLine();
        System.out.println("What is your last name?");
        /*
        Sometimes a string contains a sequence of words or other items of data separated by spaces or other characters.
        In programming terms, such items as these are known as tokens.
        Note next will remove and return the first String token it finds in the keyboard buffer. It does not read newline characters as a token. It considers spaces to separate tokens.
         */
        String lastName = keyboard.next();
        System.out.println("What is your age?");
        int age = keyboard.nextInt();
        // Use printf to print a formatted string.
        // Use %b as a placeholder for a boolean.
        // Use %s as a placeholder for a String.
        System.out.printf("If the value is %b, then do " +
                "the action\n", true);
        System.out.printf("Your first name is %s, and your " +
                "last name is %s\n", firstName, lastName);
        // Use %f as a placeholder for a decimal number.
        System.out.printf("Length is %f and width is %f\n", Math.sqrt(5), Math.sqrt(2));
        // We can specify the number of decimal digits, like 2:
        System.out.printf("Length is %.2f and width is %.2f\n", Math.sqrt(5), Math.sqrt(2));
        // We could allocate 12 spaces for a decimal number with 2 digits:
        System.out.printf("Length is %12.2f and width is %12.2f\n", Math.sqrt(5), Math.sqrt(2));
        // Use %d as a placeholder for an integer ("digit"?).
        System.out.printf("Length is %d and width is %d\n", 100000, 10000);
        // We can include a comma in an integer.
        System.out.printf("Length is %,d and width is %,d\n", 100000, 10000);
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
        if (n <= 0){
            throw new IllegalArgumentException("Must take log base 2 of a positive number");
        }
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