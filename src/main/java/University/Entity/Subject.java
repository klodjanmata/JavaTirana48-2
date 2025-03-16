package University.Entity;

public class Subject {
    private String id;
    private String name;
    private Department department;
    private FieldOfStudy fieldOfStudy;
    private int year;
    private int semester;
    private int credits;

    public Subject(String id, String name, Department department, FieldOfStudy fieldOfStudy,
                   int year, int semester, int credits) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.fieldOfStudy = fieldOfStudy;
        this.year = year;
        this.semester = semester;
        this.credits = credits;
    }

    public Subject() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public FieldOfStudy getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(FieldOfStudy fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return
                " " + id  + "\t" +
                " " + name + "\t" +
                " " + year + "\t" +
                " " + semester + "\t" +
                " " + credits + "\t" +
                " " + department + "\t" +
                " " + fieldOfStudy;
    }
}
