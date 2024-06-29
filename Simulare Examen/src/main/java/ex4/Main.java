package ex4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Angajat> angajati = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        Double s = sc.nextDouble();
        Integer v = sc.nextInt();

        String sqlQuery = "SELECT * FROM DateAngajati WHERE varsta <= ? AND salariu >= ?";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement ps = connection.prepareStatement(sqlQuery);
            ps.setInt(1, v);
            ps.setDouble(2, s);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String cnp = rs.getString("cnp");
                String nume = rs.getString("nume");
                Integer varsta = rs.getInt("varsta");
                Double salariu = rs.getDouble("salariu");

                angajati.add(new Angajat(cnp, nume, varsta, salariu));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        angajati.stream()
                .forEach(System.out::println);
    }
}
