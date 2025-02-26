import java.util.Scanner;

public class MenuDrivenProgram {

    // Method to display menu
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    // Method to get user choice
    public static int getUserChoice(Scanner scanner) {
        int choice = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter your choice (1-3): ");
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 3) {
                    validInput = true;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.next(); // Clear invalid input
            }
        }
        return choice;
    }

    // Method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Method to get an integer input from the user
    public static int getIntegerInput(Scanner scanner) {
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter an integer: ");
            
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }
        return number;
    }

    // Method to check if a number is even or odd
    public static void checkEvenOrOdd(int number) {
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is an " + result + " number.");
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            displayMenu();
            int choice = getUserChoice(scanner);
            
            switch (choice) {
                case 1:
                    greetUser();
                    break;
                case 2:
                    int number = getIntegerInput(scanner);
                    checkEvenOrOdd(number);
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    exit = true;
                    break;
            }
        }
        
        scanner.close();
    }
}