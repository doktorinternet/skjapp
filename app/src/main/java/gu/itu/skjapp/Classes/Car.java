/*
 * Creates an object containing information regarding vehicles used by members.
 */

public class Car{
	
	private String error;
	private String ID;
	private String licensePlate;
	private String ownerID;
	private String gasUsage;
	private int seats;

	public Car (String errorMsg){
		error = errorMsg + ", USE setAddress(Address, Member) to assign address";
	}
	
	public Car (String ID, String licensePlate, String ownerID, String gasUsage, int seats){

		this.ID = ID;
		this.licensePlate = licensePlate;
		this.ownerID = ownerID;
		this.gasUsage = gasUsage;
		this.seats = seats;

	}	

/* 	
 *	Setters and getters. If there is no value assigned, 
 *	return an errormessage defined in class Error 
 */ 
	
	public String getID() {
		if(ID != null){
			return ID;
		}else{
			return Error.msg[0];
		}
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getLicensePlate() {
		if(licensePlate != null){
			return licensePlate;
		}else{
			return Error.msg[0];
		}
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getOwnerID() {
		if(ownerID != null){
			return ownerID;
		}else{
			return Error.msg[0];
		}
	}

	public void setOwnerID(String ownerID) {
		this.ownerID = ownerID;
	}

	public String getGasUsage() {	
		if(gasUsage != null){
			return gasUsage;
		}else{
			return Error.msg[0];
		}
	}

	public void setGasUsage(String gasUsage) {
		this.gasUsage = gasUsage;
	}

	public int getSeats() {
		if(seats != null){
			return seats;
		}else{
			return Error.msg(0);
		}
	}

	public void setSeats(int seats) { 
		this.seats = seats;
	}

	public String getError(){ // Returns reason for missing data. If none, returns an error
		if(error != null){
			return error;
		}else{
			return Error.msg[0];
		}
	}
}