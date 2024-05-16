package database;

import collections.models.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseMain {
    static final String DB_URL = "jdbc:mysql://localhost:3306/pao";
    static final String USER = "root";
    static final String PASS = "root";


    public static void main(String[] args) {

        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement() ){
            String query = "Select * from students";

            ResultSet rs = stmt.executeQuery(query);
            List<Student> students = new ArrayList<>();
            // Execute a query
            while(rs.next()){
                Integer id = rs.getInt("id");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                Integer year = rs.getInt("year");
                String college = rs.getString("college");

                students.add(new Student(id, firstName, lastName, year, college));
            }

            System.out.println("Statement");
            System.out.println(students);

            PreparedStatement preparedStatement = conn.prepareStatement("select * from students where year = ? and college = ?");
            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2, "Universitate");
            ResultSet resultSet2 = preparedStatement.executeQuery();

            List<Student> students2 = new ArrayList<>();
            while(resultSet2.next()){
                Integer id = resultSet2.getInt("id");
                String firstName = resultSet2.getString("firstName");
                String lastName = resultSet2.getString("lastName");
                Integer year = resultSet2.getInt("year");
                String college = resultSet2.getString("college");

                students2.add(new Student(id, firstName, lastName, year, college));
            }
            System.out.println("PreparedStatement");
            System.out.println(students2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
