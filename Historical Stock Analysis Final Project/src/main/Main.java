package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.regex.Matcher;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
	//checking if git works
	static String key="AJTUPL59H6NMOMYH";

	public static void main(String[] args) {

		Stockbag bag=new Stockbag();
		DoublyLinkedList Linklist=new DoublyLinkedList();
		String Jsonstr=GetJsonString("TSLA");
		
		
		//System.out.println(str);
	
		
		
		try {
				ObjectMapper mapper=new ObjectMapper();
				bag = mapper.readValue(Jsonstr.toString(), Stockbag.class);
		} catch (Exception e) {
										// TODO Auto-generated catch block
				e.printStackTrace();
		}
		HashMap<Integer,Stock> map=new HashMap<>(bag.stocklist.size()*2);
		
		
		
								
		for(int i=0;i<bag.stocklist.size();i++) {
			Stock stock=new Stock(bag.stocklist.get(i).Stringdate,
								  bag.stocklist.get(i).Stringopen,
								  bag.stocklist.get(i).Stringhigh,
								  bag.stocklist.get(i).Stringlow,
								  bag.stocklist.get(i).Stringclose,
								  bag.stocklist.get(i).Stringvolume
								  );
			map.put(i,stock);
		}
		
		System.out.println(map.size());
		System.out.println(map.get(1).Stringdate);
		
		
		//Linklist.displayForward();
		
	}
	
	
	
	public static String GetJsonString(String Stocksymbol)
	{
		String str="nothing";
	
		try {
			String symbol=Stocksymbol;	//options Any stock's symbol 
//   https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=TSLA&interval=5min&apikey=AJTUPL59H6NMOMYH&outputsize=compact
			String url="https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol="+symbol+
			"&interval=5min&apikey="+key+ 
			"&outputsize=compact";
			
			URL obj=new URL(url);
			HttpURLConnection con=(HttpURLConnection)obj.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", "Mozilla/5.0");
			
			BufferedReader in= new BufferedReader(
					new InputStreamReader(con.getInputStream()));
					
			String inputLine;
			StringBuffer response=new StringBuffer();

			
			String bracketTochange="    }";
			while ((inputLine=in.readLine())!=null) {
				
				
				if(isValidDate(inputLine.replaceAll("\"", ""))) {	//changes format from  "2019-04-22":{ -> "{ \n "0. date":2018-11-29
					inputLine=inputLine.replaceAll("\"", "");
					inputLine=inputLine.replaceAll("\\: \\{", "");
					inputLine=inputLine.replaceAll("\\s+", "");	
					inputLine= "        {\n            \"0. date\":"+"\""+inputLine+"\",";
					//2019-04-22": { -> {
					//2019-04-22"  -> date:	
				}
				
				if(inputLine.equals(bracketTochange))
				inputLine="    ]";
				
				response.append(inputLine+"\n");
			}
			in.close();

			str=response.toString();
			
			str=str.replace("\"Time Series (Daily)\": {", "\"Stockbag\": [");
		
		}catch(Exception e) {
		e.printStackTrace();
		}
		return str;
		
		
	}
	
	
	
	
	
	
	
	
	public static boolean isValidDate(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }

}
