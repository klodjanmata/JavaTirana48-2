package JavaFundamentalsCoding.Task12;

import JavaFundamentalsCoding.Helper;

public class FindPercentage {

    public static void main(String[] args){
        System.out.println("Enter text: ");
        String text = Helper.getStringFromUser();
        int counter = Helper.countCharacters(text, ' ');
        float percentage = Helper.calculatePercentage(counter, text.length());
        System.out.printf("Percentage: %3.2f %c", percentage, '%' );
        //System.out.printf("Percentage: %3.2f %c", calculatePercentage(countCharacters(text, ' '), text.length()), '%' );
    }

}
