package JavaFundamentalsCoding.Task17;

import JavaFundamentalsCoding.Helper;
import java.time.LocalDate;
import java.time.Period;

public class DateSDA {
    public static void main(String[] args) {
        System.out.print("Enter a date in format yyyy-MM-DD: ");
        String date = Helper.getStringFromUser();
        LocalDate localdate = LocalDate.parse(date);
        System.out.println(localdate);
        LocalDate today = LocalDate.now();
        Period p = Period.between(today, localdate);
        System.out.println("Number of days till SDA course: "
                + p.getYears() + ", "
                + p.getMonths() + ", "
                + p.getDays());

    }
}
