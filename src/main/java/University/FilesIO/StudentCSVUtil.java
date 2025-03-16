package University.FilesIO;

import University.Entity.FieldOfStudy;
import University.Entity.Student;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class StudentCSVUtil {
    private static final String FILENAME = "UniversityFiles\\Students.csv";
    private static final String SEPARATOR = ",";
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public void writeToFile(List<Student> students){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            writer.write(getHeader());
            for(Student s : students){
                writer.newLine();
                writer.write(s.getId() + SEPARATOR);
                writer.write(s.getName() + SEPARATOR);
                writer.write(s.getSurname() + SEPARATOR);
                writer.write(s.getGender() + SEPARATOR);
                writer.write(dateFormat.format(s.getBirthday()) + SEPARATOR);
                writer.write(s.getFieldOfStudy() + SEPARATOR);
                writer.write(dateFormat.format(s.getDateOfStart()) + SEPARATOR);
                writer.write(s.isGraduated() + SEPARATOR);
                writer.write(dateFormat.format(s.getDateOfGraduation()) + SEPARATOR);
                writer.write(String.valueOf(s.getGpa()));
            }
            writer.close();
        }catch (IOException e){
            System.out.println("Error while writing Students");
            e.printStackTrace();

        }
    }

    public List<Student> readFromFile(){
        try(BufferedReader reader = new BufferedReader(new FileReader(FILENAME))){
            List<Student> students = new ArrayList<>();
            boolean firstLine = true;
            String line;
            while((line = reader.readLine()) != null){
                if (firstLine){
                    firstLine = false;
                    continue;
                }
                String[] fields = line.split(SEPARATOR);
                Student s = new Student();
                s.setId(fields[0]);
                s.setName(fields[1]);
                s.setSurname(fields[2]);
                s.setGender(fields[3].charAt(0));
                s.setBirthday(dateFormat.parse(fields[4]));
                s.setFieldOfStudy(FieldOfStudy.valueOf(fields[5]));
                s.setDateOfStart(dateFormat.parse(fields[6]));
                s.setGraduated(Boolean.parseBoolean(fields[7]));
                s.setDateOfGraduation(dateFormat.parse(fields[8]));
                s.setGpa(Float.parseFloat(fields[9]));
                students.add(s);
            }
            reader.close();
            return students;
        }catch (IOException e){
            System.out.println("Error while reading Students");
            e.printStackTrace();
        }catch (ParseException pe){
            System.out.println("Cannot parse date");
            pe.printStackTrace();
        }
        return new ArrayList<>();
    }

    private String getHeader(){
        return
                "ID" + SEPARATOR +
                "Name" + SEPARATOR +
                "Surname" + SEPARATOR +
                "Gender" + SEPARATOR +
                "Birthday" + SEPARATOR +
                "FieldOfStudy" + SEPARATOR +
                "StartDate" + SEPARATOR +
                "Graduated" + SEPARATOR +
                "GraduationDate" + SEPARATOR +
                "GPA"
                ;
    }


}
