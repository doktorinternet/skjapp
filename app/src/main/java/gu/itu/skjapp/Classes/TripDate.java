/*
 *
 * Class extends Date, implements functionality for class Error.
 *
 */
package gu.itu.skjapp.Classes;

import java.util.Date;


public class TripDate extends Date{
	
	public String error;
	
	public TripDate(String errorMsg){
		super(); // Add parameters from Date() 
		error = errorMsg;
	}
	
}