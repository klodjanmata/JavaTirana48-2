package University.Registers;

import JavaFundamentalsCoding.Helper;
import University.Entity.Department;
import University.Entity.FieldOfStudy;
import University.Entity.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SubjectRegister {
    private List<Subject> subjects;

    public Subject findById(String id) {
        for (Subject s : subjects) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public void createNewSubject() {
        System.out.println("Creating new subject");
        Subject s = new Subject();
        System.out.print("ID: ");
        // TO DO
        // check if it exists before saving
        s.setId(Helper.getStringFromUser());
        System.out.print("Name: ");
        s.setName(Helper.getStringFromUser());
        System.out.println("Chose Department: ");
        Department.printChoseDepartment();
        int choice  = Helper.getIntFromUser();
        s.setDepartment(Department.values()[choice - 1]);
        System.out.println("Chose Field of Study: ");
        FieldOfStudy.printChoseField();
        choice = Helper.getIntFromUser();
        s.setFieldOfStudy(FieldOfStudy.values()[choice - 1]);
        System.out.print("Year: ");
        s.setYear(Helper.getIntFromUser());
        System.out.print("Semester: ");
        s.setSemester(Helper.getIntFromUser());
        System.out.print("Credits: ");
        s.setCredits(Helper.getIntFromUser());
        subjects.add(s);
    }

    public void printAllSubjects() {
        System.out.println(" ID\tName\tYear\tSemester\tCredits\tDepartment");
        if (subjects != null) {
            subjects.forEach(System.out::println);
        }
    }

    public List<String> chosenSubjects(Department department) {
        List<Subject> filteredList = filterSubjectsByDepartment(department);
        int i = 1;
        for(Subject subject : filteredList){
            System.out.println(i + "-  " + subject.getName());
        }
        // TO DO
        return new ArrayList<>();

    }

    public List<Subject> filterSubjectsByDepartment(Department department) {
        return  subjects.stream()
                .filter(subject -> subject.getDepartment().equals(department))
                .collect(Collectors.toList());
    }

    public SubjectRegister(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public SubjectRegister() {
        this.subjects = new ArrayList<>();
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
