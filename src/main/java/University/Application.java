package University;

import JavaFundamentalsCoding.Helper;
import University.FilesIO.GradeCSVUtil;
import University.FilesIO.LecturerCSVUtil;
import University.FilesIO.StudentCSVUtil;
import University.FilesIO.SubjectCSVUtil;
import University.Registers.GradeRegister;
import University.Registers.LecturerRegister;
import University.Registers.StudentRegister;
import University.Registers.SubjectRegister;

public class Application {
    private LecturerRegister lecturerRegister;
    private LecturerCSVUtil lecturerCSVUtil;
    private SubjectRegister subjectRegister;
    private SubjectCSVUtil subjectCSVUtil;
    private StudentRegister studentRegister;
    private StudentCSVUtil studentCSVUtil;
    private GradeRegister gradeRegister;
    private GradeCSVUtil gradeCSVUtil;

    public static void main(String[] args) {
        Application app = new Application();
        initUtils(app);
        initRegisters(app);
        while(true){
            printMenu();
            int choice = getChoice();
            if(choice == 0){
                closingOperations(app);
                return;
            }
            executeAction(choice, app);
        }
    }

    private static void initUtils(Application app){
        app.subjectCSVUtil = new SubjectCSVUtil();
        app.lecturerCSVUtil = new LecturerCSVUtil();
        app.studentCSVUtil = new StudentCSVUtil();
        app.gradeCSVUtil = new GradeCSVUtil();
    }

    private static void initRegisters(Application app) {
        app.lecturerRegister = new LecturerRegister(app.lecturerCSVUtil.readAndReturnMap());
        app.subjectRegister = new SubjectRegister(app.subjectCSVUtil.readFromFile());
        app.studentRegister = new StudentRegister(app.studentCSVUtil.readFromFile());
        app.gradeRegister = new GradeRegister(app.gradeCSVUtil.readFromCSV());
    }

    private static void closingOperations(Application app) {
        System.out.println("Closing operations");
        System.out.println("Saving data into files...");
        app.subjectCSVUtil.writeToFile(app.subjectRegister.getSubjects());
        app.lecturerCSVUtil.writeMapToFile(app.lecturerRegister.getLecturers());
        app.studentCSVUtil.writeToFile(app.studentRegister.getStudents());
        app.gradeCSVUtil.writeToCSV(app.gradeRegister.getGradeList());
        System.out.println("Good Bye!!");
    }

    public static void printMenu(){
        System.out.println( "Chose action: \n" +
                "1 - Add Lecturer \n" +
                "2 - Add Student \n" +
                "3 - Add Grades \n" +
                "4 - Add Subject \n" +
                "5 - Print Lecturers \n" +
                "6 - Print Students \n" +
                "7 - Print Subjects \n" +
                "8 - Print Grades \n" +
                "9 - Print Students with GPA \n" +
                "0 - Exit" );
    }

    public static void executeAction(int choice, Application app){
        switch (choice){
            case 1:
                app.lecturerRegister.createNewLecturer();
                break;
            case 2:
                app.studentRegister.createNewStudent();
                break;
            case 3:
                app.gradeRegister.createNewGrade();
                break;
            case 4:
                app.subjectRegister.createNewSubject();
                break;
            case 5:
                app.lecturerRegister.printALlLecturers();
                break;
            case 6:
                app.studentRegister.printAllStudents();
                break;
            case 7:
                app.subjectRegister.printAllSubjects();
                break;
            case 8:
                app.gradeRegister.printGradesFormated(app.studentRegister, app.subjectRegister);
                break;
            case 9:
                app.studentRegister.printStudentWithGPA(app.subjectRegister, app.gradeRegister.getGradeList());
                break;
            default:
                System.out.println("Invalid choice! Please chose again!");
        }
    }

    public static int getChoice(){
        int choice = -1;
        try{
            choice = Helper.getIntFromUser();
        }catch (Exception e){
            choice = -1;
        }
        return choice;
    }
}
