package JavaFoundamentals.HomeWork;

import JavaFundamentalsCoding.Helper;

public class Characters {

    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        char character = Helper.getCharFromUser();

        if (character >= '0' && character <= '9'){
            System.out.println("Number");
        }
        else if (character >= 'A' && character <= 'z'){
            if (    character == 'A' || character == 'a' ||
                    character == 'E' || character == 'e' ||
                    character == 'I' || character == 'i' ||
                    character == 'O' || character == 'o' ||
                    character == 'U' || character == 'u' ||
                    character == 'Y' || character == 'y'
            ) {
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }
        else {
            System.out.println("Symbol");
        }

    }
}
