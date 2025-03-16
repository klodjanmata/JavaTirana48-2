package University.FilesIO;

import University.Entity.Grade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class GradeCSVUtil {
    public static final String FILENAME = "UniversityFiles\\Grades.csv";
    public static final String SEPARATOR = ",";

    public void writeToCSV(List<Grade> grades) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
            bw.write(getHeader());
            for (Grade grade : grades) {
                bw.newLine();
                bw.write(grade.getStudentId() + SEPARATOR);
                bw.write(grade.getSubjectId() + SEPARATOR);
                bw.write(grade.getGrade() + SEPARATOR);
            }
            bw.close();
        }catch (Exception e){
            System.out.println("Error writing Grades");
            e.printStackTrace();
        }
    }

    public List<Grade> readFromCSV() {
        List<Grade> grades = new ArrayList<Grade>();
        try(BufferedReader br = new BufferedReader(new FileReader(FILENAME))){
            boolean firstLine = true;
            String line;
            while((line = br.readLine()) != null){
                if(firstLine){
                    firstLine = false;
                    continue;
                }
                String[] info = line.split(SEPARATOR);
                Grade g = new Grade();
                g.setStudentId(info[0]);
                g.setSubjectId(info[1]);
                g.setGrade(Integer.parseInt(info[2]));
                grades.add(g);
            }
            br.close();
        }catch (Exception e){
            System.out.println("Error reading Grades");
            e.printStackTrace();
        }
        return grades;
    }

    private String getHeader() {
        return  "StudentID,SubjectID,Grade";
    }
}
