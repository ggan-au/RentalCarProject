package util;

import model.Car;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CarFileWriter {
    public static void saveToFile(List<Car> cars, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Car car : cars) {
                writer.write(car.toCsv() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error saving cars: " + e.getMessage());
        }
    }
}
