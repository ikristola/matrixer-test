package org.matrixertest.filesaver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileSaver {

    String datePattern = "HHmmss";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);

    public Path saveSomeText(String filename) {
        try {
            String timestamp = simpleDateFormat.format(new Date());
            File file = new File(filename + ".txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
                file.deleteOnExit();
                return file.toPath();
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }
}
