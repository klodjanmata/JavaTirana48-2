package JavaAdvanced.Exercises.Class.Task1;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public String validateEmail(String email){
        Optional<String> input = Optional.ofNullable(email);
        if (input.isPresent()){
            Pattern pattern = Pattern.compile("\\b[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\\.[A-z]{2,4}\\b");
            Matcher matcher = pattern.matcher(input.get());
            if (matcher.matches()){
                return email;
            }
        }

        return "Unknown";
    }
}
