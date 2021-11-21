package baseline;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeScreen implements Initializable {



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void handleButtonAction(MouseEvent mouseEvent) throws IOException {
        Parent inventoryScreenParent = FXMLLoader.load(getClass().getResource("InventoryScreen.fxml"));
        Scene inventoryScreenScene = new Scene(inventoryScreenParent);
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        stage.setScene(inventoryScreenScene);
        stage.show();
    }
}
