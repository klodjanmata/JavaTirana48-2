package JavaAdvanced.Examples.AbstractClasses.Enum;

public class Meeting {
    private final String subject;
    private final int duration;
    private final WorkingDays workingDay;
    private boolean deleted;

    public Meeting(String subject, int duration, WorkingDays workingDay) {
        this.subject = subject;
        this.duration = duration;
        this.workingDay = workingDay;
        this.deleted = false;
    }

    public String getMeeting(){
        return "Meeting: " + subject + ", " + duration + " min, " + workingDay;
    }

    public void deleteMeeting(){
        this.deleted = true;
    }
}
