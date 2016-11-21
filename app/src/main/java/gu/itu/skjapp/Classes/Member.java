public class Member{
	
	private String IDNumber;
	private String firstName;
	private String surName;
	private Address address;
	private String userName;
	private String passWord;
	private String phoneNr;
	private String eMail;
	private Car car;
	
	public Member (){
		
	}
	
	public Member (String userName, String passWord){
		
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
	
	public Member (){
		
	}
	
	public Member (){
		
	}
	
	void setAddress(Address address, Member member){
		member.address = address;
	}
	
	void setUserName(String userName, Member member){
		member.userName = userName;
	}
	
	void setPassWord(String passWord, Member member){
		member.passWord = passWord;
	}
	
	void setPhoneNr(String phoneNr, Member member){
		member.phoneNr = phoneNr;
	}
	
	void setEMail(String eMail, Member member){
		member.eMail = eMail;
	}
	
	void setCar(Car car, Member member){
		member.car = car;
	}
	
	
	
	
	
}