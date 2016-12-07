package gu.itu.skjapp.Model;

import java.util.ArrayList;

public class DataBaseHandler{
	
	private DataBaseHandler dataBaseHandler = new DataBaseHandler();
	
	private DataBaseHandler(){
		//code for creating connection?
	}
	
	public DataBaseHandler getInstance(){
		return dataBaseHandler;
	}

}