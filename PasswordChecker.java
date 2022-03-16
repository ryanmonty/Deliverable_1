import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		//Prints input directions
		System.out.println("Please create a password. Password must contain: ");
		System.out.println("\n\u2022  At least one lowercase letter\n ");
		System.out.println("\n\u2022  At least one uppercase letter\n ");
		System.out.println("\n\u2022  A minimum of 7 characters\n ");
		System.out.println("\n\u2022  A maximum of 12 characters\n ");
		System.out.println("\n\u2022  An exclamation point: !\n ");
		
		//User input
		Scanner scnr = new Scanner(System.in);
		String password = scnr.nextLine();
	    
		//Prints password validation response
		 if (correctLength(password)&&upperCase(password)&&lowerCase(password)&&exclamation(password)) {
	            System.out.println("Password valid and accepted");
	        } else {
	            System.out.println();
	            main(args);
	        }
		 scnr.close();
	}
	
	//Checks for length
	public static boolean correctLength(String password) {
		
		int min = 7;
		int max = 12;
		if (password.length() < min || password.length() > max) {
			System.out.println("Error. Password does not fit length requirements");
			return false;
		} else {
			return true;
		}
	}
	//Checks for upper case
	public static boolean upperCase(String password) {
	
		for(int i = 0; i < password.length(); i++) {
		char currentCharacter = password.charAt(i);
		if (Character.isUpperCase(currentCharacter)) {
			return true;
		} 
	} 
		System.out.println("Error. Password requires at least one upper case character");
		return false;
	}
	//Checks for lower case
	public static boolean lowerCase(String password) {
		
		for(int i = 0; i < password.length(); i++) {
			char currentCharacter = password.charAt(i);
			if (Character.isLowerCase(currentCharacter)) {
				return true;
			} 
		} 
		System.out.println("Error. Password requires at least one lower case character");
		return false;
	}
	//Checks for !
	public static boolean exclamation(String password) {
		
			if (password.contains("!")) {
				return true;
		} 
		System.out.println("Error. Password requires special character: !");
		return false;
	}
	
	}

	
	