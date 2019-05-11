package main;




import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Stockbag {
	@JsonProperty("Meta Data")
	 MetaData  metaData;
	@JsonProperty("Stockbag")
	List<Stock> stocklist;
	
	public Stockbag()
	{}
	
	public List<Stock>getStocks(){
		return stocklist;
	}
	
	public void setStocks(List<Stock> stock) {
		this.stocklist=stock;
	}
}
