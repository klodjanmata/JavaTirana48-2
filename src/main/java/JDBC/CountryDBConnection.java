package JDBC;

import JavaFundamentalsCoding.Helper;
import java.sql.*;

public class CountryDBConnection {
    public static void main(String[] args) {
       try {
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world",
                                                        "root", "root");
           System.out.println("Input the 3 letter code of the country: ");
           String countryCode = Helper.getStringFromUser();
           System.out.println("Capital of " + getCountryName(connection, countryCode) + " is: "
                                            + getCapitalOfCountry(connection, countryCode));
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    public static String getCountryName(Connection connection, String countryCode)
            throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT name FROM country WHERE Code = ?");
        preparedStatement.setString(1, countryCode);
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();
        return rs.getString("name");
    }

    public static String getCapitalOfCountry(Connection connection, String countryCode)
            throws SQLException {
        CallableStatement cs = connection.prepareCall("{call GetCountryCapital(?)}");
        cs.setString(1, countryCode);
        ResultSet rs = cs.executeQuery();
        rs.next();
        return rs.getString(1);
    }
}
