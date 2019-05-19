package controllers;

import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.text.Text;

public class Range_Page_Controller implements Initializable{
	public static String begin_date;
	public static String End_date;
	
	
	
    @FXML
    private Text Warning_Text;
	
	
    @FXML
    private Text Title_Texr;

    @FXML
    private DatePicker FROM_DatePicker;

    @FXML
    private DatePicker TO_Datepicker;

    @FXML
    private Button Search_btn;
    @FXML
    private Button Back_btn;
    
    
    @FXML
    private Button Graph_btn;
    
    
    @FXML
    void Graph_btn_Clicked(ActionEvent event) {
      	assignDatesandSwitchPageTo(event,"Graphing_Page.fxml");
    }
    
    
    
    
    
    @FXML
    void Back_btn_Clicked(ActionEvent event) 
    {
    	application.Main.SwitchPageto(event, "Menu_Page.fxml");
    }
    
    

    @FXML
    void Search_btn_Clicked(ActionEvent event) 
    {
    	assignDatesandSwitchPageTo(event,"Range_Result_Page.fxml");
    	
    
    }



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		LocalDate today=LocalDate.now();
		TO_Datepicker.setValue(today);
		FROM_DatePicker.setValue(today);
		
	}
    
    
    
    
	public void assignDatesandSwitchPageTo(ActionEvent event,String destination)
	{
		 begin_date= FROM_DatePicker.getValue().toString();
    	 End_date= TO_Datepicker.getValue().toString();
    	 
    	 Date fromdate=new Date();
    	 Date todate=new Date();
    	 
		 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	        try {
	        	fromdate=dateformat.parse(begin_date);
	        	todate=dateformat.parse(End_date);
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	        
	        
	        if (fromdate.before(todate)||fromdate.equals(todate))
	        {
	        	Warning_Text.setVisible(false);
	        	application.Main.SwitchPageto(event, destination);
	        }
	        else {
	        	Warning_Text.setVisible(true);
	        	Warning_Text.setText("From Date is after To Date");
	        
	        }

	}

    
    
    
    
    

}