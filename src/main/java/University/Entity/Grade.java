package University.Entity;

public class Grade {
    private String studentId;
    private String subjectId;
    private int grade;

    public Grade(String studentId, String subjectId, int grade) {
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.grade = grade;
    }

    public Grade() {}

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return
                " " + studentId + '\t' +
                " " + subjectId + '\t' +
                " " + grade;
    }
}
