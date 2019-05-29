package day45_encapsulation_practice;

import java.util.Random;

public class EtsyAccount {
	private String email, firstName, password;
	
	//constructor 1. No-args
	public EtsyAccount() {
		email = "";
		firstName = "";
		password = "";
	}
	
	//constructor 2. takes 3-args
	public EtsyAccount(String email, String firstName, String password) {
		setEmail(email);
		setFirstName(firstName);
		setPassword(password);
	}
	
	//constructor 3. 2-args.
	/*
	 * email, fisrtName 
	 * password is auto-generated
	 */
	public EtsyAccount(String email, String firstName) {
		setEmail(email);
		setFirstName(firstName);
		this.password = getRandomPassword();
	}
	
	private String getRandomPassword() {
		Random rd = new Random();
		String letters = "abcdefghijklmnopqrstuvxyz1234567890";
		String rdPass = "";
		for(int i = 0; i<8; i++) {
			rdPass+=letters.charAt(rd.nextInt(letters.length()));
		}
		return rdPass;
	}
	/*
	 * valid -> all leters, can have space in the middle, just aplhabetic
	 */
	private boolean isValidFirstName(String firstName) {
		boolean isValid = false;
		if(firstName.isEmpty()) {
			System.out.println("Cannot be blank.");
			return false;
		}
		isValid = (firstName.startsWith(" ")||firstName.endsWith(" "))?false:true;
		for(int i = 0; i<firstName.length(); i++) {
			char ch = firstName.charAt(i);
			isValid = (!Character.isAlphabetic(ch)&&ch!=' ')?false:true;
		}
		return isValid;
	}

	@Override
	public String toString() {
		return "EtsyLogin [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.contains("@")&&email.indexOf("@")>0) {
			this.email = email;
		}else {
			System.out.println("Please enter a valid email address");
		}
//		this.email = (email.contains("@")&&email.indexOf("@")!=0)?(email):("Please enter a valid email address");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(isValidFirstName(firstName)) {
			this.firstName = firstName;
		}else {
			System.out.println("Your first name contains invalid characters.");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password.length() < 6) {
            System.out.println("Must be at least 6 characters.");
        }else {
            this.password = password;
        }
	}
	
	
}
