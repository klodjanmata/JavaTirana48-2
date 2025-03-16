package University.FilesIO;

import University.Entity.Department;
import University.Entity.Lecturer;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class LecturerCSVUtil {
    private static final String FILENAME = "UniversityFiles\\Lecturers.csv";
    private static final String SEPARATOR = ",";
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public void writeToFile(List<Lecturer> lecturerList){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))){
            bw.write(getHeader());
            for(Lecturer lecturer : lecturerList){
                bw.newLine();
                bw.write(lecturer.getId() + SEPARATOR);
                bw.write(lecturer.getName() + SEPARATOR);
                bw.write(lecturer.getSurname() + SEPARATOR);
                bw.write(lecturer.getDepartment() + SEPARATOR);
                bw.write(dateFormat.format(lecturer.getStartDate()) + SEPARATOR);
                bw.write(lecturer.getEmail() + SEPARATOR);
                bw.write(lecturer.getPhoneNumber() + SEPARATOR);
                bw.write(lecturer.getGender() + SEPARATOR);
                bw.write(dateFormat.format(lecturer.getBirthday()));
                //bw.write(lecturer.getSubjectList());
            }
            bw.close();
        }catch (IOException e){
            System.out.println("Error while writing Lecturers to file");
            e.printStackTrace();
        }
    }

    public List<Lecturer> readFromFile(){
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))){
            List<Lecturer> lecturerList = new ArrayList<>();
            boolean firstLine = true;
            String line;
            while( (line = br.readLine()) != null){
                if (firstLine){
                    firstLine = false;
                    continue;
                }
                String[] data = line.split(SEPARATOR);
                Lecturer l = new Lecturer();
                l.setId(data[0]);
                l.setName(data[1]);
                l.setSurname(data[2]);
                l.setDepartment(Department.valueOf(data[3]));
                l.setStartDate(dateFormat.parse(data[4]));
                l.setEmail(data[5]);
                l.setPhoneNumber(data[6]);
                l.setGender(data[7].charAt(0));
                l.setBirthday(dateFormat.parse(data[8]));
                //SUBJECT LIST
                lecturerList.add(l);
            }
            br.close();
            return lecturerList;
        }catch (IOException e){
            System.out.println("Error while reading Lecturers from file");
            e.printStackTrace();
        }catch (ParseException pe){
            System.out.println("Error while parsing the date");
            pe.printStackTrace();
        }

        return null;
    }

    public HashMap<String, Lecturer> readAndReturnMap(){
        return convertListToMap(readFromFile());
    }

    public void writeMapToFile(HashMap<String, Lecturer> lecturerMap){
        writeToFile(converMapToList(lecturerMap));
    }

    public List<Lecturer> converMapToList(HashMap<String, Lecturer> map){
        List<Lecturer> list = new ArrayList<>();
        list.addAll(map.values());
        return list;
    }

    public HashMap<String, Lecturer> convertListToMap(List<Lecturer> list){
        HashMap<String, Lecturer> map = new HashMap<>();
        map = (HashMap<String, Lecturer>) list.stream()
                .collect(Collectors.toMap(Lecturer::getId, lecturer -> lecturer));
        return map;
    }

    private String getHeader(){
        return  "ID" + SEPARATOR +
                "NAME" + SEPARATOR +
                "SURNAME" + SEPARATOR +
                "DEPARTMENT" + SEPARATOR +
                "START DATE" + SEPARATOR +
                "EMAIL" + SEPARATOR +
                "PHONE NUMBER" + SEPARATOR +
                "GENDER" + SEPARATOR +
                "BIRTHDAY" + SEPARATOR +
                "SUBJECT LIST";
    }
}
