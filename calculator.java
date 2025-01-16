import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object to take input from the user
        int choice;

        do {
            // Display the menu options to the user
            System.out.println("\nMenu:");
            System.out.println("1) Calculator");
            System.out.println("2) Factorial");
            System.out.println("3) Fibonacci");
            System.out.println("4) Root");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();  // Read user's choice

            // Perform the corresponding operation based on the user's choice
            switch (choice) {
                case 1:
                    calculator(sc);  // Call calculator function
                    break;
                case 2:
                    factorial(sc);   // Call factorial function
                    break;
                case 3:
                    fibonacci(sc);   // Call fibonacci function
                    break;
                case 4:
                    root(sc);        // Call root function
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");  // Exit message
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");  // Handle invalid input
            }
        } while (choice != 5);  // Continue looping until the user selects option 5 to exit

        sc.close();  // Close the scanner object to prevent resource leak
    }

    // Calculator function: Performs basic arithmetic operations
    public static void calculator(Scanner sc) {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();  // Read the first number
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();  // Read the second number
        System.out.println("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);  // Read the operation (char)

        double result;
        // Perform the selected operation
        switch (op) {
            case '+':
                result = num1 + num2;  // Addition
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;  // Subtraction
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;  // Multiplication
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {  // Check for division by zero
                    result = num1 / num2;  // Division
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation.");  // Handle invalid operator
        }
    }

    // Factorial function: Calculates the factorial of a given number
    public static void factorial(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();  // Read the input number
        long fact = 1;  // Initialize factorial to 1
        // Calculate factorial using a loop
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);  // Output the result
    }

    // Fibonacci function: Prints Fibonacci series up to the given number of terms
    public static void fibonacci(Scanner sc) {
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();  // Read the number of terms
        int a = 0, b = 1;  // First two Fibonacci numbers
        System.out.println("Fibonacci Series: ");
        // Print Fibonacci series up to n terms
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");  // Print the current Fibonacci number
            int next = a + b;  // Calculate the next Fibonacci number
            a = b;  // Update a to b
            b = next;  // Update b to the next Fibonacci number
        }
        System.out.println();  // Print a new line after the series
    }

    // Root function: Calculates the square root of a given number
    public static void root(Scanner sc) {
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();  // Read the number
        if (num < 0) {
            System.out.println("Square root of negative numbers is not defined for real numbers.");
        } else {
            System.out.println("Square root of " + num + " is: " + Math.sqrt(num));  // Output the square root
        }
    }
}
