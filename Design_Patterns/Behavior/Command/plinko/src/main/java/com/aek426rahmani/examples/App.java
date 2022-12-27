/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
package com.aek426rahmani.examples;

// source : https://www.geeksforgeeks.org/command-pattern/

// A simple Java program to demonstrate
// implementation of Command Pattern using
// a remote control example.

// An interface for command
interface Command
{
	public void execute();
}

// Light class and its corresponding command
// classes
class Light
{
	public void on()
	{
		System.out.println("Light is on");
	}
	public void off()
	{
		System.out.println("Light is off");
	}
}
class LightOnCommand implements Command
{
	Light light;

	// The constructor is passed the light it
	// is going to control.
	public LightOnCommand(Light light)
	{
	this.light = light;
	}
	public void execute()
	{
	light.on();
	}
}
class LightOffCommand implements Command
{
	Light light;
	public LightOffCommand(Light light)
	{
		this.light = light;
	}
	public void execute()
	{
		light.off();
	}
}

// Stereo and its command classes
class Stereo
{
	public void on()
	{
		System.out.println("Stereo is on");
	}
	public void off()
	{
		System.out.println("Stereo is off");
	}
	public void setCD()
	{
		System.out.println("Stereo is set " +
						"for CD input");
	}
	public void setDVD()
	{
		System.out.println("Stereo is set"+
						" for DVD input");
	}
	public void setRadio()
	{
		System.out.println("Stereo is set" +
						" for Radio");
	}
	public void setVolume(int volume)
	{
	// code to set the volume
	System.out.println("Stereo volume set"
						+ " to " + volume);
	}
}
class StereoOffCommand implements Command
{
	Stereo stereo;
	public StereoOffCommand(Stereo stereo)
	{
		this.stereo = stereo;
	}
	public void execute()
	{
	stereo.off();
	}
}
class StereoOnWithCDCommand implements Command
{
	Stereo stereo;
	public StereoOnWithCDCommand(Stereo stereo)
	{
		this.stereo = stereo;
	}
	public void execute()
	{
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
}

// A Simple remote control with one button
class SimpleRemoteControl
{
	Command slot; // only one button

	public SimpleRemoteControl()
	{
	}

	public void setCommand(Command command)
	{
		// set the command the remote will
		// execute
		slot = command;
	}

	public void buttonWasPressed()
	{
		slot.execute();
	}
}

// Driver class
class RemoteControlTest
{
	public static void main(String[] args)
	{
		SimpleRemoteControl remote =
				new SimpleRemoteControl();
		Light light = new Light();
		Stereo stereo = new Stereo();

		// we can change command dynamically
		remote.setCommand(new
					LightOnCommand(light));
		remote.buttonWasPressed();
		remote.setCommand(new
				StereoOnWithCDCommand(stereo));
		remote.buttonWasPressed();
		remote.setCommand(new
				StereoOffCommand(stereo));
		remote.buttonWasPressed();
	}
}

// Output:

//Light is on
//Stereo is on
//Stereo is set for CD input
//Stereo volume set to 11
//Stereo is off