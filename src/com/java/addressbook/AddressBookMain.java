package com.java.addressbook;

public class AddressBookMain {
	/**
	 * program execution starts from main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the AddressBook program");
		ContactPerson Refernce = new ContactPerson();
		System.out.println(Refernce.toString());
	}

}
