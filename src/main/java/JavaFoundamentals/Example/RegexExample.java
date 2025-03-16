package JavaFoundamentals.Example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a]*[b-d]+");
        Matcher matcher = pattern.matcher("aabcd");
        System.out.println(matcher.matches());
    }
}
