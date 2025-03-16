package LiveCoding;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String test = "Hello World its me Java Tirana 48 I am Java Tirana Java Java Java Tirana";
        countWords(test);
    }

    public static void countWords(String test) {
        String[] words = test.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++){
            if (map.containsKey(words[i])){
                int a = map.get(words[i]);
                a++;
                map.put(words[i], a);
            }
            else{
                map.put(words[i], 1);
            }
        }
        for(String word : map.keySet()) {
            System.out.println(word + ": " + map.get(word));
        }
    }

    public static void testTry1() {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        int counter = 0;
        int count=0;
        System.out.println("Enter a word which can be hello or world");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();

            if (arr[i].equals("hello")) {
                counter++;
            }
            else if (arr[i].equals("world")) {
                count++;
            }


        }  System.out.println("The number of the word 'hello' in the array is:"+counter);
        System.out.println("The numnber of word 'world' in the array is:"+count);
    }


}
