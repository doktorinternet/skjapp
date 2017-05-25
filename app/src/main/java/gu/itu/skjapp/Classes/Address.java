/*																
 * 																
 * Creates an object address to assign to members and trips 	
 * 																
 */															
package gu.itu.skjapp.classes;

public class Address{
	
	private String error;
	private String street;
	private String zipCode;
	private String city;
	private String houseNr;

	public Address(){}
	
	public Address(String errorMsg){
		error = errorMsg.concat(", USE setAddress(Address, Member) to assign address");
	}
	
	/*public Address(String city){
		this.city = city;
	}

	public Address(String street){
		this.street = street;
	}

	public Address(String street, String houseNr){
		this.street  = street;
		this.houseNr = houseNr;
	}
	
	public Address(String city, String street){
		this.city 	= city;
		this.street = street;
	}

	public Address(String city, String street, String houseNr){
		this.houseNr = houseNr;
		this.city 	 = city;
		this.street  = street;
	}*/

	public Address(String street, String houseNr, String zipCode, String city){
		this.street  = street;
		this.houseNr = houseNr;
		this.zipCode = zipCode;
		this.city	 = city;
	}
	
	public void setStreet(String street){
		this.street = street;
	}
	
	public String getStreet(){
		if (street != null){
			return street;
		}else{
			return Error.getInstance(0).status;
		}
	}
	
	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}

	public String getZipCode(){
		if (zipCode != null){			
			return zipCode;
		}else{
			return Error.getInstance(0).status;
		}
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public String getCity(){
		if (city != null){			
			return city;
		}else{
			return Error.getInstance(0).status;
		}
	}
	
	public void setHouseNr(String houseNr){
		this.houseNr = houseNr;
	}	
	
	public String getHouseNr(){
		if (houseNr != null){			
			return houseNr;
		}else{
			return Error.getInstance(0).status;
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