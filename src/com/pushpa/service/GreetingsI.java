/**
 * 
 */
package com.pushpa.service;

import javax.jws.WebService;

/**
 * @author pushpa
 *
 */
@WebService
public interface GreetingsI {

	public String greetings(int hour);
	
}
