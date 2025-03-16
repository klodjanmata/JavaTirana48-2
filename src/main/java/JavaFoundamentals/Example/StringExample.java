package JavaFoundamentals.Example;

public class StringExample {
    public static void main(String[] args) {
        String str = new String("\"Hello\\World\"");
        System.out.println(str);
        String str2 = str.toUpperCase().trim();
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println("str  : " + str.length());
        System.out.println("str 2: " + str2.length());
        System.out.println("%d");
        System.out.printf("%d", 20);
    }
}

/**

        [a-c14-7]

 */
