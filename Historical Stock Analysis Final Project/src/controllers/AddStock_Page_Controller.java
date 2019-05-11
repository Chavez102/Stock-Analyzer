package controllers;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AddStock_Page_Controller implements Initializable {


  
    @FXML
    private DatePicker Date_DatePicker;
    @FXML
    private TextField OpenPrice_Textfield;
    @FXML
    private TextField HighPrice_Textfield;
    @FXML
    private TextField LowPrice_Textfield;
    @FXML
    private TextField Volume_Textfield;
    @FXML
    private TextField ClosePrice_Textfield;
    @FXML
    private Button Back_btn;
    @FXML
    private Button Add_btn;

    
    @FXML
    private Text OpenPriceWarning_Text;
    @FXML
    private Text HighPriceWarning_Text;
    @FXML
    private Text LowPriceWarning_Text;
    @FXML
    private Text VolumeWarning_Text;
    @FXML
    private Text CloseWarning_Text;
    
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		LocalDate today=LocalDate.now();
		Date_DatePicker.setValue(today);
	}
    
    @FXML
    void Add_btn_Clicked(ActionEvent event) {
    	LocalDate localdate=Date_DatePicker.getValue();
    	String datepickeranswer=localdate.toString();
    	
    	String OpenPriceAnswer=OpenPrice_Textfield.getText();
    	String HighPriceAnswer=HighPrice_Textfield.getText();
    	String LowPriceAnswer=LowPrice_Textfield.getText();
    	String VolumeAnswer=Volume_Textfield.getText();
    	String ClosePriceAnswer=ClosePrice_Textfield.getText();
    	
//    	if (!isNumeric(OpenPrice_Textfield.getText()))
//    	{
//    		OpenPriceWarning_Text.setText("Invalid Answer");
//    		OpenPriceWarning_Text.setVisible(true);
//    		
//    	}
//    	else OpenPriceWarning_Text.setVisible(false);
    	CheckforValidInput(OpenPrice_Textfield,OpenPriceWarning_Text);
    	CheckforValidInput(HighPrice_Textfield,HighPriceWarning_Text);
    	CheckforValidInput(LowPrice_Textfield,LowPriceWarning_Text);
    	CheckforValidInput(Volume_Textfield,VolumeWarning_Text);
    	CheckforValidInput(ClosePrice_Textfield,CloseWarning_Text);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	System.out.println("datepickeranswer:"+datepickeranswer);
    	System.out.println("OpenPriceAnser:"+OpenPriceAnswer);
    	System.out.println("HighPriceAnswer:"+HighPriceAnswer);
    	System.out.println("LowPriceAnswer:"+LowPriceAnswer);
    	System.out.println("VolumeAnswer:"+VolumeAnswer);
    	System.out.println("ClosePriceAnswer:"+ClosePriceAnswer);
    	
    }
    
    
    
    public void CheckforValidInput(TextField textfield,Text warningtext)
    {
    	if (!isNumeric(textfield.getText()))
    	{
    		warningtext.setText("Invalid Answer");
    		warningtext.setVisible(true);
    		
    	}
    	else warningtext.setVisible(false);
    }
    
    
    
    
    
    

    public static boolean isNumeric(String str) { 
    	  try {  
    	    Double.parseDouble(str);  
    	    return true;
    	  } catch(NumberFormatException e){  
    	    return false;  
    	  }  
    	}
    
    
    
    
    
    
    
    
    

    @FXML
    void Date_DatePicker_Clicked(ActionEvent event) {

    	System.out.println("date picker clicked");

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @FXML
    void Back_btn_Clicked(ActionEvent event) {
    	
    	application.Main.SwitchPageto(event, "Menu_Page.fxml");

    }





}
