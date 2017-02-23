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
	
	
	public static boolean validate(String email){
		boolean pass = true;
		
		if (countChar(email, '@') != 1){
			pass = false;
		}
		else {
			/*if @ sign is first character: FAIL*/
			if (email.indexOf('@') == 0)
				pass = false;
			
			/*if @ sign is last character: FAIL*/
			if (email.indexOf('@') == email.length() - 1)
				pass = false;
		}
		if (countChar(email, '.') < 1)
			pass = false;
		
		return pass;
	}
}
