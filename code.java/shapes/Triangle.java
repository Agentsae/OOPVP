package shapes;

import java.util.Scanner;

public class Triangle {
    // Private attributes (access modifiers)
    private double side1;
    private double side2;
    private double side3;

    // Default Constructor
    public Triangle() {
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
    }

    // Parameterized Constructor with validation
    public Triangle(double side1, double side2, double side3) throws IllegalArgumentException {
        validateSides(side1, side2, side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Accessor (Getter) for side1
    public double getSide1() {
        return side1;
    }

    // Mutator (Setter) for side1
    public void setSide1(double side1) throws IllegalArgumentException {
        if (side1 <= 0) {
            throw new IllegalArgumentException("Side length must be positive");
        }
        validateSides(side1, side2, side3);
        this.side1 = side1;
    }

    // Accessor (Getter) for side2
    public double getSide2() {
        return side2;
    }

    // Mutator (Setter) for side2
    public void setSide2(double side2) throws IllegalArgumentException {
        if (side2 <= 0) {
            throw new IllegalArgumentException("Side length must be positive");
        }
        validateSides(side1, side2, side3);
        this.side2 = side2;
    }

    // Accessor (Getter) for side3
    public double getSide3() {
        return side3;
    }

    // Mutator (Setter) for side3
    public void setSide3(double side3) throws IllegalArgumentException {
        if (side3 <= 0) {
            throw new IllegalArgumentException("Side length must be positive");
        }
        validateSides(side1, side2, side3);
        this.side3 = side3;
    }

    // Validate if three sides can form a valid triangle
    private void validateSides(double a, double b, double c) throws IllegalArgumentException {
        // All sides must be positive
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("All sides must be positive numbers");
        }

        // Triangle inequality theorem: sum of any two sides must be greater than the third
        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new IllegalArgumentException("Invalid triangle: sides must satisfy triangle inequality theorem");
        }
    }

    // Calculate perimeter (circumference)
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    // Calculate area using Heron's formula
    public double calculateArea() {
        double s = calculatePerimeter() / 2; // semi-perimeter
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    // Display triangle information
    public void displayInfo() {
        System.out.println("\n========== Triangle Information ==========");
        System.out.println("Side 1: " + side1);
        System.out.println("Side 2: " + side2);
        System.out.println("Side 3: " + side3);
        System.out.println("Perimeter: " + String.format("%.2f", calculatePerimeter()));
        System.out.println("Area: " + String.format("%.2f", calculateArea()));
        System.out.println("==========================================\n");
    }

    // Main method to accept user input and demonstrate the Triangle class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = null;

        System.out.println("===== Triangle Area and Circumference Calculator =====\n");

        while (true) {
            try {
                System.out.println("Enter the three sides of the triangle:");

                // Input validation for side 1
                System.out.print("Enter Side 1: ");
                if (!scanner.hasNextDouble()) {
                    System.out.println("Error: Invalid input. Please enter a valid number.\n");
                    scanner.nextLine(); // Clear invalid input
                    continue;
                }
                double inputSide1 = scanner.nextDouble();

                // Input validation for side 2
                System.out.print("Enter Side 2: ");
                if (!scanner.hasNextDouble()) {
                    System.out.println("Error: Invalid input. Please enter a valid number.\n");
                    scanner.nextLine();
                    continue;
                }
                double inputSide2 = scanner.nextDouble();

                // Input validation for side 3
                System.out.print("Enter Side 3: ");
                if (!scanner.hasNextDouble()) {
                    System.out.println("Error: Invalid input. Please enter a valid number.\n");
                    scanner.nextLine();
                    continue;
                }
                double inputSide3 = scanner.nextDouble();

                // Create triangle with validated input
                triangle = new Triangle(inputSide1, inputSide2, inputSide3);
                triangle.displayInfo();

                // Menu for further operations
                boolean continueMenu = true;
                while (continueMenu) {
                    System.out.println("What would you like to do?");
                    System.out.println("1. Modify a side (using mutator)");
                    System.out.println("2. View triangle information");
                    System.out.println("3. Enter new triangle");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice (1-4): ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Error: Invalid choice. Please enter a number 1-4.\n");
                        scanner.nextLine();
                        continue;
                    }

                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            try {
                                System.out.println("\nWhich side to modify?");
                                System.out.println("1. Side 1 (current: " + triangle.getSide1() + ")");
                                System.out.println("2. Side 2 (current: " + triangle.getSide2() + ")");
                                System.out.println("3. Side 3 (current: " + triangle.getSide3() + ")");
                                System.out.print("Enter choice (1-3): ");

                                if (!scanner.hasNextInt()) {
                                    System.out.println("Error: Invalid input.\n");
                                    scanner.nextLine();
                                    break;
                                }

                                int sideChoice = scanner.nextInt();
                                System.out.print("Enter new value: ");

                                if (!scanner.hasNextDouble()) {
                                    System.out.println("Error: Invalid input.\n");
                                    scanner.nextLine();
                                    break;
                                }

                                double newValue = scanner.nextDouble();

                                switch (sideChoice) {
                                    case 1:
                                        triangle.setSide1(newValue);
                                        break;
                                    case 2:
                                        triangle.setSide2(newValue);
                                        break;
                                    case 3:
                                        triangle.setSide3(newValue);
                                        break;
                                    default:
                                        System.out.println("Error: Invalid choice.\n");
                                        break;
                                }
                                triangle.displayInfo();
                            } catch (IllegalArgumentException e) {
                                System.out.println("Error: " + e.getMessage() + "\n");
                            }
                            break;

                        case 2:
                            triangle.displayInfo();
                            break;

                        case 3:
                            continueMenu = false;
                            System.out.println();
                            break;

                        case 4:
                            System.out.println("\nThank you for using Triangle Calculator. Goodbye!");
                            scanner.close();
                            return;

                        default:
                            System.out.println("Error: Invalid choice. Please enter 1-4.\n");
                    }
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + "\n");
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage() + "\n");
                scanner.nextLine();
            }
        }
    }
}
