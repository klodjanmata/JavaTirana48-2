package JavaAdvanced.Examples.FileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadByLine {
//    public static void main(String[] args) throws IOException {
//        String inputFile = "Files\\input.txt";
//        String reversedFile = "Files\\reversed.txt";
//        StringBuilder content = new StringBuilder();
//        //String content = "";
//        BufferedReader br = new BufferedReader(new FileReader(inputFile));
//        String line;
//        while((line = br.readLine()) != null){
//            //System.out.println(line);
//            content.append(line).append(System.lineSeparator());
//        }
//        br.close();
//        System.out.println(content);
//
//        System.out.println("Writing in file");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(reversedFile));
//        bw.write(content.toString());
//        bw.close();
//        System.out.println("DONE!");
//    }

    public static void main(String[] args) throws IOException {
        String inputFile = "Files\\input.txt";
        String outputFile = "Files\\reversed.txt";
        List<String> lines = readFromFile(inputFile);
        lines = reverseListOrder(lines);
        writeToFile(outputFile, lines);
    }

    public static List<String> readFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        List<String> content = new ArrayList<>();
        while((line = br.readLine()) != null){
            content.add(line);
        }
        br.close();
        return content;
    }

    public static <E> List<E> reverseListOrder(List<E> inputList){
        List<E> reversedList = new ArrayList<>();
        for(int i = inputList.size() - 1; i >= 0; i--){
            reversedList.add(inputList.get(i));
        }
        return reversedList;
    }

    public static void writeToFile(String fileName, List<String> content) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        for(String line : content){
            //line += System.lineSeparator();
            bw.write(line);
            bw.write(System.lineSeparator());
        }
        bw.close();
    }
}
