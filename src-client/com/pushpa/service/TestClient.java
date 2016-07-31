/**
 * 
 */
package com.pushpa.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.namespace.QName;

/**
 * @author pushpa
 *
 */
;
public class TestClient {
	
	public static void main(String args[]) throws Exception{
	
	
	java.net.URL url = new java.net.URL("http://localhost:8080/WebServiceUsingJAXWSRI/greetings?wsdl");
	
	QName q = new QName("http://service.pushpa.com/","GreetingsImpl");//1.for the targetnamespace ending '/' is important,2.service name is from serverconfig <service tag name>
	
	javax.xml.ws.Service stubService = javax.xml.ws.Service.create(url, q);
	
	com.pushpa.service.GreetingsI stub = stubService.getPort(com.pushpa.service.GreetingsI.class);
	
	Date date = new Date();   
	Calendar calendar = GregorianCalendar.getInstance(); 
	calendar.setTime(date);   
	int hours = calendar.get(Calendar.HOUR_OF_DAY);
	String greetings = stub.greetings(hours);
	
	System.out.println(greetings);
	
	}
	

}
