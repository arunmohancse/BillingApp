/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingapp.controller;

import billingapp.utility.TabContent;
import java.time.LocalDate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

/**
 *
 * @author John
 */
public class ExpenseController  implements TabContent{

    private Stage mainWindow;
    private TabPane tabPane;
    
//    @FXML
//    private DatePicker expenseDate;
//    
//    @FXML
//    private Button ButtonClose;
//    
//    @FXML
//    private void mouseClickEvent(ActionEvent event) {
//        clearDateFiled();
//    }
    
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
        return true;
    }

    @Override
    public void setMainWindow(Stage stage) {
        this.mainWindow = stage;
    }

    @Override
    public void setTabPane(TabPane tabPane) {
        this.tabPane = tabPane;
    }

}
