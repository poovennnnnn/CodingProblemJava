package pooven;

// This program calculates the Greatest Common Divisor (GCD) of two numbers using the Euclidean Algorithm.
public class GCDOftwoNumbers {

    public static void main(String[] args) {
        // Calculate and print the GCD of 115 and 30 using the gcdOfTwoNumbers method
        System.err.println("GCD of two numbers is: " + gcdOfTwoNumbers(115, 30));
        
        // Demonstrate that 0 modulo 2 is 0
        System.out.println(0 % 2); // Question: Why is this relevant? It shows that 0 modulo any non-zero number is 0.
    }

    // Method to calculate the GCD of two numbers using the Euclidean Algorithm
    static int gcdOfTwoNumbers(int a, int b) {
        int remainder = 1;  // Initialize the remainder to a non-zero value
        int divident = 0;   // Variable to store the larger of the two numbers
        int divisor = 0;    // Variable to store the smaller of the two numbers

        // Determine the larger and smaller number
        if (a > b) {
            divident = a;   // Assign the larger number to 'divident'
            divisor = b;    // Assign the smaller number to 'divisor'
        } else {
            divident = b;   // Assign the larger number to 'divident'
            divisor = a;    // Assign the smaller number to 'divisor'
        }

        // Loop until the remainder is 0
        while (remainder != 0) {
            remainder = divident % divisor;  // Calculate the remainder
            if (remainder != 0) {
                divident = divisor;  // Update the divident
                divisor = remainder; // Update the divisor
            }
        }
        // Return the last non-zero divisor, which is the GCD
        return divisor;
    }
}
