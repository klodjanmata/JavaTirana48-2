package University.Registers;

import JavaFundamentalsCoding.Helper;
import University.Entity.Grade;
import University.Entity.Student;
import University.Entity.Subject;
import java.util.ArrayList;
import java.util.List;

public class GradeRegister {

    private List<Grade> gradeList;

    public void createNewGrade(){
        System.out.println("Adding Grade");
        Grade newGrade = new Grade();
        System.out.print("Student ID: ");
        newGrade.setStudentId(Helper.getStringFromUser());
        System.out.print("Subject ID: ");
        newGrade.setSubjectId(Helper.getStringFromUser());
        System.out.print("Grade: ");
        newGrade.setGrade(Helper.getIntFromUser());
        gradeList.add(newGrade);
    }

    public void printAllGrades(){
        System.out.println("StdID\tSubId\tGrade");
        for (Grade g : gradeList){
            System.out.println(g.toString());
        }
    }

    public void printGradesFormated(StudentRegister studentRegister, SubjectRegister subjectRegister){
        System.out.println("Name\tSurname\tSubject\tGrade");
        for (Grade g : gradeList){
            Student s = studentRegister.findById(g.getStudentId());
            System.out.print(s.getName() + "\t" + s.getSurname() + "\t");
            Subject su = subjectRegister.findById(g.getSubjectId());
            System.out.print(su.getName() + "\t");
            System.out.print(g.getGrade() + "\n");
        }
    }

    public GradeRegister(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    public GradeRegister(){
        gradeList = new ArrayList<>();
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }
}
