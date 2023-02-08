package bsu.comp152;

public class Main {
    public static void main(String[] args) {
        printProceed("y");
        printProceed("n");
        printProceed("Y");
        powerWhile(16);

        int n = 3;
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
}