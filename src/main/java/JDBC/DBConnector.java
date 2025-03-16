package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBConnector {
    public static void main(String[] args) {
        List<Author> dbAuthors = new ArrayList<>();

        try (Connection conn  =
         DriverManager.getConnection("jdbc:mysql://localhost:3306/javatirana48",
                                    "root", "root")
        ){
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM author");
            while (rs.next()){
                Author a = new Author();
                a.setId(rs.getInt("id"));
                a.setName(rs.getString("Name"));
                a.setLastname(rs.getString("Surname"));
                a.setDateOfBirth(rs.getDate("DateOfBirth"));
                dbAuthors.add(a);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("ID\tName\tLastname\tDateOfBirth");
        for (Author a : dbAuthors){
            System.out.println(a);
        }
    }
}
