/*
 *
 *	This class is a superclass to AvailableTrip and RequestedTrip,
 *	and implements general methods for both of these. It contains 
 *	information about specific trips to and from geographical places.
 *
 */
package gu.itu.skjapp.classes;
 
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
			return new Address(Error.getInstance(0).status);
		}
	}
	
	public void setDestination(Address destination){
		this.destination = destination;
	}
	
	public Address getDestination(){
		if(destination != null){
			return destination;
		}else{
			return new Address(Error.getInstance(0).status);
		}
	}
	
	public void setDeparture(TripDate departure){
		this.departure = departure;
	}

	public TripDate getDeparture(){
		if(departure != null){
			return departure;
		}else{
			return new TripDate(Error.getInstance(0).status);
		}
	}
	
	public void setArrival(TripDate arrival){
		this.arrival = arrival;
	}
	
	public TripDate getArrival(){
		if(arrival!= null){
			return arrival;
		}else{
			return new TripDate(Error.getInstance(0).status);
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