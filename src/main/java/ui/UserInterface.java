package ui;

import model.Car;
import model.Inventory;
import util.MenuPrinter;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            MenuPrinter.printMainMenu();
            int menuOption;

            try {
                menuOption = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number. Try again;");
                continue;
            }

            switch (menuOption) {
                case 1 -> {
                    Car newCar = Car.createFromInput(scanner);
                    Inventory.addCar(newCar);
                }
                case 2 -> {
                    for (String line : Inventory.getInventoryAsString()) {
                        System.out.println(line);
                    }
                }
            }
        }
    }
}

