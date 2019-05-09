package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Menu_Page_Controller implements Initializable{
	
	@FXML
	private Text Title_text;
    @FXML
    private Button Search_btn;

    @FXML
    private Button Add_New_Stock_btn;

    @FXML
    private Button Range_btn;

    @FXML
    private Button Graphing_btn;

    @FXML
    private Button back_btn;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

   	 Title_text.setText("What would you like to do with "+application.Main.Stock_name+"'s Stock");

	}
    
    
    
    @FXML
    void Search_btn_Clicked(ActionEvent event) {


    }
    
    @FXML
    void Add_New_Stock_btn_Clicked(ActionEvent event) {

    }

    @FXML
    void Graphing_btn_Clicked(ActionEvent event) {

    }

    @FXML
    void Range_btn_Clicked(ActionEvent event) {

    }

 

    @FXML
    void back_btn_Clicked(ActionEvent event) {
    	System.out.println("hello");
    	Main.SwitchPageto(event,"Main_Page.fxml");
    }
    



    
    

}
