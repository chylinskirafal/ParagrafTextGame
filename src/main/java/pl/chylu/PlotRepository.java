package pl.chylu;

import java.sql.*;

public class PlotRepository {


    void readDatabaseData() {
        String SQL_SELECT = "SELECT * FROM plot";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/rpg", "root", "");
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                int idplot = resultSet.getInt("idplot");
                String text = resultSet.getString("plottxt");
                int choisee = resultSet.getInt("choisee");
                String choiseetxt = resultSet.getString("choiseetxt");
            }
            System.out.println("baza dziala");
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
