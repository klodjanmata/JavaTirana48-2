package JDBC.Exercise2;

import JDBC.Exercise1.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAO implements GeneralDAO<Author> {

    @Override
    public void createTable() {
        try(Connection connection = DBConnection.getConnection()){
            String createTableSql = "CREATE TABLE IF NOT EXISTS AUTHOR (" +
                    "id INTEGER AUTO_INCREMENT, " +
                    "title VARCHAR(255), " +
                    "genre VARCHAR(255), " +
                    "yearOfRelease INTEGER, " +
                    "PRIMARY KEY (id))";
            PreparedStatement ps = connection.prepareStatement(createTableSql);
            ps.execute();
            System.out.println("Author table is created ");

        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteTable() {
        try(Connection connection = DBConnection.getConnection()){
            String dropTableSQL = "DROP TABLE IF EXISTS author";
            PreparedStatement ps = connection.prepareStatement(dropTableSQL);
            ps.execute();
            System.out.println("Author table is deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void create(Author Author) {
        try(Connection connection = DBConnection.getConnection()){
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO AUTHOR (id, Name,Surname, DateOfBirth) VALUES (?, ?, ?, ?)");
            ps.setInt(1,Author.getId());
            ps.setString(2, Author.getName());
            ps.setString(3, Author.getSurname());
            ps.setInt(4, Author.getDateOfBirth());
            ps.execute();
            System.out.println("Author is created.");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {
        try(Connection connection = DBConnection.getConnection()){
            PreparedStatement ps = connection.prepareStatement(
                    "DELETE FROM AUTHOR WHERE id = ?"
            );
            ps.setInt(1, id);
            ps.execute();
            System.out.println("Author with id " + id + " is deleted");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override

    public void update(Author author) {
        try(Connection connection = DBConnection.getConnection()){
            PreparedStatement ps = connection.prepareStatement("" +
                    "UPDATE author set Name=?, Surname=?, DateOfBirth=? WHERE id=?;");
            ps.setString(1, author.getName());
            ps.setString(2, author.getSurname());
            ps.setInt(3, author.getDateOfBirth());
            ps.setInt(4, author.getId());
            ps.execute();
            System.out.println("Author is updated.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    @Override
    public Author findById(int id) {
        try (Connection connection = DBConnection.getConnection()){
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM author WHERE id = ?"
            );
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Author Author = null;
            while (rs.next()) {
                Author = new Author();
                Author.setId(rs.getInt("id"));
                Author.setName(rs.getString("title"));
                Author.setSurname(rs.getString("genre"));
                Author.setDateOfBirth(rs.getInt("yearOfRelease"));
                return Author;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Author> findAll() {
        try(Connection connection = DBConnection.getConnection()){
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM AUTHOR"
            );
            ResultSet rs = ps.executeQuery();
            List<Author> authors = new ArrayList<>();
            while(rs.next()){
                Author a = new Author();
                a.setId(rs.getInt("id"));
                a.setName(rs.getString("title"));
                a.setSurname(rs.getString("genre"));
                a.setDateOfBirth(rs.getInt("yearOfRelease"));
                authors.add(a);
            }
            return authors;
        }catch (Exception e){
            e.printStackTrace();}
        return null;
    }
}