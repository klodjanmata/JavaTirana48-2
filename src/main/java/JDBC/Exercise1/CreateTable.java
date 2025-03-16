package JDBC.Exercise1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateTable {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();
//            createTable(conn);
//            add(conn);
//            update(conn);
//            delete(conn, 2);
//            displayTableRecords(conn);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void displayTableRecords(Connection connection) throws SQLException {
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM Movies");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("ID") + " " +
                                    rs.getString("Title") + " " +
                                    rs.getString("Genre") + " " +
                                    rs.getString("YearOfRelease"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void delete(Connection connection, int id) {
        try {
            PreparedStatement deleteItemStatement = connection.prepareStatement(
                    "DELETE FROM MOVIES WHERE id = ?");
            deleteItemStatement.setInt(1, id);
            deleteItemStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("ITEM DELETED SUCCESSFULLY!");
    }

    public static void update(Connection connection) {
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "UPDATE MOVIES SET genre = ? WHERE id = ?");
            ps.setString(1, "Action, Crime");
            ps.setInt(2, 4);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void add(Connection connection) throws SQLException {
        String Inception = "INSERT INTO MOVIES (id, title, genre, yearOfRelease) VALUES (1, 'Inception', 'Sci-Fi, Thriller' ,'2010')";
        String Parasite = "INSERT INTO MOVIES (id, title, genre, yearOfRelease) VALUES (2, 'Parasite', ' Drama, Thriller', 2019)";
        String Interstellar = "INSERT INTO MOVIES (id, title, genre, yearOfRelease) VALUES (3, 'Interstellar', 'Sci-Fi, Adventure, Drama', 2014)";
        String DarkKnight = "INSERT INTO MOVIES VALUES(4, 'The Dark Knight', 'Action, Crime, Drama', 2008)";

        PreparedStatement ps  = connection.prepareStatement(Inception);
        ps.executeUpdate();
        ps  = connection.prepareStatement(Parasite);
        ps.executeUpdate();
        ps  = connection.prepareStatement(Interstellar);
        ps.executeUpdate();
        ps  = connection.prepareStatement(DarkKnight);
        ps.executeUpdate();
    }

    public static void createTable(Connection conn){
        try {
            PreparedStatement ps = conn.prepareStatement("DROP Table if exists Movies;");
            ps.execute();
            ps.close();
            ps = conn.prepareStatement(
                    "CREATE TABLE MOVIES(" +
                            "id INTEGER AUTO_INCREMENT, " +
                            "title VARCHAR(255), " +
                            "genre VARCHAR(255), " +
                            "yearOfRelease INTEGER, " +
                            "PRIMARY KEY (id))");
            ps.execute();
            ps.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
