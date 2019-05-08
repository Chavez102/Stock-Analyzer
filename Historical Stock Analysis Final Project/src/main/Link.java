package main;

public class Link 
{
	public Stock stock;
	public Link next;
	public Link previous;
	
	
	public Link(Stock stock)
	{
	this.stock=stock;
	next=null;
	previous=null;
	}
	public void displayLink()
	{
		System.out.print(stock.Stringdate+" \n");
	}
	
	

}
