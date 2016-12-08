/*
 *
 * Handles errors and gives errormessages. 
 * Add functionaliy for exceptions?
 *
 */
package gu.itu.skjapp.Classes;

 
public class Error{
	
	private static Error error = new Error();
	
	public String status;
	
	private static String[] msg = {
		"ERROR 0: NO DATA REGISTERED",
		"ERROR 1: BLABLABLAFAULT",
		"ERROR 2: BLABLABLAFAULT",
		"ERROR 3: BLABLABLAFAULT"
	};
	
	private Error(){}
	
	public static Error getInstance(int curStatus){
		error.status = msg[curStatus];
		return error;
	}
	
	
}