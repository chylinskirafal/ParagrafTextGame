package pl.chylu.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.chylu.util.SystemUtil;

import java.io.IOException;
import java.sql.*;

public class PragrafApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        SystemUtil su = new SystemUtil();
        FXMLLoader fxmlLoader = new FXMLLoader(PragrafApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 520);
        stage.setTitle(su.getTitle());
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
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
            }
            System.out.println("baza dziala");
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        launch();
    }
}