package database.config;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SetupDataUsingStatement {

    public void createTable() {
        String createTableSql = """
                CREATE TABLE IF NOT EXISTS person (
                    id int PRIMARY KEY AUTO_INCREMENT,
                    name varchar(40),
                    age double
                )
                """;

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement statement = connection.createStatement();
            statement.execute(createTableSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addPerson() {
        String insertPersonSql = "INSERT INTO person (name, age) VALUES ('Irina', 23)";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement statement = connection.createStatement();
            statement.execute(insertPersonSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getAllPersons() {
        String selectSql = "SELECT * FROM person";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectSql);

            while (resultSet.next()) {
                System.out.println("Id: " + resultSet.getInt(1));
                System.out.println("Name: " + resultSet.getString(2));
                System.out.println("Age: " + resultSet.getDouble(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
