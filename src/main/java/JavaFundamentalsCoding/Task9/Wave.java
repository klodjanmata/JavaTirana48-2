package JavaFundamentalsCoding.Task9;

import JavaFundamentalsCoding.Helper;

public class Wave {
    public static void main(String[] args){
        System.out.print("Enter Positive Number: ");
        int rows = Helper.getIntFromUser();
        for (int i = 0; i < rows; i++){
            for(int a = 0; a < 3; a++){
                for (int j = 0; j < i; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int k = 0; k < rows - i - 1; k++){
                    System.out.print(" ");
                }
                for (int k = 0; k < rows - i - 1; k++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < i; j++){
                    System.out.print(" ");
                }
            }
            if (i < rows / 2){
                for (int j = 0; j < i; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/**
 number = 4;

 i = 0      *---    ---*    *---    ---**
 i = 1      -*--    --*-    -*--    --*--*
 i = 2      --*-    -*--    --*-    -*--
 i = 3      ---*    *---    ---*    *---



 */
