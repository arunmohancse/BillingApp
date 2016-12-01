/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingapp.controller;

import billingapp.model.Item;
import billingapp.utility.TabContent;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.AutoCompletionBinding;
import org.controlsfx.control.textfield.TextFields;

/**
 * FXML Controller class
 *
 * @author arun
 */
public class InvoiceController implements TabContent {

    private Stage mainWindow;
    private TabPane tabPane;
    
    @FXML
    private TextField tfItem;
    
    private List<Item> items = null;
    private AutoCompletionBinding<Item> itemCompletion = null;
    
    @FXML
    private void onInvoiceItemAddAction(ActionEvent event) {
        
    }
    @FXML
    private void onCustomersRefreshAction(ActionEvent event) {
        
    }
    @FXML
    private void onItemsRefreshAction(ActionEvent event) {
        
    }
    @FXML
    private void onUnitsRefreshAction(ActionEvent event) {
        
    }
    @FXML
    private void onInvoiceItemDeleteAction(ActionEvent event) {
        
    }
    @FXML
    private void onSaveInvoiceAction(ActionEvent event) {
        
    }   
    @FXML
    private void onCloseTabAction(ActionEvent event) {
        
    }
    
    /**
     * Initializes the controller class.
     */
    public void initialize() {
        // TODO
    } 
    
    @Override
    public boolean shouldClose() {
        return true;
    }

    @Override
    public void putFocusOnNode() {
    }

    @Override
    public boolean loadData() {
        return loadItems();
    }

    @Override
    public void setMainWindow(Stage stage) {
        this.mainWindow = stage;
    }

    @Override
    public void setTabPane(TabPane tabPane) {
        this.tabPane = tabPane;
    }
    
    private boolean loadItems() {

        try {
            items = getItems();
        } catch (Exception e) {
            /*String message = Utility.getDataFetchErrorText();
            Alert alert = Utility.getErrorAlert("Error Occurred",
                    "Error in Fetching Items", message, mainWindow);
            Utility.beep();
            alert.showAndWait();*/
            return false;
        }

        if (itemCompletion != null) {
            itemCompletion.dispose();
        }
        
        itemCompletion = TextFields.<Item>bindAutoCompletion(tfItem, items);
        return true;

    }
       
    private List<Item> getItems(){
        List<Item> itemsLocal = new ArrayList<>();
        {
            Item item = new Item();
            item.setItemId(1);
            item.setItemName("Ganapathi pooja");
            itemsLocal.add(item);
        }
        {
            Item item = new Item();
            item.setItemId(2);
            item.setItemName("Payasam");
            itemsLocal.add(item);
        }
        {
            Item item = new Item();
            item.setItemId(2);
            item.setItemName("Archana");
            itemsLocal.add(item);
        }
        
        return itemsLocal;
    }   


    
}
