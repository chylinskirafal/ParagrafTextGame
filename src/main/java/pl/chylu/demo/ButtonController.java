package pl.chylu.demo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ButtonController {
    public ButtonController() {
        System.out.println("przyciski dzialaja");
    }

    @FXML
    Button firstAdventureButton;

    @FXML
    private void firstPlot(ActionEvent event) {
        System.out.println("Pierwsza przygoda");
    }

    @FXML
    Button secondAdventureButton;

    @FXML
    private void secondPlot() {

        dialogNotExitPlot();

    }

    @FXML
    Button treeAdventureButton;

    @FXML
    private void treePlot(ActionEvent event) {
        dialogNotExitPlot();
    }

    @FXML
    Button exitButton;

    @FXML
    private void closeOnExitButton(ActionEvent event) {
        System.exit(0);
    }

    private void dialogNotExitPlot() {
        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initOwner(ParagrafApplication.primaryStage);

        Text txt = new Text("Ta historia jest\njeszcze nie gotowa\n");
        txt.setStyle("-fx-font-weight: bold");

        Button closeButoon = new Button("Rozumiem");
        closeButoon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dialog.close();
            }
        });
        VBox dialogVbox = new VBox(txt, closeButoon);
        dialogVbox.setAlignment(Pos.CENTER);


        Scene dialogScene = new Scene(dialogVbox, 200, 100);
        dialog.setScene(dialogScene);
        dialog.setResizable(false);
        dialog.show();
    }
}
