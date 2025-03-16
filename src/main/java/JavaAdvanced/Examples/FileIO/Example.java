package JavaAdvanced.Examples.FileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) throws IOException {
        String filepath = "Files\\output.txt";
        String output = "I am printing this thing in a file for the first time in my life!";
        try {
            FileWriter fileWriter = new FileWriter(filepath);
            fileWriter.write(output);
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        List<Character> readString = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filepath);
            int c =  fileReader.read();
            while(c != -1) {
                readString.add((char) c);
                c = fileReader.read();
            }
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        for (int i = 0; i < readString.size(); i++) {
            System.out.print(readString.get(i));
        }
    }
}
