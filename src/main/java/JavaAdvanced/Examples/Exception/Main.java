package JavaAdvanced.Examples.Exception;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> values = new ArrayList<>();
        values.add("Jan");
        //System.out.println("Value at index 3: " + values.get(5));
        //System.out.println("Test");
        //System.out.printf("Value at index 3: %d\n", values.get(0));
        try {
            System.out.println("Value at index 3: " + values.get(0));
            System.out.printf("Value at index 3: %d\n", values.get(0));
        }catch (Exception e) {
            e.printStackTrace();
        }
//        }catch (IndexOutOfBoundsException e) {
//            System.out.println("No value at index");
//        }
//        catch (IllegalFormatConversionException ee) {
//            System.out.println("Illegal format");
//        }
        System.out.println("Test 2");
    }
}
