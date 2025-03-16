package JavaAdvanced.Exercises.FileIO.Task5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FILENAME = "Files\\User.csv";

    public static void main(String[] args) {
        List<User> users = readUsersFromFile();
        for (User u : users) {
           System.out.println(u.getName() + " " + u.getSurname() + " " + u.getAge());
        }
    }

    public static List<User> readUsersFromFile(){
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))){
            String line;
            while((line = reader.readLine()) != null){
                String[] info = line.split(",");
                User u = new User();
                u.setName(info[0]);
                u.setSurname(info[1]);
                u.setAge(Integer.parseInt(info[2]));
                users.add(u);
            }
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return users;
    }
}
