package com.java.addressbook;

import java.util.Scanner;

/**
 * Class to create ContactPerson with different methods
 * 
 */
public class ContactPerson {
	/*
	 * Variable Declaration
	 */
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String phoneNumber;
	String email;
	String zip;

	public ContactPerson() {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.zip = zip;
	}
	
	void addContact() {
		Scanner input = new Scanner(System.in);
		System.out.println("First Name :");
		this.firstName = input.nextLine();
		System.out.println("Last Name :");
		this.lastName = input.nextLine();
		System.out.println("Enter the address :");
		this.address = input.nextLine();
		System.out.println("Enter city : ");
		this.city = input.nextLine();
		System.out.println("Enter state : ");
		this.state = input.nextLine();
		System.out.println("Enter Phone Number : ");
		this.phoneNumber = input.nextLine();
		System.out.println("Enter Email : ");
		this.email = input.nextLine();
		System.out.println("Enter zip : ");
		this.zip = input.nextLine();
	}
	@Override
	public String toString() {
		return "ContactPerson [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", phoneNumber=" + phoneNumber + ", email=" + email + ", zip=" + zip
				+ "]";
	}

}
