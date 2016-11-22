/*

	This class is a superclass to AvailableTrip and RequestedTrip,
	and implements general methods for both of these. It contains 
	information about specific trips to and from geographical places.

*/

public class Trip{
	
	private String error;
	private Address start;
	private Address destination;
	private TripDate departure;
	private TripDate arrival;

	public Trip(){}
	
	public Trip(String errorMsg){
		this.error = errorMsg;
	}
	
	public Trip(Address start, Address destination, TripDate departure, TripDate arrival){
		this.start 		 = start;
		this.destination = destination;
		this.departure	 = departure;
		this.arrival	 = arrival;
	}
	
	public void setStart(Address start){
		this.start = start;
	}
	
	public Address getStart(){
		if(start != null){
			return start;
		}else{
			return Address(Error.msg[0]);
		}
	}
	
	public void setDestination(Address destination){
		this.destination = destination;
	}
	
	public Address getDestination(){
		if(destination != null){
			return destination;
		}else{
			return Address(Error.msg[0]);
		}
	}
	
	public void setDeparture(TripDate departure){
		this.departure = departure;
	}

	public TripDate getDeparture(){
		if(departure != null){
			return destination;
		}else{
			return TripDate(Error.msg[0]);
		}
	}
	
	public void setArrival(TripDate arrival){
		this.arrival = arrival;
	}
	
	public TripDate getArrival(){
		if(arrival!= null){
			return arrival;
		}else{
			return TripDate(Error.msg[0]);
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