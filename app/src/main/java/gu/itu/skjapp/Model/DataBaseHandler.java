package gu.itu.skjapp.model;

public class DataBaseHandler{
	
	private DataBaseHandler dataBaseHandler = new DataBaseHandler();
	
	private DataBaseHandler(){
		//code for creating connection?
	}
	
	public DataBaseHandler getInstance(){
		return dataBaseHandler;
	}

}