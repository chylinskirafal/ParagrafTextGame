package pl.chylu.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.chylu.util.SystemUtil;

import java.io.IOException;

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
        launch();
    }
}