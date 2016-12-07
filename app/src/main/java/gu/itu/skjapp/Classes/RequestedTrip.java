/*
 *
 * Extends class Trip, adds functionality to store information about
 * trips requested by passengers.
 *
 */
package gu.itu.skjapp.Classes;

import java.util.ArrayList;

public class RequestedTrip extends Trip{
	
	private ArrayList<Member> passengers =  new ArrayList<Member>();

/* 	private Member passenger;
	private Member passenger;
	private Member passenger;
	private Member passenger;
	private Member passenger; */
	private int unregisteredTraveler;

	public RequestedTrip(){
		super();
	}
	
}