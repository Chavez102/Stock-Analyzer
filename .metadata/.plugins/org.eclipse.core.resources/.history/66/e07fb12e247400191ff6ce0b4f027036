package controllers;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Search_Result_Page_Controller implements Initializable{

    @FXML
    private Text Date_text;
    @FXML
    private Text OpenAnswer_Text;
    @FXML
    private Text HighAnswer_Text;
    @FXML
    private Text LowAnswer_text;
    @FXML
    private Text VolumeAnswer_Text;
    @FXML
    private Text CloseAnswer_Text;
    @FXML
    private Button back_btn;
    @FXML
    private Button TO_Menu_btn;
    
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String datestr=Search_Page_Controller.DateString;
//			System.out.println("Date:"+datestr);
//			System.out.println(application.Main.map.get(datestr).getWeekDay());
//			System.out.println("Open:"+application.Main.map.get(datestr).getOpen());
			
			Date_text.setText(application.Main.map.get(datestr).getDate());
			
			
			OpenAnswer_Text.setText(""+application.Main.map.get(datestr).getOpen());
			
			
			HighAnswer_Text.setText(""+application.Main.map.get(datestr).getHigh());
			LowAnswer_text.setText(""+application.Main.map.get(datestr).getLow());
			VolumeAnswer_Text.setText(""+application.Main.map.get(datestr).getVolume());
			CloseAnswer_Text.setText(""+application.Main.map.get(datestr).getClose());
		
	}
    

	
	
	
	
	
	
	
	
	
	
	
    
    @FXML
    void To_Menu_btn_Clicked(ActionEvent event) 
    {
    	Main.SwitchPageto(event, "Menu_Page.fxml");
    	
    }

    @FXML
    void back_btn_Clicked(ActionEvent event) {
    	Main.SwitchPageto(event, "Search_Page.fxml");
    }


}
