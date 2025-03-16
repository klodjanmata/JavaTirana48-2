package JavaFundamentalsCoding.Task13;

import JavaFundamentalsCoding.Helper;

public class Stuter {
    public static void main(String[] args) {
        System.out.println("Enter text: ");
        String text = Helper.getStringFromUser();
        System.out.println(stuterText(text));
    }

    public static String stuterText(String text){
        String newText = "";
        String[] words = text.split(" ");
        for (String word : words){
            newText += word + " " + word + " ";
        }
        return newText;
    }
}
