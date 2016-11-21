/*
 * Creates an object address to assign to members
 * 
 *
 */

public class Address{
	
	private String error;
	private String street;
	private String zipCode;
	private String city;
	/*private Member member;?*/
	private int houseNr;
	
	public Address(String errorMsg){
		error = errorMsg + ", USE setAddress(Address, Member) to assign address";
	}
}