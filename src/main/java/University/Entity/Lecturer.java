package University.Entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Lecturer extends Person{
    private static final SimpleDateFormat dateFormater = new SimpleDateFormat("dd.MM.yyyy");
    private Department department;
    private List<String> subjectList;
    private Date startDate;
    private String email;
    private String phoneNumber;

    public Lecturer(String id, String name, String surname, char gender, Date birthday,
                    Department department, List<String> subjectList, Date startDate, String email) {
        super(id, name, surname, gender, birthday);
        this.department = department;
        this.subjectList = subjectList;
        this.startDate = startDate;
        this.email = email;
    }

    public Lecturer(){}

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<String> subjectList) {
        this.subjectList = subjectList;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return
                " " + id + '\t' +
                " " + name + '\t' +
                " " + surname + '\t' +
                " " + department + '\t' +
                " " + dateFormater.format(startDate) + '\t' +
                " " + email + '\t' +
                " " + phoneNumber + '\t' +
                " " + gender + '\t' +
                " " + dateFormater.format(birthday) + '\t' +
                " " + subjectList;
    }
}
