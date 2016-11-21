public class Member{
	
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
	
	public void setAddress(Address address, Member member){
		member.address = address;
	}
	
	public void setUserName(String userName, Member member){
		member.userName = userName;
	}
	
	public void setPassWord(String passWord, Member member){
		member.passWord = passWord;
	}
	
	public void setPhoneNr(String phoneNr, Member member){
		member.phoneNr = phoneNr;
	}
	
	public void setEMail(String eMail, Member member){
		member.eMail = eMail;
	}
	
	public void setCar(Car car, Member member){
		member.car = car;
	}
	
	public String getUserName (Member member){
		if (member.userName != null){
			return member.userName;
		}else{
			return Error.errorMsg[0];
		}
	}
	
	public String getPassWord (Member member){
		if (member.passWord != null){
			return member.passWord;
		}else{
			return Error.errorMsg[0];
		}
	}
	
	public Address getAddress(Member member){
		if (member.address != null){
			return member.address;
		}else{
			return Address(Error.errorMsg[0]);
		}
	}
	
	public Car getCar(Member member){
		if (member.car != null){			
			return member.car;
		}else{
			return Car(Error.errorMsg[0]);

	}
	
}