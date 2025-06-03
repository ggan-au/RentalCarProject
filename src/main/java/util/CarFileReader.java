package util;

import model.Car;
import model.Inventory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarFileReader {
    public static void readFromFile(String filename) {
        List<Car> cars = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                Inventory.loadFromCSV(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
