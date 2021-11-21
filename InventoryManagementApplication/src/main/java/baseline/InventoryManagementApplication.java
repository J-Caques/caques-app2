package baseline;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class InventoryManagementApplication extends Application {

   /* public static void main(String[] args) {
        RemoveInventory remove = new RemoveInventory();
        AddInventory addItems = new AddInventory();
        Inventory main = new Inventory();
        ClearInventory erase = new ClearInventory();



        List<ItemEntry> mainInventory = new ArrayList<>();
        for(int i = 0; i<1;i++) {
            mainInventory = addItems.addItem();
            main.inventory = mainInventory;
            JSON json = new JSON();

            json.convertToJSON(mainInventory);
        }
        JSON json = new JSON();

        json.convertToJSON(mainInventory);
        System.out.println(main.inventory.toString());


    }*/

    @Override
    public void start(Stage stage) throws Exception {
        Parent root =
                FXMLLoader.load(getClass().getResource("HomeScreen.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Inventory Management");
        stage.setScene(scene);
        stage.show();
    }
}
