package com.java.addressbook;

/**
 * imports the scanner class of the java.util package
 */
import java.util.Scanner;

public class AddressBookMain {
	/**
	 * program execution starts from main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the AddressBook program");
		/*
		 * Declaring the object
		 */
		AddressBook adrressbook = new AddressBook();
		int option;
		/*
		 * Taking user input using Scanner object
		 */
		Scanner input = new Scanner(System.in);
		/*
		 * switch to select the operations
		 */
		do {
			System.out.println("1. ADD CONTACT \n2. DISPLAY CONTACTS \n3.EDIT CONTACT");
			System.out.println("Enter the operation number");
			option = input.nextInt();

			switch (option) {
			case 1:
				adrressbook.addContact();
				break;
			case 2:
				adrressbook.showContct();
				break;
			case 3:
				adrressbook.editContact();
			default:
				System.out.println("Wrong operation Entered");
				break;
			}

		} while (option < 4);
	}

}
