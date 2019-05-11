package controllers;
import controllers.*;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

public class Main_Page_Controller{

	    @FXML
	    private Button Amazon_btn;

	    @FXML
	    private Button Tesla_btn;

	    @FXML
	    void Tesla_btn_Clicked(ActionEvent event) throws IOException {
	    	application.Main.Stock_name="Tesla";
	    	application.Main.Stock_symbol="TSLA";
	    	
	    	
	    	
	    	application.Main.Stock_Went_Public=application.Main.SetDate("2010-06-29",application.Main.Stock_Went_Public);		//sets when tsla went public
	    	
	      	 application.Main.map= Data_Management.Main_Data_Management.getBagFor(application.Main.Stock_symbol);
	      	 
	      	 
	    	
	    	Main.SwitchPageto(event,"Menu_Page.fxml");
	    }

	    
	    
	    @FXML
	    void amazon_btn_Clicked(ActionEvent event) {
	    	
	    	application.Main.Stock_name="Amazon";
	    	application.Main.Stock_symbol="AMZN";
	    	application.Main.Stock_Went_Public=application.Main.SetDate("1997-05-15",application.Main.Stock_Went_Public);		//sets when amazon went public
	    	

	      	 application.Main.map= Data_Management.Main_Data_Management.getBagFor(application.Main.Stock_symbol);
	      	 
	    	
	    	Main.SwitchPageto(event,"Menu_Page.fxml");
	    }
	    
	    
	    

	    

	    
	    
	    
		
}
