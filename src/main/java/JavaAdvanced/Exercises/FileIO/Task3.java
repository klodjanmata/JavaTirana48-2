package JavaAdvanced.Exercises.FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    private static final String FILENAME = "Files\\Test.txt";

    public static void main(String[] args) {
        List<String> content = readFile();
        printStringList(content);

        System.out.println("Longest:\n" + longestWord(content));
//        String toAdd = "\nPoezi nga ChatGPT\n";
//        content.add(6, toAdd);
//        writeFile(content);
    }

    public static String longestWord(List<String> content) {
        String longest = "";
        for (String s : content) {
            String[] words = s.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > longest.length()){
                    longest = words[i];
                }
            }
        }
        return longest;
    }

    public static void printStringList(List<String> list) {
        for(String s : list){
            System.out.println(s);
        }
    }

    public static List<String> readFile() {
        List<String> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line= br.readLine()) !=null){
                list.add(line);
            }
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public static void writeFile(List<String> list) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))){
            for (String s : list){
                writer.write(s);
                writer.newLine();
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();

        }

    }



}
