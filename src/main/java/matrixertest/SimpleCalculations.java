package matrixertest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleCalculations {

    String datePattern = "HHmmss";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);

    int addition(int x, int y) {
        System.out.println("Addition");
        return x + y;
    }

    int subtraction(int x, int y) {
        System.out.println("Subtract");
        return x - y;
    }

    int multiplication(int x, int y) {
        System.out.println("Multiplication");
        return x * y;
    }

    void saveSomeText() {
        try {
            String timestamp = simpleDateFormat.format(new Date());
            File myObj = new File("filename" + timestamp + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    }
}
