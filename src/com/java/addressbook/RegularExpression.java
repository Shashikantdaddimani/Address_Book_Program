package com.java.addressbook;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression {
	 Scanner scanner = new Scanner(System.in);
	 public String validFirstName() {
	       /*
	        * Regular expression for FirstName
	        */
		 	
	        System.out.println("The Name Should be Contain One UpperCase and Minimum Two Letters : ");
	        String firstName = scanner.next();
	        boolean status = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(firstName).matches();
	        if (status == true) {
	            System.out.println(firstName + " is valid firstName");
	        } else {
	            System.out.println(firstName + " is not valid firstName");
	            firstName = validFirstName();
	        }
	        return firstName;
	    }

	    public String validLastName() {
	        /*
	         * Regular expression for LastName
	         */
	        System.out.println("The Name Should be Contain One UpperCase and Minimum Two Letters : ");
	        String lastName = scanner.next();
	        boolean status = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(lastName).matches();
	        if (status == true) {
	            System.out.println(lastName + " is valid LastName");
	        } else {
	            System.out.println(lastName + " is not valid LastName");
	            lastName = validLastName();
	        }
	        return lastName;
	    }

	    public String validAddress() {
	       /*
	        * Regular Expression for Address
	        */
	        System.out.println("The Address Should be Contain One UpperCase and Minimum Two Letters : ");
	        String address = scanner.next();
	        boolean status = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(address).matches();
	        if (status == true) {
	            System.out.println(address + " is valid Address");
	        } else {
	            System.out.println(address + " is not valid Address");
	            address = validAddress();
	        }
	        return address;
	    }

	    public String validCity() {
	       /*
	        * Regular Expression for City
	        */
	        System.out.println("The city Should be Contain One UpperCase and Minimum Two Letters : ");
	        String city = scanner.next();
	        boolean status = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(city).matches();
	        if (status == true) {
	            System.out.println(city + " is valid city");
	        } else {
	            System.out.println(city + " is not valid city");
	            city = validCity();
	        }
	        return city;
	    }

	    public String validState() {
	    	 /*
		        * Regular Expression for State
		        */
	        System.out.println("The state Should be Contain One UpperCase and Minimum Two Letters : ");
	        String state = scanner.next();
	        boolean status = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(state).matches();
	        if (status == true) {
	            System.out.println(state + " is valid state");
	        } else {
	            System.out.println(state + " is not valid state");
	            state = validState();
	        }
	        return state;
	    }

	    public String validZip() {
	    	 /*
		      * Regular Expression for Zip.
		      */
	        System.out.println("The Zip code contain six Number: ");
	        String zip = scanner.next();
	        boolean status = Pattern.compile("^[1-9]{1}[0-9]{5}$").matcher(zip).matches();
	        if (status == true) {
	            System.out.println(zip + " is valid zip code");
	        } else {
	            System.out.println(zip + " is not valid zip code");
	            zip = validZip();
	        }
	        return zip;
	    }

	    public String validMobileNumber() {
	    	/*
		      * Regular Expression for Mobile Number
		      */
	        System.out.println("The Mobile Number contains ten digits and First digit contain inbetween 6-9 digit: ");
	        String mobileNumber = scanner.next();
	        boolean status = Pattern.compile("^[6-9]{1}[0-9]{9}$").matcher(mobileNumber).matches();
	        if (status == true) {
	            System.out.println(mobileNumber + " is valid mobile Number");
	        } else {
	            System.out.println(mobileNumber + " is not valid mobile Number");
	            mobileNumber = validMobileNumber();
	        }
	        return mobileNumber;
	    }

	    public String valid_email() {
	    	 /*
	    	  * Regular Expression for EmailId
	    	  */
	        System.out.println("Enter EmailID  shashi0344daddimani@gamil.com :");
	        String email = scanner.next();
	        boolean status = Pattern.compile("^[a-z]{3,}+[0-9]{0,}+[a-z]{1,}+[@]{1}+[10]{0,3}+[a-z]{0,}+[.]{0,1}+[a-z]{0,3}+[,.]{0,1}+[a-z]{0,3}$").matcher(email).matches();
	        if (status == true) {
	            System.out.println(email + " is valid emailId");
	        } else {
	            System.out.println(email + " is not valid emailId");
	            email = valid_email();
	        }
	        return email;
	    }
}
