/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
package com.aek426rahmani.examples;

// source : https://www.geeksforgeeks.org/prototype-design-pattern/
// A Java program to demonstrate working of
// Prototype Design Pattern with example
// of a ColorStore class to store existing objects.

import java.util.HashMap;
import java.util.Map;

// Cloneable interface allows the implementing class to
// have its objects to be cloned instead of using a new operator.
// It is available in Java.lang.Cloneable.

abstract class Color implements Cloneable
{
	
	protected String colorName;
	
	abstract void addColor();
	
	public Object clone()
	{
		Object clone = null;
		try
		{
			clone = super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return clone;
	}
}

class blueColor extends Color
{
	public blueColor()
	{
		this.colorName = "blue";
	}

	@Override
	void addColor()
	{
		System.out.println("Blue color added");
	}
	
}

class blackColor extends Color{

	public blackColor()
	{
		this.colorName = "black";
	}

	@Override
	void addColor()
	{
		System.out.println("Black color added");
	}
}

class ColorStore {

	private static Map<String, Color> colorMap = new HashMap<String, Color>();
	
	static
	{
		colorMap.put("blue", new blueColor());
		colorMap.put("black", new blackColor());
	}
	
	public static Color getColor(String colorName)
	{
		return (Color) colorMap.get(colorName).clone();
	}
}


// Driver class
class Prototype
{
	public static void main (String[] args)
	{
		ColorStore.getColor("blue").addColor();
		ColorStore.getColor("black").addColor();
		ColorStore.getColor("black").addColor();
		ColorStore.getColor("blue").addColor();
	}
}

// output:
// Blue color added
// Black color added
// Black color added
// Blue color added