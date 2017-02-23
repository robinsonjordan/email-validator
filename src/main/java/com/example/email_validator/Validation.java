package com.example.email_validator;

public class Validation {
	
	public static int countChar(String email, char letter){
	
	    int count = 0;
	    for (int i=0; i < email.length(); i++){
	    	
	        if (email.charAt(i) == letter){
	        
	             count++;
	        }
	    }
	    return count;
	}
	
	public static int validate(String email){
		int pass = 2;
		
		if (countChar(email, '@') != 1)
			pass--;
		if (countChar(email, '.') < 1)
			pass--;
		
		return pass;
		
	}
}
