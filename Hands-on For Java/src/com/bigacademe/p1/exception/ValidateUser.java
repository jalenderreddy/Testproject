package com.bigacademe.p1.exception;

public class ValidateUser {
	

	

	public static boolean checkUser(String username , String password) throws LoginException  {
		if(username=="admin"&& password=="admin123") {
			return true;
			}
		else if(username==null&& password==null) {
			LoginException le = new LoginException();
			throw le;
			
		}
		
		return false;	
	} 
}
		