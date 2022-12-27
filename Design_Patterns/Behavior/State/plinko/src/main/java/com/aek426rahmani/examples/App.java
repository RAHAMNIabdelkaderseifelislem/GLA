/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
package com.aek426rahmani.examples;

// source : https://www.geeksforgeeks.org/state-design-pattern/

// Java program to demonstrate working of
// State Design Pattern

interface MobileAlertState
{
	public void alert(AlertStateContext ctx);
}

class AlertStateContext
{
	private MobileAlertState currentState;

	public AlertStateContext()
	{
		currentState = new Vibration();
	}

	public void setState(MobileAlertState state)
	{
		currentState = state;
	}

	public void alert()
	{
		currentState.alert(this);
	}
}

class Vibration implements MobileAlertState
{
	@Override
	public void alert(AlertStateContext ctx)
	{
		System.out.println("vibration...");
	}

}

class Silent implements MobileAlertState
{
	@Override
	public void alert(AlertStateContext ctx)
	{
		System.out.println("silent...");
	}

}

class StatePattern
{
	public static void main(String[] args)
	{
		AlertStateContext stateContext = new AlertStateContext();
		stateContext.alert();
		stateContext.alert();
		stateContext.setState(new Silent());
		stateContext.alert();
		stateContext.alert();
		stateContext.alert();		
	}
}

// Output:

//vibration...
//vibration...
//silent...
//silent...
//silent...