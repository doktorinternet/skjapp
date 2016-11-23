interface LoginScreenFunction{
	
	/* returns 0 if successful, otherwise 
	   an error from class Error
	*/
	abstract int checkData(String userName, String passWord); 
	
	
}