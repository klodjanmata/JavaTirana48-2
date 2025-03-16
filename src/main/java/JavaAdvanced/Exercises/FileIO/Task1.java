package JavaAdvanced.Exercises.FileIO;

import java.io.File;

public class Task1 {

    //check path
    private static final String FILENAME = "D:\\Documents\\SDA\\JavaTirana48";
    public static void main(String[] args) {

        File file = new File(FILENAME);
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);

        }
    }
}