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

public class FXMLController2 implements Initializable {
    
	@FXML
	ListView<String> leftList;
	@FXML
	ListView<String> rightList;
	@FXML
	ListView<String> tmpList;
	
	ObservableList<String> rightModel;
	ObservableList<String> leftModel;
	String tmp;
	
    @FXML
    private void handleButtonAction(ActionEvent event) {

        TextInputDialog dialog = new TextInputDialog("walter");
        dialog.setTitle("Text Input Dialog");
        dialog.setHeaderText("Look, a Text Input Dialog");
        dialog.setContentText("Please enter your name:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(name -> leftModel.add(name));
    }
    
    @FXML
    private void handleLeftToRight(ActionEvent event) {
    	tmp = leftList.getSelectionModel().getSelectedItem();
    	leftModel.remove(tmp);
    	rightModel.add(tmp);
    
    }
    @FXML
    private void handleRightToLeft(ActionEvent event) {
    	tmp = rightList.getSelectionModel().getSelectedItem();
    	rightModel.remove(tmp);
    	leftModel.add(tmp);
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	rightModel = FXCollections.observableArrayList();
    	rightList.setItems(rightModel);
    	rightModel.add("Peter Muster");
    	
    	leftModel = FXCollections.observableArrayList();
    	leftList.setItems(leftModel);
    	
    	leftModel.add("Peter Muster");
    }    
}
