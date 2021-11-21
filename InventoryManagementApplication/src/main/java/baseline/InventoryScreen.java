package baseline;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class InventoryScreen {
AddInventory add = new AddInventory();

    @FXML
    void addItemButton(MouseEvent mouseEvent) throws IOException {
        Parent inventoryScreenParent = FXMLLoader.load(getClass().getResource("EntryScreen.fxml"));
        Scene inventoryScreenScene = new Scene(inventoryScreenParent);
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        stage.setScene(inventoryScreenScene);
        stage.show();
    }

    @FXML
    void clearInventoryButton(MouseEvent event) {

    }

    @FXML
    void removeItemButton(MouseEvent mouseEvent) throws IOException {
        Parent inventoryScreenParent = FXMLLoader.load(getClass().getResource("EntryScreen.fxml"));
        Scene inventoryScreenScene = new Scene(inventoryScreenParent);
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        stage.setScene(inventoryScreenScene);
        stage.show();

    }

}
