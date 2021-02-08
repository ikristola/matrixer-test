package matrixerprototype;

import java.io.File;
import java.io.IOException;

public class SimpleCalculations {

    int addition(int x, int y) {
        System.out.println("Addition\n");
        int t = x;
        return t + y;
//        return x + y;
    }

    int subtraction(int x, int y) {
        System.out.println("Subtract\n");
        if (y > x) {
            return y - x;
        }
        else {
            return x - y;
        }
    }

    int multiplication(int x, int y) {
        System.out.println("Multiplicatio\n");
        return x * y;
    }

    void saveSomeText() {
        try {
            File myObj = new File("filename.txt");
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
