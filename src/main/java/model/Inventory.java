package model;

import util.*;
import java.util.List;
import java.util.ArrayList;

public class Inventory {
    private final static List<Car> carInventory = new ArrayList<>();
    private final static String filename = "inventory.csv";
    private static boolean initialInventoryLoad = false;

    public Inventory() {
    }

    public static void addCar(Car car) {
        carInventory.add(car);
        CarFileWriter.saveToFile(carInventory, filename);
    }

    public static List<String> getInventoryAsString() {
        if (!initialInventoryLoad) {
            CarFileReader.readFromFile(filename);
            initialInventoryLoad = true;
        }

        List<String> output = new ArrayList<>();

        if (carInventory.isEmpty()) {
            output.add("model.Inventory is empty.");
        } else {
            output.add("-----------------------------------------------------------------");
            for (Car car : carInventory) {
                output.add(car.toString());
                output.add("-----------------------------------------------------------------");
            }
        }
        return output;
    }

    public static void loadFromCSV(String csvFile) {
        String[] parts = csvFile.split(",");

        String make = parts[0];
        String model = parts[1];
        int year = Integer.parseInt(parts[2]);
        String licensePlate = parts[3];

        Car car = new Car(make, model, year, licensePlate);
        carInventory.add(car);
    }
}
