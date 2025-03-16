package JavaAdvanced.Examples.AbstractClasses.Enum;

public class Main {

    public static void main(String[] args) {
//        DaysOfWeek daysOfWeek = DaysOfWeek.MONDAY;
//        System.out.println(daysOfWeek);
        Meeting m = new Meeting("Java", 420, WorkingDays.Monday);
        System.out.println(m.getMeeting());
        WorkingDays[] wd = WorkingDays.values();
        for (WorkingDays w : wd) {
            System.out.println(w.toString());
        }
    }
}
