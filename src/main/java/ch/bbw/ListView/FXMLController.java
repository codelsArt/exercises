package ch.bbw.ListView;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;

public class FXMLController implements Initializable {
    
	@FXML
	ListView<String> liMyList;
	
	ObservableList<String> myListModel;
	
    @FXML
    private void handleButtonAction(ActionEvent event) {

        TextInputDialog dialog = new TextInputDialog("walter");
        dialog.setTitle("Text Input Dialog");
        dialog.setHeaderText("Look, a Text Input Dialog");
        dialog.setContentText("Please enter your name:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(name -> myListModel.add(name));
    }
    
    @FXML
    private void handleButtonDisplay(ActionEvent event) {

        myListModel.add("Blubber Blubber"); 
    }
    
    @FXML
    private void handleButtonRemove(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	myListModel = FXCollections.observableArrayList();
    	liMyList.setItems(myListModel);
    	
    	myListModel.add("Peter Muster");
    }    
}
