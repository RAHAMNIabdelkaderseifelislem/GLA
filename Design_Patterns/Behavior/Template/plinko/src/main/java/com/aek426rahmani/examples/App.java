/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
package com.aek426rahmani.examples;

// source : https://www.geeksforgeeks.org/template-method-design-pattern/

abstract class OrderProcessTemplate
{
	public boolean isGift;

	public abstract void doSelect();

	public abstract void doPayment();

	public final void giftWrap()
	{
		try
		{
			System.out.println("Gift wrap successful");
		}
		catch (Exception e)
		{
			System.out.println("Gift wrap unsuccessful");
		}
	}

	public abstract void doDelivery();

	public final void processOrder(boolean isGift)
	{
		doSelect();
		doPayment();
		if (isGift) {
			giftWrap();
		}
		doDelivery();
	}
}


class NetOrder extends OrderProcessTemplate
{
	@Override
	public void doSelect()
	{
		System.out.println("Item added to online shopping cart");
		System.out.println("Get gift wrap preference");
		System.out.println("Get delivery address.");
	}

	@Override
	public void doPayment()
	{
		System.out.println
				("Online Payment through Netbanking, card or Paytm");
	}

	@Override
	public void doDelivery()
	{
		System.out.println
					("Ship the item through post to delivery address");
	}

}

class StoreOrder extends OrderProcessTemplate
{

	@Override
	public void doSelect()
	{
		System.out.println("Customer chooses the item from shelf.");
	}

	@Override
	public void doPayment()
	{
		System.out.println("Pays at counter through cash/POS");
	}

	@Override
	public void doDelivery()
	{
		System.out.println("Item delivered to in delivery counter.");
	}

}

class TemplateMethodPatternClient
{
	public static void main(String[] args)
	{
		OrderProcessTemplate netOrder = new NetOrder();
		netOrder.processOrder(true);
		System.out.println();
		OrderProcessTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder(true);
	}
}


// Output:

//Item added to online shopping cart
//Get gift wrap preference
//Get delivery address.
//Online Payment through Netbanking, card or Paytm
//Gift wrap successful
//Ship the item through post to delivery address

//Customer chooses the item from shelf.
//Pays at counter through cash/POS
//Gift wrap successful
//Item delivered to in delivery counter.
