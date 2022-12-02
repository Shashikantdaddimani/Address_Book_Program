package com.java.addressbook;

import java.util.Scanner;

public class AddressBook {
	Scanner input = new Scanner(System.in);
	
	ContactPerson contactperson = new ContactPerson();
	
	public void addContact() {
		System.out.println("Enter FirstName");
		contactperson.setFirstName(input.next());
		System.out.println("Enter LastName");
		contactperson.setLastname(input.next());
		System.out.println("Enter Address");
		contactperson.setAddress(input.next());
		System.out.println("Enter City");
		contactperson.setCity(input.next());
		System.out.println("Enter State");
		contactperson.setState(input.next());
		System.out.println("Enter Email Id");
		contactperson.setEmailId(input.next());
		System.out.println("Enter Zip");
		contactperson.setZip(input.nextInt());
		System.out.println("Enter Mobile Number");
		contactperson.setMobileNumber(input.nextLong());
	}
	public void showContct() {
		System.out.println(contactperson.toString());
	}
}
