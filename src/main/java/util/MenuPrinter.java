package util;

public class MenuPrinter {

    public static void printMainMenu() {
        System.out.println("=== Main Menu ===");
        System.out.println("1. Add a new car");
        System.out.println("2. List all cars");
        System.out.println("3. List rented cars");
        System.out.println("4. List available cars");
        System.out.println("5. Select a car to rent");
        System.out.println("5. Return a rented car");
        System.out.print("Choose an option: ");
    }

    public static void printSettingsMenu() {
        System.out.println("=== Settings ===");
        System.out.println("1. Sound");
        System.out.println("2. Display");
        System.out.println("3. Back");
        System.out.print("Choose an option: ");
    }
}
