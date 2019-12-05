package ListView2;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController3 implements Initializable {
    
	ObservableList<Product> monitorModel;
	ObservableList<Product> laptopModel;
	ObservableList<String> selectionModel;
	HashMap<String, ObservableList<Product>> categories = new HashMap();

	
	@FXML
	ListView<Product> productList;
	@FXML
	ComboBox<String> dropDownSelection;
	@FXML
	TextField purchasePrice,sellingPrice;
	@FXML
	TextArea description;
	
	
	public FXMLController3() {
		categories.put("LCD", monitorModel);
		categories.put("Laptops", laptopModel);
	}
	
	@FXML
	public void changeSelection() {
		productList.setItems( categories.get(dropDownSelection.getValue()));
	}
	
	@FXML
	public void detectSelectedItem() {
		if(productList.getSelectionModel().getSelectedIndex() != -1) {
			displayValues(productList.getSelectionModel().getSelectedItem());
		}
	}

	public void displayValues(Product selectedObject) {
		purchasePrice.setText(String.valueOf(selectedObject.getPurchasePrice()));
		sellingPrice.setText(String.valueOf(selectedObject.getSellingPrice()));
		description.setText(selectedObject.getDescription());
	}
	
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	
    	selectionModel = FXCollections.observableArrayList();
    	laptopModel = FXCollections.observableArrayList();
    	monitorModel = FXCollections.observableArrayList();
    	
    	dropDownSelection.setItems(selectionModel);
    	
//		for (Map.Entry<String, ObservableList<Product>> entry : categories.entrySet()) {
//		    selectionModel.add(entry.getKey());
//		}

    	categories.keySet().forEach(selectionModel::add);
    	
    	/*_________________Displays__________________________________________________*/
    	monitorModel.add(
    		new Product(
    			"Acer AL2023WA 20'' 1680x1050 wide", 
    			398.00, 359.00,
    			"LCD, 1680x1050,wide, 16:10, 5ms, VGA, DVI, 2500:1, 300cd, Pivot, höhenverstellbar"));
    	
    	monitorModel.add(
    		new Product(
    			"ASUS VW202S 20.1'' 1680x1050 wide",
    			398.00,
    			359.00,
    			"LCD, 1680x1050, 5ms, VGA, 2000:1, 300cd/m2, Lautsprecher"));
    	
    	monitorModel.add(
    		new Product(
    			"Belinea o.display 1.1 20'' 1680x1050 wide",
    			469.00,
    			419.00,
    			"LCD, 1680x1050, 5ms, VGA, 1100:1, 300cd/m2, Audio"));
    	
    	monitorModel.add(
    		new Product(
    			"EIZO S2000 20.1'' 1600x1200px",
    			598.00,
    			449.00,
    			"LCD, BL. 1600x1200px, 8ms, DVI-I, 1000:1, 300cd/m2"));
    	
    	/*_________________Laptops__________________________________________________*/
    	
    	laptopModel.add(
    		new Product(
    			"Acer TravelMate 7520",
    			998.00,945.00,
    			"Intel T7300, 4GB, 256GB, 13'' CB WXGA+, DVD-SM"));
    	
    	laptopModel.add(
        		new Product(
        			"Toshiba Satellite P200-1E3\r\n",
        			1190.00,999.00,
        			"Intel T5250, 8GB, 256GB, 15'' TB WXGA+, DVD-SM"));
    	
    	laptopModel.add(
        		new Product(
        			"ASUS G2S-7T131C",
        			998.00,880.00,
        			"Intel T7700, 4GB, 256GB, 15''(1920x1200), DVD-SML, Vista"));
    	
    	laptopModel.add(
        		new Product(
        			"Sony Vaio VGN-AR61M",
        			1490.00,1398.00,
        			"T7500, 8GB, 512GB, 17''XB (1440x900), BluRay-ROM"));
    }    
}

