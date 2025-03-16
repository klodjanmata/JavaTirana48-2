package University.FilesIO;

import University.Entity.Department;
import University.Entity.FieldOfStudy;
import University.Entity.Subject;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SubjectCSVUtil {
    private static final String SUBJECTFILE = "UniversityFiles\\Subject.csv";
    private static final String SEPARATOR = ",";

    public void writeToFile(List<Subject> subjectList) {
        String header = "ID" + SEPARATOR +
                        "Name" + SEPARATOR +
                        "Year" + SEPARATOR +
                        "Semester" + SEPARATOR +
                        "Credits" + SEPARATOR +
                        "Department" + SEPARATOR +
                        "Field Of Study";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(SUBJECTFILE))){
            writer.write(header);
            for (Subject s : subjectList){
                writer.newLine();
                writer.write(s.getId() + SEPARATOR);
                writer.write(s.getName() + SEPARATOR);
                writer.write(s.getYear() + SEPARATOR);
                writer.write(s.getSemester() + SEPARATOR);
                writer.write(s.getCredits() + SEPARATOR);
                writer.write(s.getDepartment() + SEPARATOR);
                writer.write(s.getFieldOfStudy().toString());
            }
            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public List<Subject> readFromFile(){
        List<Subject> subjectList = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(SUBJECTFILE))){
            boolean firstLine = true;
            String line;
            while((line = reader.readLine()) != null){
                if (firstLine){
                    firstLine = false;
                    continue;
                }
                String[] data = line.split(SEPARATOR);
                Subject s = new Subject();
                s.setId(data[0]);
                s.setName(data[1]);
                s.setYear(Integer.parseInt(data[2]));
                s.setSemester(Integer.parseInt(data[3]));
                s.setCredits(Integer.parseInt(data[4]));
                s.setDepartment(Department.valueOf(data[5]));
                s.setFieldOfStudy(FieldOfStudy.valueOf(data[6]));
                subjectList.add(s);
            }
            reader.close();
            return subjectList;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
