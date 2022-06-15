package pl.chylu.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BeginGameController {
    @FXML
    private Label beginText;

    @FXML
    protected void beginGameButton() {
        beginText.setText("Zatem zacznijmy grę mój mały poszukiwaczu przygód!");
    }
}