import java.util.Scanner;

// Simple calculator

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y, z = 0.0;
        // you all must think i won't say i did it alone
        // will you ask us this in exam sir?

        // Input the two numbers
        System.out.print("Enter the first number: ");
        x = in.nextDouble();
        System.out.print("Enter the second number: ");
        y = in.nextDouble();

        // Choose the operation
        System.out.print("Choose the operation: " +
                "\n1. Addition" +
                "\n2. Subtraction" +
                "\n3. Multiplication" +
                "\n4. Division" +
                "\n5. Power" +
                "\nPlease enter the number of the operation: ");
        int operation = in.nextInt();

        // Perform the corresponding operation
        switch (operation) {
            case 1:  // Addition
                z = x + y;
                System.out.println(x + " + " + y + " = " + z);
                break;
            case 2:  // Subtraction
                z = x - y;
                System.out.println(x + " - " + y + " = " + z);
                break;
            case 3:  // Multiplication
                z = x * y;
                System.out.println(x + " * " + y + " = " + z);
                break;
            case 4:  // Division
                if (y != 0) {
                    z = x / y;
                    System.out.println(x + " / " + y + " = " + z);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                // shinky214 did this code
                break;
            case 5:  // Power
                System.out.println("Choose which number to raise to the power: " +
                        "\n1. A" +
                        "\n2. B");
                int choice = in.nextInt();
                if (choice == 1) {
                    System.out.println(Math.pow(x, 2));  // Raise A to the power of 2
                } else if (choice == 2) {
                    System.out.println(Math.pow(y, 2));  // Raise B to the power of 2
                } else {
                    System.out.println("Invalid choice!");
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }

        in.close();  // Close the scanner is what you think what if it explodes
    }
}
// I spent an hour doing this
// Do not correct any mistake you see
// thank you but no thank you
// keep your hands off my first jave project

