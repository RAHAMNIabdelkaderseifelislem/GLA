/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
package com.aek426rahmani.examples;

// source : https://www.geeksforgeeks.org/chain-responsibility-design-pattern/

public class Chain
{
Processor chain;

public Chain(){
	buildChain();
}

private void buildChain(){
	chain = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));
}

public void process(Number request) {
	chain.process(request);
}

}

abstract class Processor
{
	private Processor nextProcessor;

	public Processor(Processor nextProcessor){
		this.nextProcessor = nextProcessor;
	};
	
	public void process(Number request){
		if(nextProcessor != null)
			nextProcessor.process(request);
	};
}

class Number
{
	private int number;

	public Number(int number)
	{
		this.number = number;
	}

	public int getNumber()
	{
		return number;
	}

}

class NegativeProcessor extends Processor
{
	public NegativeProcessor(Processor nextProcessor){
		super(nextProcessor);
		
	}

	public void process(Number request)
	{
		if (request.getNumber() < 0)
		{
			System.out.println("NegativeProcessor : " + request.getNumber());
		}
		else
		{
			super.process(request);
		}
	}
}

class ZeroProcessor extends Processor
{
	public ZeroProcessor(Processor nextProcessor){
		super(nextProcessor);
	}

	public void process(Number request)
	{
		if (request.getNumber() == 0)
		{
			System.out.println("ZeroProcessor : " + request.getNumber());
		}
		else
		{
			super.process(request);
		}
	}
}

class PositiveProcessor extends Processor
{

	public PositiveProcessor(Processor nextProcessor){
		super(nextProcessor);
	}

	public void process(Number request)
	{
		if (request.getNumber() > 0)
		{
			System.out.println("PositiveProcessor : " + request.getNumber());
		}
		else
		{
			super.process(request);
		}
	}
}

class TestChain
{
	public static void main(String[] args) {
		Chain chain = new Chain();
		
		//Calling chain of responsibility
		chain.process(new Number(90));
		chain.process(new Number(-50));
		chain.process(new Number(0));
		chain.process(new Number(91));
	}
}

// Output :

//PositiveProcessor : 90
//NegativeProcessor : -50
//ZeroProcessor : 0
//PositiveProcessor : 91