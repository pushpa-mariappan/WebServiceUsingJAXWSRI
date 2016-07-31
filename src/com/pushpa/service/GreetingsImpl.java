/**
 * 
 */
package com.pushpa.service;

import javax.jws.WebService;

/**
 * @author pushpa
 *
 */
@WebService(endpointInterface = "com.pushpa.service.GreetingsI", serviceName = "GreetingsImpl")
public class GreetingsImpl implements GreetingsI {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pushpa.service.GreetingsI#greetings()
	 */
	@Override
	public String greetings(int hour) {

		String greetings = "Hello!!";

		if (hour < 12)
			greetings = "Good Morning!";
		else if (hour < 17 && hour > 12)
			greetings = "Good Afternoon";
		else
			greetings = "Good Evening";
		return greetings;
	}

}