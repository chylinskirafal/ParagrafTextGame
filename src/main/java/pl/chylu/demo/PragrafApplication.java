package pl.chylu.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.chylu.util.SystemUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

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
        Connection connection;
        PreparedStatement insert;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connection = DriverManager.getConnection("localhost/id19106386_webtest","Chylu","testPassword123!");
            System.out.println("baza dziala");
        } catch (ClassNotFoundException ex) {
            System.out.println("cos poszlo zle");
        } /*catch (SQLException ex) {
            System.out.println("cos poszlo zle 2");
        }*/
        launch();
    }
}