package JDBC.Exercise2;

import JDBC.Exercise1.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MovieDAO implements GeneralDAO<Movie> {

    @Override
    public void createTable() {
        try(Connection connection = DBConnection.getConnection()){
            String createTableSql = "CREATE TABLE IF NOT EXISTS MOVIES (" +
                    "id INTEGER AUTO_INCREMENT, " +
                    "title VARCHAR(255), " +
                    "genre VARCHAR(255), " +
                    "yearOfRelease INTEGER, " +
                    "PRIMARY KEY (id))";
            PreparedStatement ps = connection.prepareStatement(createTableSql);
            ps.execute();
            System.out.println("Movie table is created ");

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteTable() {
        try(Connection connection = DBConnection.getConnection()){
            String dropTableSQL = "DROP TABLE IF EXISTS movies";
            PreparedStatement ps = connection.prepareStatement(dropTableSQL);
            ps.execute();
            System.out.println("Movie table is deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void create(Movie movie) {
        try(Connection connection = DBConnection.getConnection()){
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO MOVIES (id, title, genre, yearOfRelease) VALUES (?, ?, ?, ?)");
            ps.setInt(1,movie.getId());
            ps.setString(2, movie.getTitle());
            ps.setString(3, movie.getGenre());
            ps.setInt(4, movie.getYearOfRelease());
            ps.execute();
            System.out.println("Movie is created.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try(Connection connection = DBConnection.getConnection()){
            PreparedStatement ps = connection.prepareStatement(
                    "DELETE FROM MOVIES WHERE id = ?"
            );
            ps.setInt(1, id);
            ps.execute();
            System.out.println("Movie with id " + id + " is deleted");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Movie movie) {
        try(Connection connection = DBConnection.getConnection()){
            PreparedStatement ps = connection.prepareStatement("" +
                    "UPDATE movies set Title=?, Genre=?, yearOfRelease=? WHERE id=?;");
            ps.setString(1, movie.getTitle());
            ps.setString(2, movie.getGenre());
            ps.setInt(3, movie.getYearOfRelease());
            ps.setInt(4, movie.getId());
            ps.execute();
            System.out.println("Movie is updated.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Movie findById(int id) {
        try (Connection connection = DBConnection.getConnection()){
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM movies WHERE id = ?"
            );
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Movie movie = null;
            while (rs.next()) {
                movie = new Movie();
                movie.setId(rs.getInt("id"));
                movie.setTitle(rs.getString("title"));
                movie.setGenre(rs.getString("genre"));
                movie.setYearOfRelease(rs.getInt("yearOfRelease"));
                return movie;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Movie> findAll() {
        try(Connection connection = DBConnection.getConnection()){
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM MOVIES"
            );
            ResultSet rs = ps.executeQuery();
            List<Movie> movies = new ArrayList<>();
            while(rs.next()){
                Movie m = new Movie();
                m.setId(rs.getInt("id"));
                m.setTitle(rs.getString("title"));
                m.setGenre(rs.getString("genre"));
                m.setYearOfRelease(rs.getInt("yearOfRelease"));
                movies.add(m);
            }
            return movies;
        }catch (Exception e){
        e.printStackTrace();}
        return null;
    }
}
