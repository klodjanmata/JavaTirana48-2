package University.Registers;

import JavaFundamentalsCoding.Helper;
import University.Entity.Department;
import University.Entity.Lecturer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class LecturerRegister {
    private HashMap<String, Lecturer> lecturers;

    public void createNewLecturer(){
        System.out.println("Creating new lecturer! Please give the correct information about the lecturer.");
        Lecturer l = new Lecturer();
        System.out.print("ID: ");
        String id = Helper.getStringFromUser();
        if (containsLecturerById(id)){
            System.out.println("This lecturer already exists!");
            return;
        }
        l.setId(id);
        System.out.print("Name: ");
        l.setName(Helper.getStringFromUser());
        System.out.print("Surname: ");
        l.setSurname(Helper.getStringFromUser());
        System.out.print("Gender: (M, F)");
        l.setGender(Helper.getCharFromUser());
        System.out.print("Date of birth:");
        l.setBirthday(Helper.getDateFromUser());
        System.out.print("Start date: ");
        l.setStartDate(Helper.getDateFromUser());
        System.out.print("Email: ");
        l.setEmail(Helper.getStringFromUser());
        System.out.print("Phone number: ");
        l.setPhoneNumber(Helper.getStringFromUser());
        System.out.println("Chose Department: ");
        Department.printChoseDepartment();
        int choice = Helper.getIntFromUser();
        l.setDepartment(Department.values()[choice-1]);
        System.out.println("Select subjects: ");
        //l.setSubjectList();
        lecturers.put(l.getId(), l);
    }

    public void printALlLecturers(){
        System.out.println("  ID\tName\tSurname\t  Department\t Start Date\t  Email\t\t\t\t   Phone\tGen\t\tB. Day\t Subject List");
        if (lecturers != null){
            lecturers.values().forEach(System.out::println);
        }
    }



    public boolean containsLecturerById(String id){
        if(lecturers.get(id) == null){
            return false;
        }else{
            return true;
        }
//        return lecturers.get(id) == null ? false : true;
    }



    public LecturerRegister(HashMap<String, Lecturer> lecturers) {
        this.lecturers = lecturers;
    }

    public LecturerRegister() {
        lecturers = createTestLecturer();
//        Lecturer lecturer = createTestLecturer();
//        lecturers.put(lecturer.getId(), lecturer);
    }

    private HashMap<String, Lecturer> createTestLecturer(){
        HashMap<String, Lecturer> lecturers = new HashMap<>();
        Lecturer l = new Lecturer();
        l.setId("Test1");
        l.setName("Alban");
        l.setSurname("Hoxha");
        l.setGender('M');
        l.setBirthday(new Date());
        l.setStartDate(new Date());
        l.setDepartment(Department.ARCHITECTURE);
        l.setEmail("alban@gmail.com");
        l.setPhoneNumber("1234567890");
        l.setSubjectList(new ArrayList<>());
        lecturers.put(l.getId(), l);
        l = new Lecturer();
        l.setId("Test2");
        l.setName("Alban");
        l.setSurname("Hoxha");
        l.setGender('M');
        l.setBirthday(new Date());
        l.setStartDate(new Date());
        l.setDepartment(Department.ARCHITECTURE);
        l.setEmail("alban@gmail.com");
        l.setPhoneNumber("1234567890");
        l.setSubjectList(new ArrayList<>());
        lecturers.put(l.getId(), l);
        l = new Lecturer();
        l.setId("Test3");
        l.setName("Alban");
        l.setSurname("Hoxha");
        l.setGender('M');
        l.setBirthday(new Date());
        l.setStartDate(new Date());
        l.setDepartment(Department.ARCHITECTURE);
        l.setEmail("alban@gmail.com");
        l.setPhoneNumber("1234567890");
        l.setSubjectList(new ArrayList<>());
        lecturers.put(l.getId(), l);
        return lecturers;
    }

    public HashMap<String, Lecturer> getLecturers() {
        return lecturers;
    }

    public void setLecturers(HashMap<String, Lecturer> lecturers) {
        this.lecturers = lecturers;
    }
}
