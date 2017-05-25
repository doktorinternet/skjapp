/*
 * 
 * Handles information regarding users of the application.
 * 
 */
package gu.itu.skjapp.classes;
 
public class Member{

	private static int membersCreated;
	private String error;
	private String IDNumber;
	private String firstName;
	private String surName;
	private Address address;
	private String userName;
	private String passWord;
	private String phoneNr;
	private String eMail;
	private Car car;

	public Member (){membersCreated++;}

	public Member (String errorMsg){
		error = Error.getInstance(0).status;
		membersCreated++;
	}

	public Member (String userName, String passWord){
		this.userName = userName;
		this.passWord = passWord;
		membersCreated++;
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
		membersCreated++;
	}

	/**
	 * This is the current constructor used in register activity:
	 *  - autoincrement id
	 *  - no car
	 *
	 * @param firstName
	 * @param surName
	 * @param userName
	 * @param passWord
	 * @param eMail
	 * @param phoneNr
     * @param address
     */
	public Member (String firstName, String surName, Address address,
	String eMail, String userName, String phoneNr, String passWord){
		IDNumber = Integer.toString(membersCreated);
		this.firstName = firstName;
		this.surName   = surName;
		this.address   = address;
		this.eMail	   = eMail;
		this.userName  = userName;
		this.phoneNr   = phoneNr;
		this.passWord  = passWord;
		membersCreated++;
	}

	public void setIDNumber(String ID){
		IDNumber = ID;
	}

	public String getIDNumber(){
		if (IDNumber != null){
			return IDNumber;
		}else{
			return Error.getInstance(0).status;
		}
	}
	public void setName(String firstName, String surName){
		this.firstName = firstName;
		this.surName = surName;

	}

	public String getName(){
		if (firstName != null && surName != null){
			return firstName.concat(" ").concat(surName);
		}else{
			return Error.getInstance(0).status;
		}
	}


	public void setFirstName(String name){
		firstName = name;
	}

	public String getFirstName(){
		if (firstName != null) {
			return firstName;
		}else{
			return Error.getInstance(0).status;
		}
	}

	public void setSurName(String name){
		surName = name;
	}

	public String getSurName(){
		if (surName != null) {
			return surName;
		}else{
			return Error.getInstance(0).status;
		}
	}


	public void setAddress(Address address){
		this.address = address;
	}

	public Address getAddress(){
		if (address != null){
			return address;
		}else{
			return new Address(Error.getInstance(0).status);
		}
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public String getUserName (){
		if (userName != null){
			return userName;
		}else{
			return Error.getInstance(0).status;
		}
	}
	
	public void setPassWord(String passWord){
		this.passWord = passWord;
	}
	
	public String getPassWord (){
		if (passWord != null){
			return passWord;
		}else{
			return Error.getInstance(0).status;
		}
	}
	
	public void setPhoneNr(String phoneNr){
		this.phoneNr = phoneNr;
	}
	
	public String getPhoneNr (){
		if (phoneNr != null){
			return phoneNr;
		}else{
			return Error.getInstance(0).status;
		}
	}
	
	public void setEMail(String eMail){
		this.eMail = eMail;
	}
	
	public String getEMail (){
		if (eMail != null){
			return eMail;
		}else{
			return Error.getInstance(0).status;
		}
	}
	
	public void setCar(Car car){
		this.car = car;
	}
	
	public Car getCar(){
		if (car != null){			
			return car;
		}else{
			return new Car(Error.getInstance(0).status);
		}
	}

	public String getError(){
		if(error != null){
			return error;
		}else{
			return Error.getInstance(0).status;
		}
	}	
}