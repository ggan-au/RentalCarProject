package model;

import java.util.Scanner;

public class Car {
    private final String make;
    private final String model;
    private final int year;
    private final String licensePlate;

    public Car(String make, String model, int year, String licensePlate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
    }


    public static Car createFromInput(Scanner scanner) {
        System.out.println("Make: ");
        String make = scanner.nextLine().trim();

        System.out.println("Model: ");
        String model = scanner.nextLine().trim();

        int year;
        while (true) {
            System.out.println("Year: ");
            try {
                year = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid year (eg. 2007).");
            }
        }

        System.out.println("License Plate: ");
        String licensePlate = scanner.nextLine().trim();

        return new Car(make, model, year, licensePlate);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String toString() {
        return String.format("Make: %s | Model: %s | Year: %d | License Plate: %s", make, model, year, licensePlate);
    }

    public String toCsv() {
        return String.format("%s,%s,%d,%s", make, model, year, licensePlate);
    }
}
