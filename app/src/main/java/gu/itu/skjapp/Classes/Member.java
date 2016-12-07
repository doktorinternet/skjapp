/*
 * 
 * Handles information regarding users of the application.
 * 
 */
package gu.itu.skjapp.Classes;
 
public class Member{
	
	private Error error;
	private String IDNumber;
	private String firstName;
	private String surName;
	private Address address;
	private String userName;
	private String passWord;
	private String phoneNr;
	private String eMail;
	private Car car;
	
	public Member (){}
	
	public Member (String errorMsg){
		error = errorMsg;
	}
	
	public Member (String userName, String passWord){
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public Member (String ID, String firstName, String surName, String userName, String passWord, 
				   String eMail, String phoneNr, Address address, Car car){
		this.IDNumber  = ID;
		this.firstName = firstName;
		this.surName   = surName;
		this.address   = address;
		this.userName  = userName;
		this.passWord  = passWord;
		this.phoneNr   = phoneNr;
		this.eMail	   = eMail;
		this.car	   = car;
	}
	
	public void setAddress(Address address){
		this.address = address;
	}

	public Address getAddress(){
		if (address != null){
			return address;
		}else{
			return Address(Error.msg[0]);
		}
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public String getUserName (){
		if (userName != null){
			return userName;
		}else{
			return Error.msg[0];
		}
	}
	
	public void setPassWord(String passWord){
		this.passWord = passWord;
	}
	
	public String getPassWord (){
		if (passWord != null){
			return passWord;
		}else{
			return Error.msg[0];
		}
	}
	
	public void setPhoneNr(String phoneNr){
		this.phoneNr = phoneNr;
	}
	
	public String getPhoneNr (){
		if (phoneNr != null){
			return phoneNr;
		}else{
			return Error.msg[0];
		}
	}
	
	public void setEMail(String eMail){
		this.eMail = eMail;
	}
	
	public String getEMail (){
		if (eMail != null){
			return eMail;
		}else{
			return Error.msg[0];
		}
	}
	
	public void setCar(Car car){
		this.car = car;
	}
	
	public Car getCar(){
		if (car != null){			
			return car;
		}else{
			return Car(Error.msg[0]);
		}
	}

	public String getError(){
		if(error != null){
			return error;
		}else{
			return Error.msg[0];
		}
	}	
}