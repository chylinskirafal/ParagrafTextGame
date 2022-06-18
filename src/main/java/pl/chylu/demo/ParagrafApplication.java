package pl.chylu.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.chylu.demo.util.SystemUtil;

import java.io.IOException;

public class ParagrafApplication extends Application {
    public static Stage primaryStage;
    public static Scene scene, scene2;
    @Override
    public void start(Stage stage) throws IOException {
        SystemUtil su = new SystemUtil();
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("main-view.fxml"));
        FXMLLoader fxmlLoaderPlot = new FXMLLoader(this.getClass().getResource("plot-view.fxml"));
        
        scene = new Scene(fxmlLoader.load());
        scene2 = new Scene(fxmlLoaderPlot.load());

        primaryStage = stage;
        primaryStage.setTitle(su.getTitle());
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        ObjectPool.getPlotService().readData();
        launch();
    }
}