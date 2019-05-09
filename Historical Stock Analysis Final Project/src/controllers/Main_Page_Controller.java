package controllers;
import controllers.*;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main_Page_Controller {

	    @FXML
	    private Button Amazon_btn;

	    @FXML
	    private Button Tesla_btn;

	    @FXML
	    void Tesla_btn_Clicked(ActionEvent event) throws IOException {
	    	application.Main.Stock_name="Tesla";
	    	
	    	Main.SwitchPageto(event,"Menu_Page.fxml");
	    }

	    
	    
	    @FXML
	    void amazon_btn_Clicked(ActionEvent event) {
	    	
	    	application.Main.Stock_name="Amazon";
	    	
	    	Main.SwitchPageto(event,"Menu_Page.fxml");
	    }
	    
	    
//		public static void SwitchPageto(ActionEvent event,String fxmldocument) {
//			try {
//			Parent root = FXMLLoader.load(application.Main.class.getResource("Menu_Page.fxml")); 
//			Scene scene = new Scene(root,841,698);
//			Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
//			window.setScene(scene);
//			window.show();
//			
//			
//			
//			}catch(Exception e) { e.printStackTrace();}
//		}
		
}
