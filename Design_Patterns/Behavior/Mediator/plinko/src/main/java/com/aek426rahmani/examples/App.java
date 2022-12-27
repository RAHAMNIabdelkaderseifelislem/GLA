/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
package com.aek426rahmani.examples;

// source : https://www.geeksforgeeks.org/mediator-design-pattern/

class ATCMediator implements IATCMediator
{
	private Flight flight;
	private Runway runway;
	public boolean land;

	public void registerRunway(Runway runway)
	{
		this.runway = runway;
	}

	public void registerFlight(Flight flight)
	{
		this.flight = flight;
	}

	public boolean isLandingOk()
	{
		return land;
	}

	@Override
	public void setLandingStatus(boolean status)
	{
		land = status;
	}
}

interface Command
{
	void land();
}

interface IATCMediator
{

	public void registerRunway(Runway runway);

	public void registerFlight(Flight flight);

	public boolean isLandingOk();

	public void setLandingStatus(boolean status);
}

class Flight implements Command
{
	private IATCMediator atcMediator;

	public Flight(IATCMediator atcMediator)
	{
		this.atcMediator = atcMediator;
	}

	public void land()
	{
		if (atcMediator.isLandingOk())
		{
			System.out.println("Successfully Landed.");
			atcMediator.setLandingStatus(true);
		}
		else
			System.out.println("Waiting for landing.");
	}

	public void getReady()
	{
		System.out.println("Ready for landing.");
	}

}

class Runway implements Command
{
	private IATCMediator atcMediator;

	public Runway(IATCMediator atcMediator)
	{
		this.atcMediator = atcMediator;
		atcMediator.setLandingStatus(true);
	}

	@Override
	public void land()
	{
		System.out.println("Landing permission granted.");
		atcMediator.setLandingStatus(true);
	}

}

class MediatorDesignPattern
{
	public static void main(String args[])
	{

		IATCMediator atcMediator = new ATCMediator();
		Flight sparrow101 = new Flight(atcMediator);
		Runway mainRunway = new Runway(atcMediator);
		atcMediator.registerFlight(sparrow101);
		atcMediator.registerRunway(mainRunway);
		sparrow101.getReady();
		mainRunway.land();
		sparrow101.land();
		
	}
}


// Output:
//Ready for landing.
//Landing permission granted.
//Successfully Landed.