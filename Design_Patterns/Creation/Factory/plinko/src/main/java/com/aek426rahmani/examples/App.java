/*
 * created by: aek426rahmani
 * date : 27-12-2022
 */
package com.aek426rahmani.examples;

// source : https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/

public interface Notification {
	void notifyUser();
}


public class SMSNotification implements Notification {

	@Override
	public void notifyUser()
	{
		// TODO Auto-generated method stub
		System.out.println("Sending an SMS notification");
	}
}


public class EmailNotification implements Notification {

	@Override
	public void notifyUser()
	{
		// TODO Auto-generated method stub
		System.out.println("Sending an e-mail notification");
	}
}

public class PushNotification implements Notification {

	@Override
	public void notifyUser()
	{
		// TODO Auto-generated method stub
		System.out.println("Sending a push notification");
	}
}

public class NotificationFactory {
	public Notification createNotification(String channel)
	{
		if (channel == null || channel.isEmpty())
			return null;
		switch (channel) {
		case "SMS":
			return new SMSNotification();
		case "EMAIL":
			return new EmailNotification();
		case "PUSH":
			return new PushNotification();
		default:
			throw new IllegalArgumentException("Unknown channel "+channel);
		}
	}
}

public class NotificationService {
	public static void main(String[] args)
	{
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("SMS");
		notification.notifyUser();
	}
}


/*
 * Real-time examples:

This design pattern has been widely used in JDK, such as 

1. getInstance() method of java.util.Calendar, NumberFormat, and ResourceBundle 
        uses factory method design pattern. 
2. All the wrapper classes like Integer, Boolean etc, in Java uses this pattern 
        to evaluate the values using valueOf() method. 
3. java.nio.charset.Charset.forName(), java.sql.DriverManager#getConnection(), 
        java.net.URL.openConnection(), java.lang.Class.newInstance(), java.lang.Class.forName() 
        are some of their example where factory method design pattern has been used.
 */
