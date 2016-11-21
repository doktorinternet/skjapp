

public class Car{

	private String ID;
	private String licensePlate;
	private String ownerID;
	private String gasUsage;
	private int seats;

	public Car (String ID, String licensePlate, String ownerID, String gasUsage, int seats){

		this.ID = ID;
		this.licensePlate = licensePlate;
		this.ownerID = ownerID;
		this.gasUsage = gasUsage;
		this.seats = seats;

	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(String ownerID) {
		this.ownerID = ownerID;
	}

	public String getGasUsage() {
		return gasUsage;
	}

	public void setGasUsage(String gasUsage) {
		this.gasUsage = gasUsage;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}